package com.junling.mis.model.primary;

import java.util.Date;

public class tbIdType {
    private String idTypeCode;

    private String idTypeName;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getIdTypeCode() {
        return idTypeCode;
    }

    public void setIdTypeCode(String idTypeCode) {
        this.idTypeCode = idTypeCode == null ? null : idTypeCode.trim();
    }

    public String getIdTypeName() {
        return idTypeName;
    }

    public void setIdTypeName(String idTypeName) {
        this.idTypeName = idTypeName == null ? null : idTypeName.trim();
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