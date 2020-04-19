package com.junling.mis.model.secondary;

public class MisDateEntity {
    private String misDate;

    private Integer isRest;

    public String getMisDate() {
        return misDate;
    }

    public void setMisDate(String misDate) {
        this.misDate = misDate == null ? null : misDate.trim();
    }

    public Integer getIsRest() {
        return isRest;
    }

    public void setIsRest(Integer isRest) {
        this.isRest = isRest;
    }
}