package com.junling.mis.model.primary;

import java.util.Date;

public class CustomerRelation {
    private String customerRelationId;

    private String customerOrganizationId;

    private String relationType;

    private String relationCustomer;

    private Date relationStartTime;

    private Date relationEndTime;

    private String relationStatus;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getCustomerRelationId() {
        return customerRelationId;
    }

    public void setCustomerRelationId(String customerRelationId) {
        this.customerRelationId = customerRelationId == null ? null : customerRelationId.trim();
    }

    public String getCustomerOrganizationId() {
        return customerOrganizationId;
    }

    public void setCustomerOrganizationId(String customerOrganizationId) {
        this.customerOrganizationId = customerOrganizationId == null ? null : customerOrganizationId.trim();
    }

    public String getRelationType() {
        return relationType;
    }

    public void setRelationType(String relationType) {
        this.relationType = relationType == null ? null : relationType.trim();
    }

    public String getRelationCustomer() {
        return relationCustomer;
    }

    public void setRelationCustomer(String relationCustomer) {
        this.relationCustomer = relationCustomer == null ? null : relationCustomer.trim();
    }

    public Date getRelationStartTime() {
        return relationStartTime;
    }

    public void setRelationStartTime(Date relationStartTime) {
        this.relationStartTime = relationStartTime;
    }

    public Date getRelationEndTime() {
        return relationEndTime;
    }

    public void setRelationEndTime(Date relationEndTime) {
        this.relationEndTime = relationEndTime;
    }

    public String getRelationStatus() {
        return relationStatus;
    }

    public void setRelationStatus(String relationStatus) {
        this.relationStatus = relationStatus == null ? null : relationStatus.trim();
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