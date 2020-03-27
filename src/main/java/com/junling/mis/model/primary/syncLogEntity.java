package com.junling.mis.model.primary;

import java.util.Date;

public class syncLogEntity {
    private String tableName;

    private Date lastUpdateTime;

    private String lastId;

    private Boolean underway;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getLastId() {
        return lastId;
    }

    public void setLastId(String lastId) {
        this.lastId = lastId == null ? null : lastId.trim();
    }

    public Boolean getUnderway() {
        return underway;
    }

    public void setUnderway(Boolean underway) {
        this.underway = underway;
    }
}