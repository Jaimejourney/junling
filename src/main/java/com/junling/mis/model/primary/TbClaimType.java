package com.junling.mis.model.primary;

import java.util.Date;

public class TbClaimType {
    private String calaimTypeCode;

    private String calaimTypeName;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getCalaimTypeCode() {
        return calaimTypeCode;
    }

    public void setCalaimTypeCode(String calaimTypeCode) {
        this.calaimTypeCode = calaimTypeCode == null ? null : calaimTypeCode.trim();
    }

    public String getCalaimTypeName() {
        return calaimTypeName;
    }

    public void setCalaimTypeName(String calaimTypeName) {
        this.calaimTypeName = calaimTypeName == null ? null : calaimTypeName.trim();
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