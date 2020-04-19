package com.junling.mis.model.secondary;

import java.util.Date;

public class ClaimBillEntity {
    private String seqno;

    private String docuno;

    private String billid;

    private String hospitalCode;

    private Long billAmt;

    private String billType;

    private Date admissionDate;

    private Date dischargeDate;

    private Integer hospitalDays;

    private String hospitalDepartment;

    private Long allOwnAmt;

    private Long subOwnAmt;

    private Long ybLookUpAmt;

    private String flowId;

    private String doctorName;

    private String settleId;

    private Date adjustmentDate;

    private String isYbBill;

    private String institutionalId;

    private String partnerId;

    private String updatePoson;

    private Date updateTime;

    private Long isDelete;

    private String receiptType;

    private String receiptno;

    private Date clinicDate;

    private Long specialPayment;

    private Long hospitalMoney;

    private Long feeMmount;

    private Long feeDeductible;

    private Long wipeoutAmount;

    private Long cashPayment;

    private Long accountPayment;

    private Long accountBalance;

    private Long medicalPayment;

    private Long totalMedicalPayment;

    private Long besideinsuranceMoney;

    private Long totalannualPayment;

    private Long insyrancePayment;

    private Long coOdtnfd;

    private Long cliniclargePayment;

    private Long retirementPayment;

    private Long disabilitysoldierPayment;

    private Long civilservantsPayment;

    private Long hospitalMutualPayment;

    private Long clinicMutualPayment;

    private Long totalClinicMutualPayment;

    private Long annualBalance;

    private Long annualCoOdtnfd;

    private Long annualMutualPayment;

    private Long individualPayment;

    private Long paymenta;

    private Long paymentb;

    private Long paymentFrom;

    private Long paymentCap;

    private Long ownExpense;

    private Long totalIndividualPayment;

    private Long receiptClainAmount;

    private String operationFlr;

    private Long clinicMoney;

    private String ybType;

    private String feeattic;

    private String hospitalName;

    private String accno;

    private Date createTime;

    private Long payRate;

    private Long deductibleAmount;

    private Long refuseamt;

    public String getSeqno() {
        return seqno;
    }

    public void setSeqno(String seqno) {
        this.seqno = seqno == null ? null : seqno.trim();
    }

    public String getDocuno() {
        return docuno;
    }

    public void setDocuno(String docuno) {
        this.docuno = docuno == null ? null : docuno.trim();
    }

    public String getBillid() {
        return billid;
    }

    public void setBillid(String billid) {
        this.billid = billid == null ? null : billid.trim();
    }

