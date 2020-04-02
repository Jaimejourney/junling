package com.junling.mis.model.primary;

import java.util.Date;

public class policyShareCoverage extends policyShareCoverageKey {
    private String policyNo;

    private Integer policyGradeLevelNo;

    private String productId;

    private String dutyId;

    private String subDutyId;

    private Integer shareCoverage;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo == null ? null : policyNo.trim();
    }

    public Integer getPolicyGradeLevelNo() {
        return policyGradeLevelNo;
    }

    public void setPolicyGradeLevelNo(Integer policyGradeLevelNo) {
        this.policyGradeLevelNo = policyGradeLevelNo;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getDutyId() {
        return dutyId;
    }

    public void setDutyId(String dutyId) {
        this.dutyId = dutyId == null ? null : dutyId.trim();
    }

    public String getSubDutyId() {
        return subDutyId;
    }

    public void setSubDutyId(String subDutyId) {
        this.subDutyId = subDutyId == null ? null : subDutyId.trim();
    }

    public Integer getShareCoverage() {
        return shareCoverage;
    }

    public void setShareCoverage(Integer shareCoverage) {
        this.shareCoverage = shareCoverage;
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