package com.junling.mis.model.primary;

import java.util.Date;

public class pglProdSubDuty {
    private String pglProductSubDutyId;

    private String policyNo;

    private Integer policyGradeLevelNo;

    private String productId;

    private String dutyId;

    private String subDutyId;

    private Integer pglpSubDutyPrem;

    private Integer pglpSubDutyCovrage;

    private Integer subsidyAmount;

    private Integer deductibleDays;

    private Integer pglpsdWaitingPeriod;

    private Integer pglpsdDeductibles;

    private Integer pglpsdTimesDeductibles;

    private Integer pglpsdLifelongDeductibles;

    private String pglpsdTimesType;

    private Integer pglpsdTimes;

    private Integer pglpsdTimesDay;

    private Integer pglpsdTotalDays;

    private Integer pglpsdTimesAmonut;

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

    public Integer getPolicyGradeLevelNo() {
        return policyGradeLevelNo;
    }

    public void setPolicyGradeLevelNo(Integer policyGradeLevelNo) {
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

    public Integer getPglpSubDutyPrem() {
        return pglpSubDutyPrem;
    }

    public void setPglpSubDutyPrem(Integer pglpSubDutyPrem) {
        this.pglpSubDutyPrem = pglpSubDutyPrem;
    }

    public Integer getPglpSubDutyCovrage() {
        return pglpSubDutyCovrage;
    }

    public void setPglpSubDutyCovrage(Integer pglpSubDutyCovrage) {
        this.pglpSubDutyCovrage = pglpSubDutyCovrage;
    }

    public Integer getSubsidyAmount() {
        return subsidyAmount;
    }

    public void setSubsidyAmount(Integer subsidyAmount) {
        this.subsidyAmount = subsidyAmount;
    }

    public Integer getDeductibleDays() {
        return deductibleDays;
    }

    public void setDeductibleDays(Integer deductibleDays) {
        this.deductibleDays = deductibleDays;
    }

    public Integer getPglpsdWaitingPeriod() {
        return pglpsdWaitingPeriod;
    }

    public void setPglpsdWaitingPeriod(Integer pglpsdWaitingPeriod) {
        this.pglpsdWaitingPeriod = pglpsdWaitingPeriod;
    }

    public Integer getPglpsdDeductibles() {
        return pglpsdDeductibles;
    }

    public void setPglpsdDeductibles(Integer pglpsdDeductibles) {
        this.pglpsdDeductibles = pglpsdDeductibles;
    }

    public Integer getPglpsdTimesDeductibles() {
        return pglpsdTimesDeductibles;
    }

    public void setPglpsdTimesDeductibles(Integer pglpsdTimesDeductibles) {
        this.pglpsdTimesDeductibles = pglpsdTimesDeductibles;
    }

    public Integer getPglpsdLifelongDeductibles() {
        return pglpsdLifelongDeductibles;
    }

    public void setPglpsdLifelongDeductibles(Integer pglpsdLifelongDeductibles) {
        this.pglpsdLifelongDeductibles = pglpsdLifelongDeductibles;
    }

    public String getPglpsdTimesType() {
        return pglpsdTimesType;
    }

    public void setPglpsdTimesType(String pglpsdTimesType) {
        this.pglpsdTimesType = pglpsdTimesType == null ? null : pglpsdTimesType.trim();
    }

    public Integer getPglpsdTimes() {
        return pglpsdTimes;
    }

    public void setPglpsdTimes(Integer pglpsdTimes) {
        this.pglpsdTimes = pglpsdTimes;
    }

    public Integer getPglpsdTimesDay() {
        return pglpsdTimesDay;
    }

    public void setPglpsdTimesDay(Integer pglpsdTimesDay) {
        this.pglpsdTimesDay = pglpsdTimesDay;
    }

    public Integer getPglpsdTotalDays() {
        return pglpsdTotalDays;
    }

    public void setPglpsdTotalDays(Integer pglpsdTotalDays) {
        this.pglpsdTotalDays = pglpsdTotalDays;
    }

    public Integer getPglpsdTimesAmonut() {
        return pglpsdTimesAmonut;
    }

    public void setPglpsdTimesAmonut(Integer pglpsdTimesAmonut) {
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