package com.junling.mis.model.secondary;

import java.util.Date;

public class visitRecordProcessEntity {
    private Integer id;

    private String visitid;

    private String casestage;

    private String status;

    private String desc;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVisitid() {
        return visitid;
    }

    public void setVisitid(String visitid) {
        this.visitid = visitid == null ? null : visitid.trim();
    }

    public String getCasestage() {
        return casestage;
    }

    public void setCasestage(String casestage) {
        this.casestage = casestage == null ? null : casestage.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}