package com.junling.mis.model;

public class drugsXinjiangEntity {
    private String drugCode;

    private String drugClassification;

    private String drugNum;

    private String drugName;

    private String formulation;

    private String payCategory;

    private String remark;

    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode == null ? null : drugCode.trim();
    }

    public String getDrugClassification() {
        return drugClassification;
    }

    public void setDrugClassification(String drugClassification) {
        this.drugClassification = drugClassification == null ? null : drugClassification.trim();
    }

    public String getDrugNum() {
        return drugNum;
    }

    public void setDrugNum(String drugNum) {
        this.drugNum = drugNum == null ? null : drugNum.trim();
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName == null ? null : drugName.trim();
    }

    public String getFormulation() {
        return formulation;
    }

    public void setFormulation(String formulation) {
        this.formulation = formulation == null ? null : formulation.trim();
    }

    public String getPayCategory() {
        return payCategory;
    }

    public void setPayCategory(String payCategory) {
        this.payCategory = payCategory == null ? null : payCategory.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}