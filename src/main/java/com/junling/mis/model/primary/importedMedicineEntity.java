package com.junling.mis.model.primary;

public class importedMedicineEntity {
    private String chineseProductName;

    private String chineseFormulation;

    private String chinesePackingSpecification;

    private String productCategory;

    public String getChineseProductName() {
        return chineseProductName;
    }

    public void setChineseProductName(String chineseProductName) {
        this.chineseProductName = chineseProductName == null ? null : chineseProductName.trim();
    }

    public String getChineseFormulation() {
        return chineseFormulation;
    }

    public void setChineseFormulation(String chineseFormulation) {
        this.chineseFormulation = chineseFormulation == null ? null : chineseFormulation.trim();
    }

    public String getChinesePackingSpecification() {
        return chinesePackingSpecification;
    }

    public void setChinesePackingSpecification(String chinesePackingSpecification) {
        this.chinesePackingSpecification = chinesePackingSpecification == null ? null : chinesePackingSpecification.trim();
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory == null ? null : productCategory.trim();
    }
}