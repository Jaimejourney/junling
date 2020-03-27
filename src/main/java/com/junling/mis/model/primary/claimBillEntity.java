package com.junling.mis.model.primary;

import java.math.BigDecimal;
import java.util.Date;

public class claimBillEntity extends claimBillEntityKey {
    private String claimBillNo;

    private String hospitalCode;

    private Date clinicDate;

    private String flowId;

    private Date admissionDate;

    private Date dischargeDate;

    private BigDecimal hospitalDays;

    private String hospitalDepartment;

    private String medicalInsuranceType;

    private String medicalCardNumber;

    private BigDecimal billAmt;

    private BigDecimal accountPayment;

    private BigDecimal medicalPayment;

    private BigDecimal thirdPartyPaymentAmount;

    private BigDecimal personalAmount;

    private BigDecimal individualPayment;

    private BigDecimal personalPaymentAmount;

    private BigDecimal cashPaidAmount;

    private String claimResult;

    private String claimStatus;

    private BigDecimal claimAmount;

    private String claimSoucreType;

    private String claimType;

    private String rejectCauseCode;

    private String rejectCause;

    private BigDecimal totalIndividualPayment;

    private BigDecimal besideinsuranceMoney;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

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

    public BigDecimal getHospitalDays() {
        return hospitalDays;
    }

    public void setHospitalDays(BigDecimal hospitalDays) {
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

    public String getMedicalCardNumber() {
        return medicalCardNumber;
    }

    public void setMedicalCardNumber(String medicalCardNumber) {
        this.medicalCardNumber = medicalCardNumber == null ? null : medicalCardNumber.trim();
    }

    public BigDecimal getBillAmt() {
        return billAmt;
    }

    public void setBillAmt(BigDecimal billAmt) {
        this.billAmt = billAmt;
    }

    public BigDecimal getAccountPayment() {
        return accountPayment;
    }

    public void setAccountPayment(BigDecimal accountPayment) {
        this.accountPayment = accountPayment;
    }

    public BigDecimal getMedicalPayment() {
        return medicalPayment;
    }

    public void setMedicalPayment(BigDecimal medicalPayment) {
        this.medicalPayment = medicalPayment;
    }

    public BigDecimal getThirdPartyPaymentAmount() {
        return thirdPartyPaymentAmount;
    }

    public void setThirdPartyPaymentAmount(BigDecimal thirdPartyPaymentAmount) {
        this.thirdPartyPaymentAmount = thirdPartyPaymentAmount;
    }

    public BigDecimal getPersonalAmount() {
        return personalAmount;
    }

    public void setPersonalAmount(BigDecimal personalAmount) {
        this.personalAmount = personalAmount;
    }

    public BigDecimal getIndividualPayment() {
        return individualPayment;
    }

    public void setIndividualPayment(BigDecimal individualPayment) {
        this.individualPayment = individualPayment;
    }

    public BigDecimal getPersonalPaymentAmount() {
        return personalPaymentAmount;
    }

    public void setPersonalPaymentAmount(BigDecimal personalPaymentAmount) {
        this.personalPaymentAmount = personalPaymentAmount;
    }

    public BigDecimal getCashPaidAmount() {
        return cashPaidAmount;
    }

    public void setCashPaidAmount(BigDecimal cashPaidAmount) {
        this.cashPaidAmount = cashPaidAmount;
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

    public BigDecimal getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(BigDecimal claimAmount) {
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

    public BigDecimal getTotalIndividualPayment() {
        return totalIndividualPayment;
    }

    public void setTotalIndividualPayment(BigDecimal totalIndividualPayment) {
        this.totalIndividualPayment = totalIndividualPayment;
    }

    public BigDecimal getBesideinsuranceMoney() {
        return besideinsuranceMoney;
    }

    public void setBesideinsuranceMoney(BigDecimal besideinsuranceMoney) {
        this.besideinsuranceMoney = besideinsuranceMoney;
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