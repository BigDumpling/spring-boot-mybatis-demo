package com.ligq.study.mybatis.demo.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ligq.study.mybatis.demo.dao.TCreditLimitInfoMapper;
import com.ligq.study.mybatis.demo.dao.TCreditLimitLogMapper;
import com.ligq.study.mybatis.demo.model.LimitInfoModel;
import com.ligq.study.mybatis.demo.model.TCreditLimitInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Service
public class CreditLimitInfoService {

    private TCreditLimitInfoMapper tCreditLimitInfoMapper;
    private TCreditLimitLogMapper tCreditLimitLogMapper;
    private ObjectMapper objectMapper;

    public CreditLimitInfoService(TCreditLimitInfoMapper tCreditLimitInfoMapper,
                                  TCreditLimitLogMapper tCreditLimitLogMapper,
                                  ObjectMapper objectMapper) {
        this.tCreditLimitInfoMapper = tCreditLimitInfoMapper;
        this.tCreditLimitLogMapper = tCreditLimitLogMapper;
        this.objectMapper = objectMapper;
    }

    public void processLimitInfo() throws JsonProcessingException {
        LimitInfoModel model1 = new LimitInfoModel("201907191407290000970250039", 500000L);
        LimitInfoModel model2 = new LimitInfoModel("201907191457241691930250061", 500000L);
        LimitInfoModel model3 = new LimitInfoModel("201907210753395810970250086", 200000L);
        LimitInfoModel model4 = new LimitInfoModel("201907241024545890970250133", 250000L);
        LimitInfoModel model5 = new LimitInfoModel("201907301029490760970250170", 600000L);
        LimitInfoModel model6 = new LimitInfoModel("201907301746404071930250252", 800000L);
        LimitInfoModel model7 = new LimitInfoModel("201908191916251330970250027", 600000L);
        LimitInfoModel model8 = new LimitInfoModel("201908251936228740970250055", 600000L);
        LimitInfoModel model9 = new LimitInfoModel("201909051517363711930250079", 1000000L);
        LimitInfoModel model10 = new LimitInfoModel("201909121045208591930250090", 700000L);
        LimitInfoModel model11 = new LimitInfoModel("201909161057355980970250084", 600000L);
        LimitInfoModel model12 = new LimitInfoModel("201909261741579071930250129", 200000L);

        List<LimitInfoModel> limitModelList = Arrays.asList(model1, model2, model3, model4, model5, model6, model7, model8, model9, model10, model11, model12);
        for (LimitInfoModel m : limitModelList) {
            TCreditLimitInfo creditLimitInfo = tCreditLimitInfoMapper.selectByCustomerId(m.getCustomerId());
            log.info("creditLimitInfo == {}", objectMapper.writeValueAsString(creditLimitInfo));
            StringBuilder builder = new StringBuilder("UPDATE t_credit_limit_info SET REMARK = concat(concat('20191015手动刷新额度(', LIMIT_AMT), '至")
                    .append(m.getLimitAmt() * 10000)
                    .append(")'), LIMIT_AMT =")
                    .append(m.getLimitAmt() * 10000)
                    .append(", UPDATE_TIME = UNIX_TIMESTAMP() * 1000 WHERE CUSTOMER_ID = '")
                    .append(m.getCustomerId());
        }
    }

}
