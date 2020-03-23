package com.junling.mis.model;

import java.math.BigDecimal;
import java.util.Date;

public class pglProductDutyEntity {
    private String pglProductDutyId;

    private String policyNo;

    private BigDecimal policyGradeLevelNo;

    private String productId;

    private String dutyId;

    private BigDecimal pglpDutyPrem;

    private BigDecimal pglpDutyCovrage;

    private BigDecimal subsidyAmount;

    private BigDecimal deductibleDays;

    private BigDecimal pglpDutyWaitingPeriod;

    private BigDecimal pglpDutyDeductibles;

    private BigDecimal pglpDutyTimesDeductibles;

    private BigDecimal pglpDutyLifelongDeductibles;

    private String pglpDutyTimesType;

    private BigDecimal pglpDutyTimes;

    private BigDecimal pglpDutyTimesDay;

    private BigDecimal pglpDutyTotalDays;

    private String pglpDutySpecialContract;

    private BigDecimal pglpDutyTimesAmonut;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getPglProductDutyId() {
        return pglProductDutyId;
    }

    public void setPglProductDutyId(String pglProductDutyId) {
        this.pglProductDutyId = pglProductDutyId == null ? null : pglProductDutyId.trim();
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo == null ? null : policyNo.trim();
    }

    public BigDecimal getPolicyGradeLevelNo() {
        return policyGradeLevelNo;
    }

    public void setPolicyGradeLevelNo(BigDecimal policyGradeLevelNo) {
        this.policyGradeLevelNo = policyGradeLevelNo;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getDutyId() {
        return dutyId;
    }

    public void setDutyId(String dutyId) {
        this.dutyId = dutyId == null ? null : dutyId.trim();
    }

    public BigDecimal getPglpDutyPrem() {
        return pglpDutyPrem;
    }

    public void setPglpDutyPrem(BigDecimal pglpDutyPrem) {
        this.pglpDutyPrem = pglpDutyPrem;
    }

    public BigDecimal getPglpDutyCovrage() {
        return pglpDutyCovrage;
    }

    public void setPglpDutyCovrage(BigDecimal pglpDutyCovrage) {
        this.pglpDutyCovrage = pglpDutyCovrage;
    }

    public BigDecimal getSubsidyAmount() {
        return subsidyAmount;
    }

    public void setSubsidyAmount(BigDecimal subsidyAmount) {
        this.subsidyAmount = subsidyAmount;
    }

    public BigDecimal getDeductibleDays() {
        return deductibleDays;
    }

    public void setDeductibleDays(BigDecimal deductibleDays) {
        this.deductibleDays = deductibleDays;
    }

    public BigDecimal getPglpDutyWaitingPeriod() {
        return pglpDutyWaitingPeriod;
    }

    public void setPglpDutyWaitingPeriod(BigDecimal pglpDutyWaitingPeriod) {
        this.pglpDutyWaitingPeriod = pglpDutyWaitingPeriod;
    }

    public BigDecimal getPglpDutyDeductibles() {
        return pglpDutyDeductibles;
    }

    public void setPglpDutyDeductibles(BigDecimal pglpDutyDeductibles) {
        this.pglpDutyDeductibles = pglpDutyDeductibles;
    }

    public BigDecimal getPglpDutyTimesDeductibles() {
        return pglpDutyTimesDeductibles;
    }

    public void setPglpDutyTimesDeductibles(BigDecimal pglpDutyTimesDeductibles) {
        this.pglpDutyTimesDeductibles = pglpDutyTimesDeductibles;
    }

    public BigDecimal getPglpDutyLifelongDeductibles() {
        return pglpDutyLifelongDeductibles;
    }

    public void setPglpDutyLifelongDeductibles(BigDecimal pglpDutyLifelongDeductibles) {
        this.pglpDutyLifelongDeductibles = pglpDutyLifelongDeductibles;
    }

    public String getPglpDutyTimesType() {
        return pglpDutyTimesType;
    }

    public void setPglpDutyTimesType(String pglpDutyTimesType) {
        this.pglpDutyTimesType = pglpDutyTimesType == null ? null : pglpDutyTimesType.trim();
    }

    public BigDecimal getPglpDutyTimes() {
        return pglpDutyTimes;
    }

    public void setPglpDutyTimes(BigDecimal pglpDutyTimes) {
        this.pglpDutyTimes = pglpDutyTimes;
    }

    public BigDecimal getPglpDutyTimesDay() {
        return pglpDutyTimesDay;
    }

    public void setPglpDutyTimesDay(BigDecimal pglpDutyTimesDay) {
        this.pglpDutyTimesDay = pglpDutyTimesDay;
    }

    public BigDecimal getPglpDutyTotalDays() {
        return pglpDutyTotalDays;
    }

    public void setPglpDutyTotalDays(BigDecimal pglpDutyTotalDays) {
        this.pglpDutyTotalDays = pglpDutyTotalDays;
    }

    public String getPglpDutySpecialContract() {
        return pglpDutySpecialContract;
    }

    public void setPglpDutySpecialContract(String pglpDutySpecialContract) {
        this.pglpDutySpecialContract = pglpDutySpecialContract == null ? null : pglpDutySpecialContract.trim();
    }

    public BigDecimal getPglpDutyTimesAmonut() {
        return pglpDutyTimesAmonut;
    }

    public void setPglpDutyTimesAmonut(BigDecimal pglpDutyTimesAmonut) {
        this.pglpDutyTimesAmonut = pglpDutyTimesAmonut;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}