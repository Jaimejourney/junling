package com.junling.mis.model;

import java.util.Date;

public class rejectCauseEntity {
    private String rejectCauseCode;

    private String rejectCauseName;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getRejectCauseCode() {
        return rejectCauseCode;
    }

    public void setRejectCauseCode(String rejectCauseCode) {
        this.rejectCauseCode = rejectCauseCode == null ? null : rejectCauseCode.trim();
    }

    public String getRejectCauseName() {
        return rejectCauseName;
    }

    public void setRejectCauseName(String rejectCauseName) {
        this.rejectCauseName = rejectCauseName == null ? null : rejectCauseName.trim();
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