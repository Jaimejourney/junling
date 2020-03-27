package com.junling.mis.model.secondary;

import java.util.Date;

public class itemLevelTblEntity {
    private String itemLevelCode;

    private String description;

    private String updatePoson;

    private Date updateTime;

    private Long isDelete;

    public String getItemLevelCode() {
        return itemLevelCode;
    }

    public void setItemLevelCode(String itemLevelCode) {
        this.itemLevelCode = itemLevelCode == null ? null : itemLevelCode.trim();
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