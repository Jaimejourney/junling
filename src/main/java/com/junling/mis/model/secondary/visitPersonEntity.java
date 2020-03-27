package com.junling.mis.model.secondary;

import java.math.BigDecimal;
import java.util.Date;

public class visitPersonEntity {
    private BigDecimal id;

    private String openid;

    private String name;

    private String phone;

    private String email;

    private Date createTime;

    private Date lastTime;

    private String cardId;

    private String updatePoson;

    private Date updateTime;

    private Long isDelete;

    private String userTypeRemark;

    private String calculateChannel;

    private String riskDetail;

    private String riskName;

    private String riskResult;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
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

    public String getUserTypeRemark() {
        return userTypeRemark;
    }

    public void setUserTypeRemark(String userTypeRemark) {
        this.userTypeRemark = userTypeRemark == null ? null : userTypeRemark.trim();
    }

    public String getCalculateChannel() {
        return calculateChannel;
    }

    public void setCalculateChannel(String calculateChannel) {
        this.calculateChannel = calculateChannel == null ? null : calculateChannel.trim();
    }

    public String getRiskDetail() {
        return riskDetail;
    }

    public void setRiskDetail(String riskDetail) {
        this.riskDetail = riskDetail == null ? null : riskDetail.trim();
    }

    public String getRiskName() {
        return riskName;
    }

    public void setRiskName(String riskName) {
        this.riskName = riskName == null ? null : riskName.trim();
    }

    public String getRiskResult() {
        return riskResult;
    }

    public void setRiskResult(String riskResult) {
        this.riskResult = riskResult == null ? null : riskResult.trim();
    }
}