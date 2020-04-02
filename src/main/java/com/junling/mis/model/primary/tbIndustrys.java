package com.junling.mis.model.primary;

import java.util.Date;

public class tbIndustrys {
    private String industryTypeCode;

    private String industryTypeName;

    private String industryTypeParent;

    private String industryTypeLevel;

    private String industryTypeRemark;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getIndustryTypeCode() {
        return industryTypeCode;
    }

    public void setIndustryTypeCode(String industryTypeCode) {
        this.industryTypeCode = industryTypeCode == null ? null : industryTypeCode.trim();
    }

    public String getIndustryTypeName() {
        return industryTypeName;
    }

    public void setIndustryTypeName(String industryTypeName) {
        this.industryTypeName = industryTypeName == null ? null : industryTypeName.trim();
    }

    public String getIndustryTypeParent() {
        return industryTypeParent;
    }

    public void setIndustryTypeParent(String industryTypeParent) {
        this.industryTypeParent = industryTypeParent == null ? null : industryTypeParent.trim();
    }

    public String getIndustryTypeLevel() {
        return industryTypeLevel;
    }

    public void setIndustryTypeLevel(String industryTypeLevel) {
        this.industryTypeLevel = industryTypeLevel == null ? null : industryTypeLevel.trim();
    }

    public String getIndustryTypeRemark() {
        return industryTypeRemark;
    }

    public void setIndustryTypeRemark(String industryTypeRemark) {
        this.industryTypeRemark = industryTypeRemark == null ? null : industryTypeRemark.trim();
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