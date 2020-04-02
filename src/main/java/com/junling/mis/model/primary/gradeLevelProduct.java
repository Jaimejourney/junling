package com.junling.mis.model.primary;

import java.util.Date;

public class gradeLevelProduct {
    private String gradeLevelProductId;

    private String gradeLevelId;

    private String productId;

    private Integer glpPeriod;

    private Integer glpTotalPrem;

    private Integer glpTotalCoverage;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    private String glpSpecialContract;

    public String getGradeLevelProductId() {
        return gradeLevelProductId;
    }

    public void setGradeLevelProductId(String gradeLevelProductId) {
        this.gradeLevelProductId = gradeLevelProductId == null ? null : gradeLevelProductId.trim();
    }

    public String getGradeLevelId() {
        return gradeLevelId;
    }

    public void setGradeLevelId(String gradeLevelId) {
        this.gradeLevelId = gradeLevelId == null ? null : gradeLevelId.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public Integer getGlpPeriod() {
        return glpPeriod;
    }

    public void setGlpPeriod(Integer glpPeriod) {
        this.glpPeriod = glpPeriod;
    }

    public Integer getGlpTotalPrem() {
        return glpTotalPrem;
    }

    public void setGlpTotalPrem(Integer glpTotalPrem) {
        this.glpTotalPrem = glpTotalPrem;
    }

    public Integer getGlpTotalCoverage() {
        return glpTotalCoverage;
    }

    public void setGlpTotalCoverage(Integer glpTotalCoverage) {
        this.glpTotalCoverage = glpTotalCoverage;
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

    public String getGlpSpecialContract() {
        return glpSpecialContract;
    }

    public void setGlpSpecialContract(String glpSpecialContract) {
        this.glpSpecialContract = glpSpecialContract == null ? null : glpSpecialContract.trim();
    }
}