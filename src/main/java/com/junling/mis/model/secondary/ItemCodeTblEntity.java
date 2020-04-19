package com.junling.mis.model.secondary;

import java.math.BigDecimal;
import java.util.Date;

public class ItemCodeTblEntity {
    private String itemId;

    private String hospitalCode;

    private String itemCode;

    private String itemName;

    private String itemStatus;

    private String itemLevel;

    private String itemType;

    private String itemCategory;

    private BigDecimal itemPrice;

    private String ownPayRate;

    private String itemSpec;

    private String dosageForms;

    private String itemPackage;

    private Date effDate;

    private Date expiryDate;

    private String itemUnit;

    private String itemManufacturer;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    public String getHospitalCode() {
        return hospitalCode;
    }

    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode == null ? null : hospitalCode.trim();
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode == null ? null : itemCode.trim();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus == null ? null : itemStatus.trim();
    }

    public String getItemLevel() {
        return itemLevel;
    }

    public void setItemLevel(String itemLevel) {
        this.itemLevel = itemLevel == null ? null : itemLevel.trim();
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType == null ? null : itemType.trim();
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory == null ? null : itemCategory.trim();
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getOwnPayRate() {
        return ownPayRate;
    }

    public void setOwnPayRate(String ownPayRate) {
        this.ownPayRate = ownPayRate == null ? null : ownPayRate.trim();
    }

    public String getItemSpec() {
        return itemSpec;
    }

    public void setItemSpec(String itemSpec) {
        this.itemSpec = itemSpec == null ? null : itemSpec.trim();
    }

    public String getDosageForms() {
        return dosageForms;
    }

    public void setDosageForms(String dosageForms) {
        this.dosageForms = dosageForms == null ? null : dosageForms.trim();
    }

    public String getItemPackage() {
        return itemPackage;
    }

    public void setItemPackage(String itemPackage) {
        this.itemPackage = itemPackage == null ? null : itemPackage.trim();
    }

    public Date getEffDate() {
        return effDate;
    }

    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getItemUnit() {
        return itemUnit;
    }

    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit == null ? null : itemUnit.trim();
    }

    public String getItemManufacturer() {
        return itemManufacturer;
    }

    public void setItemManufacturer(String itemManufacturer) {
        this.itemManufacturer = itemManufacturer == null ? null : itemManufacturer.trim();
    }
}