package com.junling.mis.model;

import java.math.BigDecimal;
import java.util.Date;

public class organizationInfoEntity {
    private String organizationId;

    private String organizationNo;

    private String organizationName;

    private String organizationStatus;

    private String organizationIndustryType;

    private String districtCode;

    private String organizationCode;

    private String taxNo;

    private String address;

    private String contactPhoneNo;

    private String contactEmail;

    private String contactPersonName;

    private BigDecimal employeesNumber;

    private BigDecimal industryRanking;

    private Date creationTime;

    private String creationPerson;

    private String chairman;

    private String ceo;

    private String companyMission;

    private String operationScope;

    private String registrationNumber;

    private BigDecimal registeredCapital;

    private String companyNature;

    private String registrationAuthority;

    private String officialNetwork;

    private BigDecimal annualTurnover;

    private String developmentHistory;

    private String parentOrganizationId;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId == null ? null : organizationId.trim();
    }

    public String getOrganizationNo() {
        return organizationNo;
    }

    public void setOrganizationNo(String organizationNo) {
        this.organizationNo = organizationNo == null ? null : organizationNo.trim();
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName == null ? null : organizationName.trim();
    }

    public String getOrganizationStatus() {
        return organizationStatus;
    }

    public void setOrganizationStatus(String organizationStatus) {
        this.organizationStatus = organizationStatus == null ? null : organizationStatus.trim();
    }

    public String getOrganizationIndustryType() {
        return organizationIndustryType;
    }

    public void setOrganizationIndustryType(String organizationIndustryType) {
        this.organizationIndustryType = organizationIndustryType == null ? null : organizationIndustryType.trim();
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode == null ? null : districtCode.trim();
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode == null ? null : organizationCode.trim();
    }

    public String getTaxNo() {
        return taxNo;
    }

    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo == null ? null : taxNo.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getContactPhoneNo() {
        return contactPhoneNo;
    }

    public void setContactPhoneNo(String contactPhoneNo) {
        this.contactPhoneNo = contactPhoneNo == null ? null : contactPhoneNo.trim();
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail == null ? null : contactEmail.trim();
    }

    public String getContactPersonName() {
        return contactPersonName;
    }

    public void setContactPersonName(String contactPersonName) {
        this.contactPersonName = contactPersonName == null ? null : contactPersonName.trim();
    }

    public BigDecimal getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(BigDecimal employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    public BigDecimal getIndustryRanking() {
        return industryRanking;
    }

    public void setIndustryRanking(BigDecimal industryRanking) {
        this.industryRanking = industryRanking;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public String getCreationPerson() {
        return creationPerson;
    }

    public void setCreationPerson(String creationPerson) {
        this.creationPerson = creationPerson == null ? null : creationPerson.trim();
    }

    public String getChairman() {
        return chairman;
    }

    public void setChairman(String chairman) {
        this.chairman = chairman == null ? null : chairman.trim();
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo == null ? null : ceo.trim();
    }

    public String getCompanyMission() {
        return companyMission;
    }

    public void setCompanyMission(String companyMission) {
        this.companyMission = companyMission == null ? null : companyMission.trim();
    }

    public String getOperationScope() {
        return operationScope;
    }

    public void setOperationScope(String operationScope) {
        this.operationScope = operationScope == null ? null : operationScope.trim();
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber == null ? null : registrationNumber.trim();
    }

    public BigDecimal getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(BigDecimal registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public String getCompanyNature() {
        return companyNature;
    }

    public void setCompanyNature(String companyNature) {
        this.companyNature = companyNature == null ? null : companyNature.trim();
    }

    public String getRegistrationAuthority() {
        return registrationAuthority;
    }

    public void setRegistrationAuthority(String registrationAuthority) {
        this.registrationAuthority = registrationAuthority == null ? null : registrationAuthority.trim();
    }

    public String getOfficialNetwork() {
        return officialNetwork;
    }

    public void setOfficialNetwork(String officialNetwork) {
        this.officialNetwork = officialNetwork == null ? null : officialNetwork.trim();
    }

    public BigDecimal getAnnualTurnover() {
        return annualTurnover;
    }

    public void setAnnualTurnover(BigDecimal annualTurnover) {
        this.annualTurnover = annualTurnover;
    }

    public String getDevelopmentHistory() {
        return developmentHistory;
    }

    public void setDevelopmentHistory(String developmentHistory) {
        this.developmentHistory = developmentHistory == null ? null : developmentHistory.trim();
    }

    public String getParentOrganizationId() {
        return parentOrganizationId;
    }

    public void setParentOrganizationId(String parentOrganizationId) {
        this.parentOrganizationId = parentOrganizationId == null ? null : parentOrganizationId.trim();
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