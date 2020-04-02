package com.junling.mis.model.primary;

import java.util.Date;

public class tbCompanyNature {
    private String tbCompanyCode;

    private String tbCompanyName;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getTbCompanyCode() {
        return tbCompanyCode;
    }

    public void setTbCompanyCode(String tbCompanyCode) {
        this.tbCompanyCode = tbCompanyCode == null ? null : tbCompanyCode.trim();
    }

    public String getTbCompanyName() {
        return tbCompanyName;
    }

    public void setTbCompanyName(String tbCompanyName) {
        this.tbCompanyName = tbCompanyName == null ? null : tbCompanyName.trim();
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