package com.ligq.study.mybatis.demo.dao;

import com.ligq.study.mybatis.demo.model.TCreditLimitInfo;
import org.apache.ibatis.annotations.Param;

public interface TCreditLimitInfoMapper {

    TCreditLimitInfo selectByCustomerId(@Param("customerId") String customerId);

    int updateByPrimaryKey(TCreditLimitInfo record);
}