package com.junling.mis.model.primary;

import java.util.Date;

public class PolicyPublicCoverage {
    private String policyPublicCoverageId;

    private String policyNo;

    private Integer publicCoverage;

    private Integer publicCoverageLeft;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getPolicyPublicCoverageId() {
        return policyPublicCoverageId;
    }

    public void setPolicyPublicCoverageId(String policyPublicCoverageId) {
        this.policyPublicCoverageId = policyPublicCoverageId == null ? null : policyPublicCoverageId.trim();
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo == null ? null : policyNo.trim();
    }

    public Integer getPublicCoverage() {
        return publicCoverage;
    }

    public void setPublicCoverage(Integer publicCoverage) {
        this.publicCoverage = publicCoverage;
    }

    public Integer getPublicCoverageLeft() {
        return publicCoverageLeft;
    }

    public void setPublicCoverageLeft(Integer publicCoverageLeft) {
        this.publicCoverageLeft = publicCoverageLeft;
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