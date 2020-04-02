package com.junling.mis.model.primary;

import java.util.Date;

public class claimBill extends claimBillKey {
    private String claimBillNo;

    private String hospitalCode;

    private Date clinicDate;

    private String flowId;

    private Date admissionDate;

    private Date dischargeDate;

    private Integer hospitalDays;

    private String hospitalDepartment;

    private String medicalInsuranceType;

    private String claimResult;

    private String claimStatus;

    private Integer claimAmount;

    private String claimSoucreType;

    private String claimType;

    private String rejectCauseCode;

    private String rejectCause;

    private Integer besideinsuranceMoney;

    private Integer totalIndividualPayment;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    private String medicalCardNumber;

    private Integer billAmt;

    private Integer accountPayment;

    private Integer medicalPayment;

    private Integer thirdPartyPaymentAmount;

    private Integer personalAmount;

    private Integer individualPayment;

    private Integer personalPaymentAmount;

    private Integer cashPaidAmount;

    public String getClaimBillNo() {
        return claimBillNo;
    }

    public void setClaimBillNo(String claimBillNo) {
        this.claimBillNo = claimBillNo == null ? null : claimBillNo.trim();
    }

    public String getHospitalCode() {
        return hospitalCode;
    }

    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode == null ? null : hospitalCode.trim();
    }

    public Date getClinicDate() {
        return clinicDate;
    }

    public void setClinicDate(Date clinicDate) {
        this.clinicDate = clinicDate;
    }

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId == null ? null : flowId.trim();
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

    public Integer getHospitalDays() {
        return hospitalDays;
    }

    public void setHospitalDays(Integer hospitalDays) {
        this.hospitalDays = hospitalDays;
    }

    public String getHospitalDepartment() {
        return hospitalDepartment;
    }

    public void setHospitalDepartment(String hospitalDepartment) {
        this.hospitalDepartment = hospitalDepartment == null ? null : hospitalDepartment.trim();
    }

    public String getMedicalInsuranceType() {
        return medicalInsuranceType;
    }

    public void setMedicalInsuranceType(String medicalInsuranceType) {
        this.medicalInsuranceType = medicalInsuranceType == null ? null : medicalInsuranceType.trim();
    }

    public String getClaimResult() {
        return claimResult;
    }

    public void setClaimResult(String claimResult) {
        this.claimResult = claimResult == null ? null : claimResult.trim();
    }

    public String getClaimStatus() {
        return claimStatus;
    }

    public void setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus == null ? null : claimStatus.trim();
    }

    public Integer getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(Integer claimAmount) {
        this.claimAmount = claimAmount;
    }

    public String getClaimSoucreType() {
        return claimSoucreType;
    }

    public void setClaimSoucreType(String claimSoucreType) {
        this.claimSoucreType = claimSoucreType == null ? null : claimSoucreType.trim();
    }

    public String getClaimType() {
        return claimType;
    }

    public void setClaimType(String claimType) {
        this.claimType = claimType == null ? null : claimType.trim();
    }

    public String getRejectCauseCode() {
        return rejectCauseCode;
    }

    public void setRejectCauseCode(String rejectCauseCode) {
        this.rejectCauseCode = rejectCauseCode == null ? null : rejectCauseCode.trim();
    }

    public String getRejectCause() {
        return rejectCause;
    }

    public void setRejectCause(String rejectCause) {
        this.rejectCause = rejectCause == null ? null : rejectCause.trim();
    }

    public Integer getBesideinsuranceMoney() {
        return besideinsuranceMoney;
    }

    public void setBesideinsuranceMoney(Integer besideinsuranceMoney) {
        this.besideinsuranceMoney = besideinsuranceMoney;
    }

    public Integer getTotalIndividualPayment() {
        return totalIndividualPayment;
    }

    public void setTotalIndividualPayment(Integer totalIndividualPayment) {
        this.totalIndividualPayment = totalIndividualPayment;
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

    public String getMedicalCardNumber() {
        return medicalCardNumber;
    }

    public void setMedicalCardNumber(String medicalCardNumber) {
        this.medicalCardNumber = medicalCardNumber == null ? null : medicalCardNumber.trim();
    }

    public Integer getBillAmt() {
        return billAmt;
    }

    public void setBillAmt(Integer billAmt) {
        this.billAmt = billAmt;
    }

    public Integer getAccountPayment() {
        return accountPayment;
    }

    public void setAccountPayment(Integer accountPayment) {
        this.accountPayment = accountPayment;
    }

    public Integer getMedicalPayment() {
        return medicalPayment;
    }

    public void setMedicalPayment(Integer medicalPayment) {
        this.medicalPayment = medicalPayment;
    }

    public Integer getThirdPartyPaymentAmount() {
        return thirdPartyPaymentAmount;
    }

    public void setThirdPartyPaymentAmount(Integer thirdPartyPaymentAmount) {
        this.thirdPartyPaymentAmount = thirdPartyPaymentAmount;
    }

    public Integer getPersonalAmount() {
        return personalAmount;
    }

    public void setPersonalAmount(Integer personalAmount) {
        this.personalAmount = personalAmount;
    }

    public Integer getIndividualPayment() {
        return individualPayment;
    }

    public void setIndividualPayment(Integer individualPayment) {
        this.individualPayment = individualPayment;
    }

    public Integer getPersonalPaymentAmount() {
        return personalPaymentAmount;
    }

    public void setPersonalPaymentAmount(Integer personalPaymentAmount) {
        this.personalPaymentAmount = personalPaymentAmount;
    }

    public Integer getCashPaidAmount() {
        return cashPaidAmount;
    }

    public void setCashPaidAmount(Integer cashPaidAmount) {
        this.cashPaidAmount = cashPaidAmount;
    }
}