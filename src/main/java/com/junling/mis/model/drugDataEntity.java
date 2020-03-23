package com.junling.mis.model;

public class drugDataEntity {
    private String approvalNumber;

    private String productName;

    private String englishName;

    private String productNameTwo;

    private String formulation;

    private String specification;

    private String productionUnit;

    private String productionAddress;

    private String productCategory;

    private String approvalDate;

    private String originalApprovalNumber;

    private String drugStandardCode;

    private String drugStandardCodeNote;

    private String relatedDatabaseQuery;

    public String getApprovalNumber() {
        return approvalNumber;
    }

    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber == null ? null : approvalNumber.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
    }

    public String getProductNameTwo() {
        return productNameTwo;
    }

    public void setProductNameTwo(String productNameTwo) {
        this.productNameTwo = productNameTwo == null ? null : productNameTwo.trim();
    }

    public String getFormulation() {
        return formulation;
    }

    public void setFormulation(String formulation) {
        this.formulation = formulation == null ? null : formulation.trim();
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    public String getProductionUnit() {
        return productionUnit;
    }

    public void setProductionUnit(String productionUnit) {
        this.productionUnit = productionUnit == null ? null : productionUnit.trim();
    }

    public String getProductionAddress() {
        return productionAddress;
    }

    public void setProductionAddress(String productionAddress) {
        this.productionAddress = productionAddress == null ? null : productionAddress.trim();
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory == null ? null : productCategory.trim();
    }

    public String getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(String approvalDate) {
        this.approvalDate = approvalDate == null ? null : approvalDate.trim();
    }

    public String getOriginalApprovalNumber() {
        return originalApprovalNumber;
    }

    public void setOriginalApprovalNumber(String originalApprovalNumber) {
        this.originalApprovalNumber = originalApprovalNumber == null ? null : originalApprovalNumber.trim();
    }

    public String getDrugStandardCode() {
        return drugStandardCode;
    }

    public void setDrugStandardCode(String drugStandardCode) {
        this.drugStandardCode = drugStandardCode == null ? null : drugStandardCode.trim();
    }

    public String getDrugStandardCodeNote() {
        return drugStandardCodeNote;
    }

    public void setDrugStandardCodeNote(String drugStandardCodeNote) {
        this.drugStandardCodeNote = drugStandardCodeNote == null ? null : drugStandardCodeNote.trim();
    }

    public String getRelatedDatabaseQuery() {
        return relatedDatabaseQuery;
    }

    public void setRelatedDatabaseQuery(String relatedDatabaseQuery) {
        this.relatedDatabaseQuery = relatedDatabaseQuery == null ? null : relatedDatabaseQuery.trim();
    }
}