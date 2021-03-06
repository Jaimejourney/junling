package com.junling.mis.model.primary;

import java.util.Date;

public class PolicyGradeLevel {
    private String policyGradeLevelId;

    private String policyNo;

    private Integer policyGradeLevelNo;

    private String policyGradeLevelName;

    private Integer pglTotalPrem;

    private Integer pglBaseCoverage;

    private String pglCoveredArea;

    private String pglDes;

    private String pglSpecialContract;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getPolicyGradeLevelId() {
        return policyGradeLevelId;
    }

    public void setPolicyGradeLevelId(String policyGradeLevelId) {
        this.policyGradeLevelId = policyGradeLevelId == null ? null : policyGradeLevelId.trim();
    }

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

    public String getPolicyGradeLevelName() {
        return policyGradeLevelName;
    }

    public void setPolicyGradeLevelName(String policyGradeLevelName) {
        this.policyGradeLevelName = policyGradeLevelName == null ? null : policyGradeLevelName.trim();
    }

    public Integer getPglTotalPrem() {
        return pglTotalPrem;
    }

    public void setPglTotalPrem(Integer pglTotalPrem) {
        this.pglTotalPrem = pglTotalPrem;
    }

    public Integer getPglBaseCoverage() {
        return pglBaseCoverage;
    }

    public void setPglBaseCoverage(Integer pglBaseCoverage) {
        this.pglBaseCoverage = pglBaseCoverage;
    }

    public String getPglCoveredArea() {
        return pglCoveredArea;
    }

    public void setPglCoveredArea(String pglCoveredArea) {
        this.pglCoveredArea = pglCoveredArea == null ? null : pglCoveredArea.trim();
    }

    public String getPglDes() {
        return pglDes;
    }

    public void setPglDes(String pglDes) {
        this.pglDes = pglDes == null ? null : pglDes.trim();
    }

    public String getPglSpecialContract() {
        return pglSpecialContract;
    }

    public void setPglSpecialContract(String pglSpecialContract) {
        this.pglSpecialContract = pglSpecialContract == null ? null : pglSpecialContract.trim();
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