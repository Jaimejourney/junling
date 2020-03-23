package com.junling.mis.model;

import java.math.BigDecimal;
import java.util.Date;

public class gradeLevelEntity {
    private String gradeLevelId;

    private String gradeLevelNo;

    private String organizationId;

    private String gradeLevelName;

    private String gradeLevelType;

    private Date gradeLevelStartTime;

    private Date gradeLevelEndTime;

    private String gradeLevelStatus;

    private BigDecimal gradeLevelPeriod;

    private BigDecimal glTotalPrem;

    private BigDecimal glTotalCoverage;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    private String gradeLevelDes;

    public String getGradeLevelId() {
        return gradeLevelId;
    }

    public void setGradeLevelId(String gradeLevelId) {
        this.gradeLevelId = gradeLevelId == null ? null : gradeLevelId.trim();
    }

    public String getGradeLevelNo() {
        return gradeLevelNo;
    }

    public void setGradeLevelNo(String gradeLevelNo) {
        this.gradeLevelNo = gradeLevelNo == null ? null : gradeLevelNo.trim();
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId == null ? null : organizationId.trim();
    }

    public String getGradeLevelName() {
        return gradeLevelName;
    }

    public void setGradeLevelName(String gradeLevelName) {
        this.gradeLevelName = gradeLevelName == null ? null : gradeLevelName.trim();
    }

    public String getGradeLevelType() {
        return gradeLevelType;
    }

    public void setGradeLevelType(String gradeLevelType) {
        this.gradeLevelType = gradeLevelType == null ? null : gradeLevelType.trim();
    }

    public Date getGradeLevelStartTime() {
        return gradeLevelStartTime;
    }

    public void setGradeLevelStartTime(Date gradeLevelStartTime) {
        this.gradeLevelStartTime = gradeLevelStartTime;
    }

    public Date getGradeLevelEndTime() {
        return gradeLevelEndTime;
    }

    public void setGradeLevelEndTime(Date gradeLevelEndTime) {
        this.gradeLevelEndTime = gradeLevelEndTime;
    }

    public String getGradeLevelStatus() {
        return gradeLevelStatus;
    }

    public void setGradeLevelStatus(String gradeLevelStatus) {
        this.gradeLevelStatus = gradeLevelStatus == null ? null : gradeLevelStatus.trim();
    }

    public BigDecimal getGradeLevelPeriod() {
        return gradeLevelPeriod;
    }

    public void setGradeLevelPeriod(BigDecimal gradeLevelPeriod) {
        this.gradeLevelPeriod = gradeLevelPeriod;
    }

    public BigDecimal getGlTotalPrem() {
        return glTotalPrem;
    }

    public void setGlTotalPrem(BigDecimal glTotalPrem) {
        this.glTotalPrem = glTotalPrem;
    }

    public BigDecimal getGlTotalCoverage() {
        return glTotalCoverage;
    }

    public void setGlTotalCoverage(BigDecimal glTotalCoverage) {
        this.glTotalCoverage = glTotalCoverage;
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

    public String getGradeLevelDes() {
        return gradeLevelDes;
    }

    public void setGradeLevelDes(String gradeLevelDes) {
        this.gradeLevelDes = gradeLevelDes == null ? null : gradeLevelDes.trim();
    }
}