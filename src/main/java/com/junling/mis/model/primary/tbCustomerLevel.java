package com.junling.mis.model.primary;

import java.util.Date;

public class tbCustomerLevel {
    private String customerLevelCode;

    private String customerLevelName;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getCustomerLevelCode() {
        return customerLevelCode;
    }

    public void setCustomerLevelCode(String customerLevelCode) {
        this.customerLevelCode = customerLevelCode == null ? null : customerLevelCode.trim();
    }

    public String getCustomerLevelName() {
        return customerLevelName;
    }

    public void setCustomerLevelName(String customerLevelName) {
        this.customerLevelName = customerLevelName == null ? null : customerLevelName.trim();
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