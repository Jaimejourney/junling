package com.junling.mis.model;

public class productDutyEntityKey {
    private String productDutyId;

    private String productId;

    public String getProductDutyId() {
        return productDutyId;
    }

    public void setProductDutyId(String productDutyId) {
        this.productDutyId = productDutyId == null ? null : productDutyId.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }
}