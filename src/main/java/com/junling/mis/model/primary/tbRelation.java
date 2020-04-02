package com.junling.mis.model.primary;

import java.util.Date;

public class tbRelation {
    private String relationCode;

    private String relationName;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getRelationCode() {
        return relationCode;
    }

    public void setRelationCode(String relationCode) {
        this.relationCode = relationCode == null ? null : relationCode.trim();
    }

    public String getRelationName() {
        return relationName;
    }

    public void setRelationName(String relationName) {
        this.relationName = relationName == null ? null : relationName.trim();
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