package com.ligq.study.mybatis.demo.model;

import java.math.BigDecimal;
import java.util.Date;

public class TCreditLimitInfo {
    private String seqId;

    private String lesseeId;

    private String customerId;

    private String idNo;

    private String productId;

    private String productCode;

    private Long limitAmt;

    private Long loanLimitAmt;

    private Long unavailableLimitAmt;

    private Date dueDay;

    private String status;

    private String interestType;

    private BigDecimal feeRate;

    private String repayType;

    private String loopFlag;

    private Long createTime;

    private Long updateTime;

    private String createUser;

    private String updateUser;

    private String remark;

    private String outBizId;

    public String getSeqId() {
        return seqId;
    }

    public void setSeqId(String seqId) {
        this.seqId = seqId;
    }

    public String getLesseeId() {
        return lesseeId;
    }

    public void setLesseeId(String lesseeId) {
        this.lesseeId = lesseeId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Long getLimitAmt() {
        return limitAmt;
    }

    public void setLimitAmt(Long limitAmt) {
        this.limitAmt = limitAmt;
    }

    public Long getLoanLimitAmt() {
        return loanLimitAmt;
    }

    public void setLoanLimitAmt(Long loanLimitAmt) {
        this.loanLimitAmt = loanLimitAmt;
    }

    public Long getUnavailableLimitAmt() {
        return unavailableLimitAmt;
    }

    public void setUnavailableLimitAmt(Long unavailableLimitAmt) {
        this.unavailableLimitAmt = unavailableLimitAmt;
    }

    public Date getDueDay() {
        return dueDay;
    }

    public void setDueDay(Date dueDay) {
        this.dueDay = dueDay;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInterestType() {
        return interestType;
    }

    public void setInterestType(String interestType) {
        this.interestType = interestType;
    }

    public BigDecimal getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(BigDecimal feeRate) {
        this.feeRate = feeRate;
    }

    public String getRepayType() {
        return repayType;
    }

    public void setRepayType(String repayType) {
        this.repayType = repayType;
    }

    public String getLoopFlag() {
        return loopFlag;
    }

    public void setLoopFlag(String loopFlag) {
        this.loopFlag = loopFlag;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOutBizId() {
        return outBizId;
    }

    public void setOutBizId(String outBizId) {
        this.outBizId = outBizId;
    }
}