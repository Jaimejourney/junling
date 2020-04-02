package com.junling.mis.model.primary;

import java.util.Date;

public class clauseInfo {
    private String clauseId;

    private String organizationId;

    private String clauseCode;

    private String clauseName;

    private String clauseType;

    private Date clauseStartTime;

    private Date clauseEndTime;

    private String clauseStatus;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    private String clauseDes;

    public String getClauseId() {
        return clauseId;
    }

    public void setClauseId(String clauseId) {
        this.clauseId = clauseId == null ? null : clauseId.trim();
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId == null ? null : organizationId.trim();
    }

    public String getClauseCode() {
        return clauseCode;
    }

    public void setClauseCode(String clauseCode) {
        this.clauseCode = clauseCode == null ? null : clauseCode.trim();
    }

    public String getClauseName() {
        return clauseName;
    }

    public void setClauseName(String clauseName) {
        this.clauseName = clauseName == null ? null : clauseName.trim();
    }

    public String getClauseType() {
        return clauseType;
    }

    public void setClauseType(String clauseType) {
        this.clauseType = clauseType == null ? null : clauseType.trim();
    }

    public Date getClauseStartTime() {
        return clauseStartTime;
    }

    public void setClauseStartTime(Date clauseStartTime) {
        this.clauseStartTime = clauseStartTime;
    }

    public Date getClauseEndTime() {
        return clauseEndTime;
    }

    public void setClauseEndTime(Date clauseEndTime) {
        this.clauseEndTime = clauseEndTime;
    }

    public String getClauseStatus() {
        return clauseStatus;
    }

    public void setClauseStatus(String clauseStatus) {
        this.clauseStatus = clauseStatus == null ? null : clauseStatus.trim();
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

    public String getClauseDes() {
        return clauseDes;
    }

    public void setClauseDes(String clauseDes) {
        this.clauseDes = clauseDes == null ? null : clauseDes.trim();
    }
}