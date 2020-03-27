package com.junling.mis.model.primary;

import java.util.Date;

public class tbCwfNodeEntity {
    private String cwfNode;

    private String cwfNodeName;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getCwfNode() {
        return cwfNode;
    }

    public void setCwfNode(String cwfNode) {
        this.cwfNode = cwfNode == null ? null : cwfNode.trim();
    }

    public String getCwfNodeName() {
        return cwfNodeName;
    }

    public void setCwfNodeName(String cwfNodeName) {
        this.cwfNodeName = cwfNodeName == null ? null : cwfNodeName.trim();
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