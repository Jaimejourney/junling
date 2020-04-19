package com.junling.mis.model.secondary;

import java.util.Date;

public class TpaPolPlanBenefitEntity {
    private Integer id;

    private String polno;

    private Integer gradeLevel;

    private String planCode;

    private Integer benefitCode;

    private String description;

    private String maxAmount;

    private String subsidyAmount;

    private String waitingPeriod;

    private Integer accidentWaitingPeriod;

    private String deductibleDays;

    private String deductibleType;

    private String deductibleAmount;

    private String payRate;

    private String punishPayRate;

    private String limitType;

    private String limitAmount;

    private String limitDays;

    private String limitTimes;

    private String createdBy;

    private Date createdDate;

    private String updatedBy;

    private Date updatedDate;

    private String productCode;

    private String riskCode;

    private Double prem;

    private Double amnt;

    private String planName;

    private String getDutyCode;

    private String getDutyName;

    private String getDutyKind;

    private String getDutyKindName;

    private Double dutyAmnt;

    private String riskName;

    private String productName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPolno() {
        return polno;
    }

    public void setPolno(String polno) {
        this.polno = polno == null ? null : polno.trim();
    }

    public Integer getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(Integer gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String getPlanCode() {
        return planCode;
    }

    public void setPlanCode(String planCode) {
        this.planCode = planCode == null ? null : planCode.trim();
    }

    public Integer getBenefitCode() {
        return benefitCode;
    }

    public void setBenefitCode(Integer benefitCode) {
        this.benefitCode = benefitCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(String maxAmount) {
        this.maxAmount = maxAmount == null ? null : maxAmount.trim();
    }

    public String getSubsidyAmount() {
        return subsidyAmount;
    }

    public void setSubsidyAmount(String subsidyAmount) {
        this.subsidyAmount = subsidyAmount == null ? null : subsidyAmount.trim();
    }

    public String getWaitingPeriod() {
        return waitingPeriod;
    }

    public void setWaitingPeriod(String waitingPeriod) {
        this.waitingPeriod = waitingPeriod == null ? null : waitingPeriod.trim();
    }

    public Integer getAccidentWaitingPeriod() {
        return accidentWaitingPeriod;
    }

    public void setAccidentWaitingPeriod(Integer accidentWaitingPeriod) {
        this.accidentWaitingPeriod = accidentWaitingPeriod;
    }

    public String getDeductibleDays() {
        return deductibleDays;
    }

    public void setDeductibleDays(String deductibleDays) {
        this.deductibleDays = deductibleDays == null ? null : deductibleDays.trim();
    }

    public String getDeductibleType() {
        return deductibleType;
    }

    public void setDeductibleType(String deductibleType) {
        this.deductibleType = deductibleType == null ? null : deductibleType.trim();
    }

    public String getDeductibleAmount() {
        return deductibleAmount;
    }

    public void setDeductibleAmount(String deductibleAmount) {
        this.deductibleAmount = deductibleAmount == null ? null : deductibleAmount.trim();
    }

    public String getPayRate() {
        return payRate;
    }

    public void setPayRate(String payRate) {
        this.payRate = payRate == null ? null : payRate.trim();
    }

    public String getPunishPayRate() {
        return punishPayRate;
    }

    public void setPunishPayRate(String punishPayRate) {
        this.punishPayRate = punishPayRate == null ? null : punishPayRate.trim();
    }

    public String getLimitType() {
        return limitType;
    }

    public void setLimitType(String limitType) {
        this.limitType = limitType == null ? null : limitType.trim();
    }

    public String getLimitAmount() {
        return limitAmount;
    }

    public void setLimitAmount(String limitAmount) {
        this.limitAmount = limitAmount == null ? null : limitAmount.trim();
    }

    public String getLimitDays() {
        return limitDays;
    }

    public void setLimitDays(String limitDays) {
        this.limitDays = limitDays == null ? null : limitDays.trim();
    }

    public String getLimitTimes() {
        return limitTimes;
    }

    public void setLimitTimes(String limitTimes) {
        this.limitTimes = limitTimes == null ? null : limitTimes.trim();
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public String getRiskCode() {
        return riskCode;
    }

    public void setRiskCode(String riskCode) {
        this.riskCode = riskCode == null ? null : riskCode.trim();
    }

    public Double getPrem() {
        return prem;
    }

    public void setPrem(Double prem) {
        this.prem = prem;
    }

    public Double getAmnt() {
        return amnt;
    }

    public void setAmnt(Double amnt) {
        this.amnt = amnt;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName == null ? null : planName.trim();
    }

    public String getGetDutyCode() {
        return getDutyCode;
    }

    public void setGetDutyCode(String getDutyCode) {
        this.getDutyCode = getDutyCode == null ? null : getDutyCode.trim();
    }

    public String getGetDutyName() {
        return getDutyName;
    }

    public void setGetDutyName(String getDutyName) {
        this.getDutyName = getDutyName == null ? null : getDutyName.trim();
    }

    public String getGetDutyKind() {
        return getDutyKind;
    }

    public void setGetDutyKind(String getDutyKind) {
        this.getDutyKind = getDutyKind == null ? null : getDutyKind.trim();
    }

    public String getGetDutyKindName() {
        return getDutyKindName;
    }

    public void setGetDutyKindName(String getDutyKindName) {
        this.getDutyKindName = getDutyKindName == null ? null : getDutyKindName.trim();
    }

    public Double getDutyAmnt() {
        return dutyAmnt;
    }

    public void setDutyAmnt(Double dutyAmnt) {
        this.dutyAmnt = dutyAmnt;
    }

    public String getRiskName() {
        return riskName;
    }

    public void setRiskName(String riskName) {
        this.riskName = riskName == null ? null : riskName.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }
}