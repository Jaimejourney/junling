package com.junling.mis.model;

import java.util.Date;

public class dutySubInfoEntity {
    private String dutySubId;

    private String dutySubCode;

    private String dutySubName;

    private String dutySubType;

    private String dutyId;

    private String required;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getDutySubId() {
        return dutySubId;
    }

    public void setDutySubId(String dutySubId) {
        this.dutySubId = dutySubId == null ? null : dutySubId.trim();
    }

    public String getDutySubCode() {
        return dutySubCode;
    }

    public void setDutySubCode(String dutySubCode) {
        this.dutySubCode = dutySubCode == null ? null : dutySubCode.trim();
    }

    public String getDutySubName() {
        return dutySubName;
    }

    public void setDutySubName(String dutySubName) {
        this.dutySubName = dutySubName == null ? null : dutySubName.trim();
    }

    public String getDutySubType() {
        return dutySubType;
    }

    public void setDutySubType(String dutySubType) {
        this.dutySubType = dutySubType == null ? null : dutySubType.trim();
    }

    public String getDutyId() {
        return dutyId;
    }

    public void setDutyId(String dutyId) {
        this.dutyId = dutyId == null ? null : dutyId.trim();
    }

    public String getRequired() {
        return required;
    }

    public void setRequired(String required) {
        this.required = required == null ? null : required.trim();
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