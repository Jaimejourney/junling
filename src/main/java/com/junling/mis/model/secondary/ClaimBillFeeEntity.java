package com.junling.mis.model.secondary;

import java.math.BigDecimal;
import java.util.Date;

public class ClaimBillFeeEntity {
    private Integer id;

    private String docuno;

    private String accno;

    private String receiptno;

    private String feeitemtype;

    private String feeitemname;

    private BigDecimal sumfeeamt;

    private BigDecimal selfamt;

    private BigDecimal preamt;

    private BigDecimal refuseamt;

    private BigDecimal feedeductibleamt;

    private BigDecimal selfpay2amt;

    private BigDecimal secufeeamt;

    private String costremark;

    private Date createddate;

    private Date updateddate;

    private String polno;

    private String benefitCode;

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

    public String getReceiptno() {
        return receiptno;
    }

    public void setReceiptno(String receiptno) {
        this.receiptno = receiptno == null ? null : receiptno.trim();
    }

    public String getFeeitemtype() {
        return feeitemtype;
    }

    public void setFeeitemtype(String feeitemtype) {
        this.feeitemtype = feeitemtype == null ? null : feeitemtype.trim();
    }

    public String getFeeitemname() {
        return feeitemname;
    }

    public void setFeeitemname(String feeitemname) {
        this.feeitemname = feeitemname == null ? null : feeitemname.trim();
    }

    public BigDecimal getSumfeeamt() {
        return sumfeeamt;
    }

    public void setSumfeeamt(BigDecimal sumfeeamt) {
        this.sumfeeamt = sumfeeamt;
    }

    public BigDecimal getSelfamt() {
        return selfamt;
    }

    public void setSelfamt(BigDecimal selfamt) {
        this.selfamt = selfamt;
    }

    public BigDecimal getPreamt() {
        return preamt;
    }

    public void setPreamt(BigDecimal preamt) {
        this.preamt = preamt;
    }

    public BigDecimal getRefuseamt() {
        return refuseamt;
    }

    public void setRefuseamt(BigDecimal refuseamt) {
        this.refuseamt = refuseamt;
    }

    public BigDecimal getFeedeductibleamt() {
        return feedeductibleamt;
    }

    public void setFeedeductibleamt(BigDecimal feedeductibleamt) {
        this.feedeductibleamt = feedeductibleamt;
    }

    public BigDecimal getSelfpay2amt() {
        return selfpay2amt;
    }

    public void setSelfpay2amt(BigDecimal selfpay2amt) {
        this.selfpay2amt = selfpay2amt;
    }

    public BigDecimal getSecufeeamt() {
        return secufeeamt;
    }

    public void setSecufeeamt(BigDecimal secufeeamt) {
        this.secufeeamt = secufeeamt;
    }

    public String getCostremark() {
        return costremark;
    }

    public void setCostremark(String costremark) {
        this.costremark = costremark == null ? null : costremark.trim();
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

    public String getPolno() {
        return polno;
    }

    public void setPolno(String polno) {
        this.polno = polno == null ? null : polno.trim();
    }

    public String getBenefitCode() {
        return benefitCode;
    }

    public void setBenefitCode(String benefitCode) {
        this.benefitCode = benefitCode == null ? null : benefitCode.trim();
    }
}