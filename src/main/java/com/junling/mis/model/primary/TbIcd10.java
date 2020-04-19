package com.junling.mis.model.primary;

import java.util.Date;

public class TbIcd10 {
    private String icd;

    private String icdName;

    private String icdParent;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getIcd() {
        return icd;
    }

    public void setIcd(String icd) {
        this.icd = icd == null ? null : icd.trim();
    }

    public String getIcdName() {
        return icdName;
    }

    public void setIcdName(String icdName) {
        this.icdName = icdName == null ? null : icdName.trim();
    }

    public String getIcdParent() {
        return icdParent;
    }

    public void setIcdParent(String icdParent) {
        this.icdParent = icdParent == null ? null : icdParent.trim();
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