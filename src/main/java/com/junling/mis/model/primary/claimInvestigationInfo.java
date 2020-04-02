package com.junling.mis.model.primary;

import java.util.Date;

public class claimInvestigationInfo {
    private String claimInvestigationInfoId;

    private String claimNo;

    private String applyTime;

    private String description;

    private String userId;

    private String reply;

    private String replyTime;

    private String investigationConclusion;

    private String investigationUnit;

    private String investigationScope;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getClaimInvestigationInfoId() {
        return claimInvestigationInfoId;
    }

    public void setClaimInvestigationInfoId(String claimInvestigationInfoId) {
        this.claimInvestigationInfoId = claimInvestigationInfoId == null ? null : claimInvestigationInfoId.trim();
    }

    public String getClaimNo() {
        return claimNo;
    }

    public void setClaimNo(String claimNo) {
        this.claimNo = claimNo == null ? null : claimNo.trim();
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime == null ? null : applyTime.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply == null ? null : reply.trim();
    }

    public String getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(String replyTime) {
        this.replyTime = replyTime == null ? null : replyTime.trim();
    }

    public String getInvestigationConclusion() {
        return investigationConclusion;
    }

    public void setInvestigationConclusion(String investigationConclusion) {
        this.investigationConclusion = investigationConclusion == null ? null : investigationConclusion.trim();
    }

    public String getInvestigationUnit() {
        return investigationUnit;
    }

    public void setInvestigationUnit(String investigationUnit) {
        this.investigationUnit = investigationUnit == null ? null : investigationUnit.trim();
    }

    public String getInvestigationScope() {
        return investigationScope;
    }

    public void setInvestigationScope(String investigationScope) {
        this.investigationScope = investigationScope == null ? null : investigationScope.trim();
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