package com.junling.mis.model.secondary;

import java.util.Date;

public class claimMedicalExpenseEntity {
    private String id;

    private String docuno;

    private String polno;

    private String cvrgno;

    private Long resevFld1;

    private String hospitalName;

    private String billType;

    private String receiptno;

    private Date admissionDate;

    private Date dischargeDate;

    private Long hospitalDays;

    private Long optServiceDays;

    private Long expensesAmountSum;

    private Long hisAmountSum;

    private Long orherDeducAmountSum;

    private Long reasonAmountSum;

    private Long deductibleValue;

    private Long deductibleRate;

    private Long socialAmount;

    private Long thirdAmount;

    private Long dentalAmountSum;

    private Long adjustAmount;

    private String adjustAmountReason;

    private Date createdDate;

    private Date updatedDate;

    private Long isDelete;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDocuno() {
        return docuno;
    }

    public void setDocuno(String docuno) {
        this.docuno = docuno == null ? null : docuno.trim();
    }

    public String getPolno() {
        return polno;
    }

    public void setPolno(String polno) {
        this.polno = polno == null ? null : polno.trim();
    }

    public String getCvrgno() {
        return cvrgno;
    }

    public void setCvrgno(String cvrgno) {
        this.cvrgno = cvrgno == null ? null : cvrgno.trim();
    }

    public Long getResevFld1() {
        return resevFld1;
    }

    public void setResevFld1(Long resevFld1) {
        this.resevFld1 = resevFld1;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName == null ? null : hospitalName.trim();
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType == null ? null : billType.trim();
    }

    public String getReceiptno() {
        return receiptno;
    }

    public void setReceiptno(String receiptno) {
        this.receiptno = receiptno == null ? null : receiptno.trim();
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public Date getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(Date dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public Long getHospitalDays() {
        return hospitalDays;
    }

    public void setHospitalDays(Long hospitalDays) {
        this.hospitalDays = hospitalDays;
    }

    public Long getOptServiceDays() {
        return optServiceDays;
    }

    public void setOptServiceDays(Long optServiceDays) {
        this.optServiceDays = optServiceDays;
    }

    public Long getExpensesAmountSum() {
        return expensesAmountSum;
    }

    public void setExpensesAmountSum(Long expensesAmountSum) {
        this.expensesAmountSum = expensesAmountSum;
    }

    public Long getHisAmountSum() {
        return hisAmountSum;
    }

    public void setHisAmountSum(Long hisAmountSum) {
        this.hisAmountSum = hisAmountSum;
    }

    public Long getOrherDeducAmountSum() {
        return orherDeducAmountSum;
    }

    public void setOrherDeducAmountSum(Long orherDeducAmountSum) {
        this.orherDeducAmountSum = orherDeducAmountSum;
    }

    public Long getReasonAmountSum() {
        return reasonAmountSum;
    }

    public void setReasonAmountSum(Long reasonAmountSum) {
        this.reasonAmountSum = reasonAmountSum;
    }

    public Long getDeductibleValue() {
        return deductibleValue;
    }

    public void setDeductibleValue(Long deductibleValue) {
        this.deductibleValue = deductibleValue;
    }

    public Long getDeductibleRate() {
        return deductibleRate;
    }

    public void setDeductibleRate(Long deductibleRate) {
        this.deductibleRate = deductibleRate;
    }

    public Long getSocialAmount() {
        return socialAmount;
    }

    public void setSocialAmount(Long socialAmount) {
        this.socialAmount = socialAmount;
    }

    public Long getThirdAmount() {
        return thirdAmount;
    }

    public void setThirdAmount(Long thirdAmount) {
        this.thirdAmount = thirdAmount;
    }

    public Long getDentalAmountSum() {
        return dentalAmountSum;
    }

    public void setDentalAmountSum(Long dentalAmountSum) {
        this.dentalAmountSum = dentalAmountSum;
    }

    public Long getAdjustAmount() {
        return adjustAmount;
    }

    public void setAdjustAmount(Long adjustAmount) {
        this.adjustAmount = adjustAmount;
    }

    public String getAdjustAmountReason() {
        return adjustAmountReason;
    }

    public void setAdjustAmountReason(String adjustAmountReason) {
        this.adjustAmountReason = adjustAmountReason == null ? null : adjustAmountReason.trim();
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Long getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Long isDelete) {
        this.isDelete = isDelete;
    }
}