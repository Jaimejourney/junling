package com.junling.mis.model.secondary;

import java.math.BigDecimal;
import java.util.Date;

public class claimBenefitBillDetailEntity {
    private Integer id;

    private String docuno;

    private String receiptno;

    private String itemcode;

    private String polno;

    private String riskcode;

    private String riskname;

    private String benefitcode;

    private String benefitname;

    private BigDecimal examamt;

    private Date createddate;

    private Date updateddate;

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

    public String getReceiptno() {
        return receiptno;
    }

    public void setReceiptno(String receiptno) {
        this.receiptno = receiptno == null ? null : receiptno.trim();
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode == null ? null : itemcode.trim();
    }

    public String getPolno() {
        return polno;
    }

    public void setPolno(String polno) {
        this.polno = polno == null ? null : polno.trim();
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

    public BigDecimal getExamamt() {
        return examamt;
    }

    public void setExamamt(BigDecimal examamt) {
        this.examamt = examamt;
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
}