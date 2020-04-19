package com.junling.mis.model.primary;

import java.util.Date;

public class PolicyInsuredService {
    private String policyInsuredServiceId;

    private String policyNo;

    private String policyReinsuranceNo;

    private Integer brNo;

    private String insureId;

    private String policyGradeLevelId;

    private String productId;

    private String serviceCode;

    private String serviceType;

    private Integer serviceTime;

    private String serviceStatus;

    private Integer serviceTimeLeft;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getPolicyInsuredServiceId() {
        return policyInsuredServiceId;
    }

    public void setPolicyInsuredServiceId(String policyInsuredServiceId) {
        this.policyInsuredServiceId = policyInsuredServiceId == null ? null : policyInsuredServiceId.trim();
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo == null ? null : policyNo.trim();
    }

    public String getPolicyReinsuranceNo() {
        return policyReinsuranceNo;
    }

    public void setPolicyReinsuranceNo(String policyReinsuranceNo) {
        this.policyReinsuranceNo = policyReinsuranceNo == null ? null : policyReinsuranceNo.trim();
    }

    public Integer getBrNo() {
        return brNo;
    }

    public void setBrNo(Integer brNo) {
        this.brNo = brNo;
    }

    public String getInsureId() {
        return insureId;
    }

    public void setInsureId(String insureId) {
        this.insureId = insureId == null ? null : insureId.trim();
    }

    public String getPolicyGradeLevelId() {
        return policyGradeLevelId;
    }

    public void setPolicyGradeLevelId(String policyGradeLevelId) {
        this.policyGradeLevelId = policyGradeLevelId == null ? null : policyGradeLevelId.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode == null ? null : serviceCode.trim();
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType == null ? null : serviceType.trim();
    }

    public Integer getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(Integer serviceTime) {
        this.serviceTime = serviceTime;
    }

    public String getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus == null ? null : serviceStatus.trim();
    }

    public Integer getServiceTimeLeft() {
        return serviceTimeLeft;
    }

    public void setServiceTimeLeft(Integer serviceTimeLeft) {
        this.serviceTimeLeft = serviceTimeLeft;
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