    public String getHospitalCode() {
        return hospitalCode;
    }

    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode == null ? null : hospitalCode.trim();
    }

    public Long getBillAmt() {
        return billAmt;
    }

    public void setBillAmt(Long billAmt) {
        this.billAmt = billAmt;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType == null ? null : billType.trim();
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

    public Long getAllOwnAmt() {
        return allOwnAmt;
    }

    public void setAllOwnAmt(Long allOwnAmt) {
        this.allOwnAmt = allOwnAmt;
    }

    public Long getSubOwnAmt() {
        return subOwnAmt;
    }

    public void setSubOwnAmt(Long subOwnAmt) {
        this.subOwnAmt = subOwnAmt;
    }

    public Long getYbLookUpAmt() {
        return ybLookUpAmt;
    }

    public void setYbLookUpAmt(Long ybLookUpAmt) {
        this.ybLookUpAmt = ybLookUpAmt;
    }

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId == null ? null : flowId.trim();
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName == null ? null : doctorName.trim();
    }

    public String getSettleId() {
        return settleId;
    }

    public void setSettleId(String settleId) {
        this.settleId = settleId == null ? null : settleId.trim();
    }

    public Date getAdjustmentDate() {
        return adjustmentDate;
    }

    public void setAdjustmentDate(Date adjustmentDate) {
        this.adjustmentDate = adjustmentDate;
    }

    public String getIsYbBill() {
        return isYbBill;
    }

    public void setIsYbBill(String isYbBill) {
        this.isYbBill = isYbBill == null ? null : isYbBill.trim();
    }

    public String getInstitutionalId() {
        return institutionalId;
    }

    public void setInstitutionalId(String institutionalId) {
        this.institutionalId = institutionalId == null ? null : institutionalId.trim();
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId == null ? null : partnerId.trim();
    }

    public String getUpdatePoson() {
        return updatePoson;
    }

    public void setUpdatePoson(String updatePoson) {
        this.updatePoson = updatePoson == null ? null : updatePoson.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Long isDelete) {
        this.isDelete = isDelete;
    }

    public String getReceiptType() {
        return receiptType;
    }

    public void setReceiptType(String receiptType) {
        this.receiptType = receiptType == null ? null : receiptType.trim();
    }

    public String getReceiptno() {
        return receiptno;
    }

    public void setReceiptno(String receiptno) {
        this.receiptno = receiptno == null ? null : receiptno.trim();
    }

    public Date getClinicDate() {
        return clinicDate;
    }

    public void setClinicDate(Date clinicDate) {
        this.clinicDate = clinicDate;
    }

    public Long getSpecialPayment() {
        return specialPayment;
    }

    public void setSpecialPayment(Long specialPayment) {
        this.specialPayment = specialPayment;
    }

    public Long getHospitalMoney() {
        return hospitalMoney;
    }

    public void setHospitalMoney(Long hospitalMoney) {
        this.hospitalMoney = hospitalMoney;
    }

    public Long getFeeMmount() {
        return feeMmount;
    }

    public void setFeeMmount(Long feeMmount) {
        this.feeMmount = feeMmount;
    }

    public Long getFeeDeductible() {
        return feeDeductible;
    }

    public void setFeeDeductible(Long feeDeductible) {
        this.feeDeductible = feeDeductible;
    }

    public Long getWipeoutAmount() {
        return wipeoutAmount;
    }

    public void setWipeoutAmount(Long wipeoutAmount) {
        this.wipeoutAmount = wipeoutAmount;
    }

    public Long getCashPayment() {
        return cashPayment;
    }

    public void setCashPayment(Long cashPayment) {
        this.cashPayment = cashPayment;
    }

    public Long getAccountPayment() {
        return accountPayment;
    }

    public void setAccountPayment(Long accountPayment) {
        this.accountPayment = accountPayment;
    }

    public Long getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Long accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Long getMedicalPayment() {
        return medicalPayment;
    }

    public void setMedicalPayment(Long medicalPayment) {
        this.medicalPayment = medicalPayment;
    }

    public Long getTotalMedicalPayment() {
        return totalMedicalPayment;
    }

    public void setTotalMedicalPayment(Long totalMedicalPayment) {
        this.totalMedicalPayment = totalMedicalPayment;
    }

    public Long getBesideinsuranceMoney() {
        return besideinsuranceMoney;
    }

    public void setBesideinsuranceMoney(Long besideinsuranceMoney) {
        this.besideinsuranceMoney = besideinsuranceMoney;
    }

    public Long getTotalannualPayment() {
        return totalannualPayment;
    }

    public void setTotalannualPayment(Long totalannualPayment) {
        this.totalannualPayment = totalannualPayment;
    }

    public Long getInsyrancePayment() {
        return insyrancePayment;
    }

    public void setInsyrancePayment(Long insyrancePayment) {
        this.insyrancePayment = insyrancePayment;
    }

    public Long getCoOdtnfd() {
        return coOdtnfd;
    }

    public void setCoOdtnfd(Long coOdtnfd) {
        this.coOdtnfd = coOdtnfd;
    }

    public Long getCliniclargePayment() {
        return cliniclargePayment;
    }

    public void setCliniclargePayment(Long cliniclargePayment) {
        this.cliniclargePayment = cliniclargePayment;
    }

    public Long getRetirementPayment() {
        return retirementPayment;
    }

    public void setRetirementPayment(Long retirementPayment) {
        this.retirementPayment = retirementPayment;
    }

    public Long getDisabilitysoldierPayment() {
        return disabilitysoldierPayment;
    }

    public void setDisabilitysoldierPayment(Long disabilitysoldierPayment) {
        this.disabilitysoldierPayment = disabilitysoldierPayment;
    }

    public Long getCivilservantsPayment() {
        return civilservantsPayment;
    }

    public void setCivilservantsPayment(Long civilservantsPayment) {
        this.civilservantsPayment = civilservantsPayment;
    }

    public Long getHospitalMutualPayment() {
        return hospitalMutualPayment;
    }

    public void setHospitalMutualPayment(Long hospitalMutualPayment) {
        this.hospitalMutualPayment = hospitalMutualPayment;
    }

    public Long getClinicMutualPayment() {
        return clinicMutualPayment;
    }

    public void setClinicMutualPayment(Long clinicMutualPayment) {
        this.clinicMutualPayment = clinicMutualPayment;
    }

    public Long getTotalClinicMutualPayment() {
        return totalClinicMutualPayment;
    }

    public void setTotalClinicMutualPayment(Long totalClinicMutualPayment) {
        this.totalClinicMutualPayment = totalClinicMutualPayment;
    }

    public Long getAnnualBalance() {
        return annualBalance;
    }

    public void setAnnualBalance(Long annualBalance) {
        this.annualBalance = annualBalance;
    }

    public Long getAnnualCoOdtnfd() {
        return annualCoOdtnfd;
    }

    public void setAnnualCoOdtnfd(Long annualCoOdtnfd) {
        this.annualCoOdtnfd = annualCoOdtnfd;
    }

    public Long getAnnualMutualPayment() {
        return annualMutualPayment;
    }

    public void setAnnualMutualPayment(Long annualMutualPayment) {
        this.annualMutualPayment = annualMutualPayment;
    }

    public Long getIndividualPayment() {
        return individualPayment;
    }

    public void setIndividualPayment(Long individualPayment) {
        this.individualPayment = individualPayment;
    }

    public Long getPaymenta() {
        return paymenta;
    }

    public void setPaymenta(Long paymenta) {
        this.paymenta = paymenta;
    }

    public Long getPaymentb() {
        return paymentb;
    }

    public void setPaymentb(Long paymentb) {
        this.paymentb = paymentb;
    }

    public Long getPaymentFrom() {
        return paymentFrom;
    }

    public void setPaymentFrom(Long paymentFrom) {
        this.paymentFrom = paymentFrom;
    }

    public Long getPaymentCap() {
        return paymentCap;
    }

    public void setPaymentCap(Long paymentCap) {
        this.paymentCap = paymentCap;
    }

    public Long getOwnExpense() {
        return ownExpense;
    }

    public void setOwnExpense(Long ownExpense) {
        this.ownExpense = ownExpense;
    }

    public Long getTotalIndividualPayment() {
        return totalIndividualPayment;
    }

    public void setTotalIndividualPayment(Long totalIndividualPayment) {
        this.totalIndividualPayment = totalIndividualPayment;
    }

    public Long getReceiptClainAmount() {
        return receiptClainAmount;
    }

    public void setReceiptClainAmount(Long receiptClainAmount) {
        this.receiptClainAmount = receiptClainAmount;
    }

    public String getOperationFlr() {
        return operationFlr;
    }

    public void setOperationFlr(String operationFlr) {
        this.operationFlr = operationFlr == null ? null : operationFlr.trim();
    }

    public Long getClinicMoney() {
        return clinicMoney;
    }

    public void setClinicMoney(Long clinicMoney) {
        this.clinicMoney = clinicMoney;
    }

    public String getYbType() {
        return ybType;
    }

    public void setYbType(String ybType) {
        this.ybType = ybType == null ? null : ybType.trim();
    }

    public String getFeeattic() {
        return feeattic;
    }

    public void setFeeattic(String feeattic) {
        this.feeattic = feeattic == null ? null : feeattic.trim();
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName == null ? null : hospitalName.trim();
    }

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno == null ? null : accno.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getPayRate() {
        return payRate;
    }

    public void setPayRate(Long payRate) {
        this.payRate = payRate;
    }

    public Long getDeductibleAmount() {
        return deductibleAmount;
    }

    public void setDeductibleAmount(Long deductibleAmount) {
        this.deductibleAmount = deductibleAmount;
    }

    public Long getRefuseamt() {
        return refuseamt;
    }

    public void setRefuseamt(Long refuseamt) {
        this.refuseamt = refuseamt;
    }
}