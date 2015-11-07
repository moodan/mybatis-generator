package com.wangyin.sis.account.entity;

import java.math.BigDecimal;
import java.util.Date;

public class SisSetCycle {
    private String setCycleId;

    private String setCycleName;

    private String setCycleType;

    private BigDecimal delayNum;

    private BigDecimal setCycleTimes;

    private String forceSetDate;

    private String modifier;

    private Date createdDate;

    private Date modifiedDate;

    private BigDecimal setCycleStartDate;

    private String manySetTimes;

    public String getSetCycleId() {
        return setCycleId;
    }

    public void setSetCycleId(String setCycleId) {
        this.setCycleId = setCycleId == null ? null : setCycleId.trim();
    }

    public String getSetCycleName() {
        return setCycleName;
    }

    public void setSetCycleName(String setCycleName) {
        this.setCycleName = setCycleName == null ? null : setCycleName.trim();
    }

    public String getSetCycleType() {
        return setCycleType;
    }

    public void setSetCycleType(String setCycleType) {
        this.setCycleType = setCycleType == null ? null : setCycleType.trim();
    }

    public BigDecimal getDelayNum() {
        return delayNum;
    }

    public void setDelayNum(BigDecimal delayNum) {
        this.delayNum = delayNum;
    }

    public BigDecimal getSetCycleTimes() {
        return setCycleTimes;
    }

    public void setSetCycleTimes(BigDecimal setCycleTimes) {
        this.setCycleTimes = setCycleTimes;
    }

    public String getForceSetDate() {
        return forceSetDate;
    }

    public void setForceSetDate(String forceSetDate) {
        this.forceSetDate = forceSetDate == null ? null : forceSetDate.trim();
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public BigDecimal getSetCycleStartDate() {
        return setCycleStartDate;
    }

    public void setSetCycleStartDate(BigDecimal setCycleStartDate) {
        this.setCycleStartDate = setCycleStartDate;
    }

    public String getManySetTimes() {
        return manySetTimes;
    }

    public void setManySetTimes(String manySetTimes) {
        this.manySetTimes = manySetTimes == null ? null : manySetTimes.trim();
    }
}