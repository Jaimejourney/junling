package com.junling.mis.model.primary;

import java.util.Date;

public class tbAccidentType {
    private String accidentTypeCode;

    private String accidentTypeName;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getAccidentTypeCode() {
        return accidentTypeCode;
    }

    public void setAccidentTypeCode(String accidentTypeCode) {
        this.accidentTypeCode = accidentTypeCode == null ? null : accidentTypeCode.trim();
    }

    public String getAccidentTypeName() {
        return accidentTypeName;
    }

    public void setAccidentTypeName(String accidentTypeName) {
        this.accidentTypeName = accidentTypeName == null ? null : accidentTypeName.trim();
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