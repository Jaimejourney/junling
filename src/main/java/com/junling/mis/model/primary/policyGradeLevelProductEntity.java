package com.junling.mis.model.primary;

import java.math.BigDecimal;
import java.util.Date;

public class policyGradeLevelProductEntity {
    private String pglProductId;

    private String policyNo;

    private BigDecimal policyGradeLevelNo;

    private String productId;

    private BigDecimal pglProductTotalPrem;

    private BigDecimal pglProductBaseCoverage;

    private String pglProductDes;

    private String pglProductSpecialContract;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getPglProductId() {
        return pglProductId;
    }

    public void setPglProductId(String pglProductId) {
        this.pglProductId = pglProductId == null ? null : pglProductId.trim();
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo == null ? null : policyNo.trim();
    }

    public BigDecimal getPolicyGradeLevelNo() {
        return policyGradeLevelNo;
    }

    public void setPolicyGradeLevelNo(BigDecimal policyGradeLevelNo) {
        this.policyGradeLevelNo = policyGradeLevelNo;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public BigDecimal getPglProductTotalPrem() {
        return pglProductTotalPrem;
    }

    public void setPglProductTotalPrem(BigDecimal pglProductTotalPrem) {
        this.pglProductTotalPrem = pglProductTotalPrem;
    }

    public BigDecimal getPglProductBaseCoverage() {
        return pglProductBaseCoverage;
    }

    public void setPglProductBaseCoverage(BigDecimal pglProductBaseCoverage) {
        this.pglProductBaseCoverage = pglProductBaseCoverage;
    }

    public String getPglProductDes() {
        return pglProductDes;
    }

    public void setPglProductDes(String pglProductDes) {
        this.pglProductDes = pglProductDes == null ? null : pglProductDes.trim();
    }

    public String getPglProductSpecialContract() {
        return pglProductSpecialContract;
    }

    public void setPglProductSpecialContract(String pglProductSpecialContract) {
        this.pglProductSpecialContract = pglProductSpecialContract == null ? null : pglProductSpecialContract.trim();
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