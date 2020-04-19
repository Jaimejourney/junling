package com.junling.mis.model.secondary;

import java.math.BigDecimal;
import java.util.Date;

public class ClaimBenefitBillEntity {
    private Integer id;

    private String docuno;

    private String accno;

    private String polno;

    private String receiptno;

    private String riskcode;

    private String riskname;

    private String benefitcode;

    private String benefitname;

    private BigDecimal calamt;

    private BigDecimal deductibleamt;

    private BigDecimal billamt;

    private BigDecimal declineamt;

    private BigDecimal expensesamountsum;

    private BigDecimal deductiblevalue;

    private BigDecimal dentalamountsum;

    private Date createddate;

    private Date updateddate;

    private BigDecimal hisamountsum;

    private BigDecimal orherdeducamountsum;

    private BigDecimal deductiblerate;

    private BigDecimal socialamount;

    private BigDecimal thirdamount;

    private BigDecimal adjustamount;

    private String adjustamountreason;

    private BigDecimal reasonamountsum;

    private BigDecimal originalthirdamount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDocuno() {
        return docuno;
    }

    public void setDocuno(String docuno) {
        this.docuno = docuno == null ? null : docuno.trim();
    }

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno == null ? null : accno.trim();
    }

    public String getPolno() {
        return polno;
    }

    public void setPolno(String polno) {
        this.polno = polno == null ? null : polno.trim();
    }

    public String getReceiptno() {
        return receiptno;
    }

    public void setReceiptno(String receiptno) {
        this.receiptno = receiptno == null ? null : receiptno.trim();
    }

    public String getRiskcode() {
        return riskcode;
    }

    public void setRiskcode(String riskcode) {
        this.riskcode = riskcode == null ? null : riskcode.trim();
    }

    public String getRiskname() {
        return riskname;
    }

    public void setRiskname(String riskname) {
        this.riskname = riskname == null ? null : riskname.trim();
    }

    public String getBenefitcode() {
        return benefitcode;
    }

    public void setBenefitcode(String benefitcode) {
        this.benefitcode = benefitcode == null ? null : benefitcode.trim();
    }

    public String getBenefitname() {
        return benefitname;
    }

    public void setBenefitname(String benefitname) {
        this.benefitname = benefitname == null ? null : benefitname.trim();
    }

    public BigDecimal getCalamt() {
        return calamt;
    }

    public void setCalamt(BigDecimal calamt) {
        this.calamt = calamt;
    }

    public BigDecimal getDeductibleamt() {
        return deductibleamt;
    }

    public void setDeductibleamt(BigDecimal deductibleamt) {
        this.deductibleamt = deductibleamt;
    }

    public BigDecimal getBillamt() {
        return billamt;
    }

    public void setBillamt(BigDecimal billamt) {
        this.billamt = billamt;
    }

    public BigDecimal getDeclineamt() {
        return declineamt;
    }

    public void setDeclineamt(BigDecimal declineamt) {
        this.declineamt = declineamt;
    }

    public BigDecimal getExpensesamountsum() {
        return expensesamountsum;
    }

    public void setExpensesamountsum(BigDecimal expensesamountsum) {
        this.expensesamountsum = expensesamountsum;
    }

    public BigDecimal getDeductiblevalue() {
        return deductiblevalue;
    }

    public void setDeductiblevalue(BigDecimal deductiblevalue) {
        this.deductiblevalue = deductiblevalue;
    }

    public BigDecimal getDentalamountsum() {
        return dentalamountsum;
    }

    public void setDentalamountsum(BigDecimal dentalamountsum) {
        this.dentalamountsum = dentalamountsum;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public Date getUpdateddate() {
        return updateddate;
    }

    public void setUpdateddate(Date updateddate) {
        this.updateddate = updateddate;
    }

    public BigDecimal getHisamountsum() {
        return hisamountsum;
    }

    public void setHisamountsum(BigDecimal hisamountsum) {
        this.hisamountsum = hisamountsum;
    }

    public BigDecimal getOrherdeducamountsum() {
        return orherdeducamountsum;
    }

    public void setOrherdeducamountsum(BigDecimal orherdeducamountsum) {
        this.orherdeducamountsum = orherdeducamountsum;
    }

    public BigDecimal getDeductiblerate() {
        return deductiblerate;
    }

    public void setDeductiblerate(BigDecimal deductiblerate) {
        this.deductiblerate = deductiblerate;
    }

    public BigDecimal getSocialamount() {
        return socialamount;
    }

    public void setSocialamount(BigDecimal socialamount) {
        this.socialamount = socialamount;
    }

    public BigDecimal getThirdamount() {
        return thirdamount;
    }

    public void setThirdamount(BigDecimal thirdamount) {
        this.thirdamount = thirdamount;
    }

    public BigDecimal getAdjustamount() {
        return adjustamount;
    }

    public void setAdjustamount(BigDecimal adjustamount) {
        this.adjustamount = adjustamount;
    }

    public String getAdjustamountreason() {
        return adjustamountreason;
    }

    public void setAdjustamountreason(String adjustamountreason) {
        this.adjustamountreason = adjustamountreason == null ? null : adjustamountreason.trim();
    }

    public BigDecimal getReasonamountsum() {
        return reasonamountsum;
    }

    public void setReasonamountsum(BigDecimal reasonamountsum) {
        this.reasonamountsum = reasonamountsum;
    }

    public BigDecimal getOriginalthirdamount() {
        return originalthirdamount;
    }

    public void setOriginalthirdamount(BigDecimal originalthirdamount) {
        this.originalthirdamount = originalthirdamount;
    }
}