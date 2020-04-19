package com.junling.mis.model.secondary;

public class ClaimMainEntityWithBLOBs extends ClaimMainEntity {
    private String replyOpin;

    private String remark;

    public String getReplyOpin() {
        return replyOpin;
    }

    public void setReplyOpin(String replyOpin) {
        this.replyOpin = replyOpin == null ? null : replyOpin.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}