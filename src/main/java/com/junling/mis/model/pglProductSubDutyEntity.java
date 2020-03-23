package com.junling.mis.model;

import java.math.BigDecimal;
import java.util.Date;

public class pglProductSubDutyEntity {
    private String pglProductSubDutyId;

    private String policyNo;

    private BigDecimal policyGradeLevelNo;

    private String productId;

    private String dutyId;

    private String subDutyId;

    private BigDecimal pglpSubDutyPrem;

    private BigDecimal pglpSubDutyCovrage;

    private BigDecimal subsidyAmount;

    private BigDecimal deductibleDays;

    private BigDecimal pglpsdWaitingPeriod;

    private BigDecimal pglpsdDeductibles;

    private BigDecimal pglpsdTimesDeductibles;

    private BigDecimal pglpsdLifelongDeductibles;

    private String pglpsdTimesType;

    private BigDecimal pglpsdTimes;

    private BigDecimal pglpsdTimesDay;

    private BigDecimal pglpsdTotalDays;

    private BigDecimal pglpsdTimesAmonut;

    private String pglpsdSpecialContract;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getPglProductSubDutyId() {
        return pglProductSubDutyId;
    }

    public void setPglProductSubDutyId(String pglProductSubDutyId) {
        this.pglProductSubDutyId = pglProductSubDutyId == null ? null : pglProductSubDutyId.trim();
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

    public String getSubDutyId() {
        return subDutyId;
    }

    public void setSubDutyId(String subDutyId) {
        this.subDutyId = subDutyId == null ? null : subDutyId.trim();
    }

    public BigDecimal getPglpSubDutyPrem() {
        return pglpSubDutyPrem;
    }

    public void setPglpSubDutyPrem(BigDecimal pglpSubDutyPrem) {
        this.pglpSubDutyPrem = pglpSubDutyPrem;
    }

    public BigDecimal getPglpSubDutyCovrage() {
        return pglpSubDutyCovrage;
    }

    public void setPglpSubDutyCovrage(BigDecimal pglpSubDutyCovrage) {
        this.pglpSubDutyCovrage = pglpSubDutyCovrage;
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

    public BigDecimal getPglpsdWaitingPeriod() {
        return pglpsdWaitingPeriod;
    }

    public void setPglpsdWaitingPeriod(BigDecimal pglpsdWaitingPeriod) {
        this.pglpsdWaitingPeriod = pglpsdWaitingPeriod;
    }

    public BigDecimal getPglpsdDeductibles() {
        return pglpsdDeductibles;
    }

    public void setPglpsdDeductibles(BigDecimal pglpsdDeductibles) {
        this.pglpsdDeductibles = pglpsdDeductibles;
    }

    public BigDecimal getPglpsdTimesDeductibles() {
        return pglpsdTimesDeductibles;
    }

    public void setPglpsdTimesDeductibles(BigDecimal pglpsdTimesDeductibles) {
        this.pglpsdTimesDeductibles = pglpsdTimesDeductibles;
    }

    public BigDecimal getPglpsdLifelongDeductibles() {
        return pglpsdLifelongDeductibles;
    }

    public void setPglpsdLifelongDeductibles(BigDecimal pglpsdLifelongDeductibles) {
        this.pglpsdLifelongDeductibles = pglpsdLifelongDeductibles;
    }

    public String getPglpsdTimesType() {
        return pglpsdTimesType;
    }

    public void setPglpsdTimesType(String pglpsdTimesType) {
        this.pglpsdTimesType = pglpsdTimesType == null ? null : pglpsdTimesType.trim();
    }

    public BigDecimal getPglpsdTimes() {
        return pglpsdTimes;
    }

    public void setPglpsdTimes(BigDecimal pglpsdTimes) {
        this.pglpsdTimes = pglpsdTimes;
    }

    public BigDecimal getPglpsdTimesDay() {
        return pglpsdTimesDay;
    }

    public void setPglpsdTimesDay(BigDecimal pglpsdTimesDay) {
        this.pglpsdTimesDay = pglpsdTimesDay;
    }

    public BigDecimal getPglpsdTotalDays() {
        return pglpsdTotalDays;
    }

    public void setPglpsdTotalDays(BigDecimal pglpsdTotalDays) {
        this.pglpsdTotalDays = pglpsdTotalDays;
    }

    public BigDecimal getPglpsdTimesAmonut() {
        return pglpsdTimesAmonut;
    }

    public void setPglpsdTimesAmonut(BigDecimal pglpsdTimesAmonut) {
        this.pglpsdTimesAmonut = pglpsdTimesAmonut;
    }

    public String getPglpsdSpecialContract() {
        return pglpsdSpecialContract;
    }

    public void setPglpsdSpecialContract(String pglpsdSpecialContract) {
        this.pglpsdSpecialContract = pglpsdSpecialContract == null ? null : pglpsdSpecialContract.trim();
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