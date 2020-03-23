package com.junling.mis.model;

import java.util.Date;

public class claimWorkFlowEntity {
    private String claimWorkFlowId;

    private String claimNo;

    private String premNode;

    private String currentNode;

    private String customerId;

    private Date processStartTime;

    private Date processEndTime;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getClaimWorkFlowId() {
        return claimWorkFlowId;
    }

    public void setClaimWorkFlowId(String claimWorkFlowId) {
        this.claimWorkFlowId = claimWorkFlowId == null ? null : claimWorkFlowId.trim();
    }

    public String getClaimNo() {
        return claimNo;
    }

    public void setClaimNo(String claimNo) {
        this.claimNo = claimNo == null ? null : claimNo.trim();
    }

    public String getPremNode() {
        return premNode;
    }

    public void setPremNode(String premNode) {
        this.premNode = premNode == null ? null : premNode.trim();
    }

    public String getCurrentNode() {
        return currentNode;
    }

    public void setCurrentNode(String currentNode) {
        this.currentNode = currentNode == null ? null : currentNode.trim();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public Date getProcessStartTime() {
        return processStartTime;
    }

    public void setProcessStartTime(Date processStartTime) {
        this.processStartTime = processStartTime;
    }

    public Date getProcessEndTime() {
        return processEndTime;
    }

    public void setProcessEndTime(Date processEndTime) {
        this.processEndTime = processEndTime;
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