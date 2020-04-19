package com.junling.mis.model.secondary;

import java.util.Date;

public class ItemTypeTblEntity {
    private String itemTypeCode;

    private String description;

    private String updatePoson;

    private Date updateTime;

    private Long isDelete;

    public String getItemTypeCode() {
        return itemTypeCode;
    }

    public void setItemTypeCode(String itemTypeCode) {
        this.itemTypeCode = itemTypeCode == null ? null : itemTypeCode.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getUpdatePoson() {
        return updatePoson;
    }

    public void setUpdatePoson(String updatePoson) {
        this.updatePoson = updatePoson == null ? null : updatePoson.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Long isDelete) {
        this.isDelete = isDelete;
    }
}