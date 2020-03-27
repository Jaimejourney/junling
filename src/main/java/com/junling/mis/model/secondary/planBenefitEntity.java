package com.junling.mis.model.secondary;

public class planBenefitEntity {
    private String id;

    private String planCode;

    private String gradeLevel;

    private String benefitCode;

    private Long deductibleAmout;

    private String deductibleType;

    private String payRate;

    private Long maxAmount;

    private Long waitingPeriod;

    private Long accidentWaitingPeriod;

    private String status;

    private String punishPayRate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPlanCode() {
        return planCode;
    }

    public void setPlanCode(String planCode) {
        this.planCode = planCode == null ? null : planCode.trim();
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel == null ? null : gradeLevel.trim();
    }

    public String getBenefitCode() {
        return benefitCode;
    }

    public void setBenefitCode(String benefitCode) {
        this.benefitCode = benefitCode == null ? null : benefitCode.trim();
    }

    public Long getDeductibleAmout() {
        return deductibleAmout;
    }

    public void setDeductibleAmout(Long deductibleAmout) {
        this.deductibleAmout = deductibleAmout;
    }

    public String getDeductibleType() {
        return deductibleType;
    }

    public void setDeductibleType(String deductibleType) {
        this.deductibleType = deductibleType == null ? null : deductibleType.trim();
    }

    public String getPayRate() {
        return payRate;
    }

    public void setPayRate(String payRate) {
        this.payRate = payRate == null ? null : payRate.trim();
    }

    public Long getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(Long maxAmount) {
        this.maxAmount = maxAmount;
    }

    public Long getWaitingPeriod() {
        return waitingPeriod;
    }

    public void setWaitingPeriod(Long waitingPeriod) {
        this.waitingPeriod = waitingPeriod;
    }

    public Long getAccidentWaitingPeriod() {
        return accidentWaitingPeriod;
    }

    public void setAccidentWaitingPeriod(Long accidentWaitingPeriod) {
        this.accidentWaitingPeriod = accidentWaitingPeriod;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getPunishPayRate() {
        return punishPayRate;
    }

    public void setPunishPayRate(String punishPayRate) {
        this.punishPayRate = punishPayRate == null ? null : punishPayRate.trim();
    }
}