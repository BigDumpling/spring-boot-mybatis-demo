package com.ligq.study.mybatis.demo.model;

public class TCreditLimitLog {
    private String seqId;

    private String creditLimitId;

    private String lesseeId;

    private String productId;

    private String bizId;

    private String opType;

    private Long opAmt;

    private Long oldLimitAmt;

    private Long newLimitAmt;

    private Long dueDay;

    private Long createTime;

    private String createUser;

    private Integer handleNumber;

    public String getSeqId() {
        return seqId;
    }

    public void setSeqId(String seqId) {
        this.seqId = seqId;
    }

    public String getCreditLimitId() {
        return creditLimitId;
    }

    public void setCreditLimitId(String creditLimitId) {
        this.creditLimitId = creditLimitId;
    }

    public String getLesseeId() {
        return lesseeId;
    }

    public void setLesseeId(String lesseeId) {
        this.lesseeId = lesseeId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType;
    }

    public Long getOpAmt() {
        return opAmt;
    }

    public void setOpAmt(Long opAmt) {
        this.opAmt = opAmt;
    }

    public Long getOldLimitAmt() {
        return oldLimitAmt;
    }

    public void setOldLimitAmt(Long oldLimitAmt) {
        this.oldLimitAmt = oldLimitAmt;
    }

    public Long getNewLimitAmt() {
        return newLimitAmt;
    }

    public void setNewLimitAmt(Long newLimitAmt) {
        this.newLimitAmt = newLimitAmt;
    }

    public Long getDueDay() {
        return dueDay;
    }

    public void setDueDay(Long dueDay) {
        this.dueDay = dueDay;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Integer getHandleNumber() {
        return handleNumber;
    }

    public void setHandleNumber(Integer handleNumber) {
        this.handleNumber = handleNumber;
    }
}