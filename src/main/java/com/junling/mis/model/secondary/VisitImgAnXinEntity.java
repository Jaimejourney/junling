package com.junling.mis.model.secondary;

import java.util.Date;

public class VisitImgAnXinEntity {
    private Integer id;

    private Long imageId;

    private String picKey;

    private String imageType;

    private String imageStatus;

    private String fromImgUrl;

    private String imageUrl;

    private Date createTime;

    private Date updateTime;

    private String userId;

    private String fasdImgUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getImageId() {
        return imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    public String getPicKey() {
        return picKey;
    }

    public void setPicKey(String picKey) {
        this.picKey = picKey == null ? null : picKey.trim();
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType == null ? null : imageType.trim();
    }

    public String getImageStatus() {
        return imageStatus;
    }

    public void setImageStatus(String imageStatus) {
        this.imageStatus = imageStatus == null ? null : imageStatus.trim();
    }

    public String getFromImgUrl() {
        return fromImgUrl;
    }

    public void setFromImgUrl(String fromImgUrl) {
        this.fromImgUrl = fromImgUrl == null ? null : fromImgUrl.trim();
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getFasdImgUrl() {
        return fasdImgUrl;
    }

    public void setFasdImgUrl(String fasdImgUrl) {
        this.fasdImgUrl = fasdImgUrl == null ? null : fasdImgUrl.trim();
    }
}