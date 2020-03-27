package com.junling.mis.model.secondary;

import java.util.Date;

public class docunoChangeEntity {
    private Integer id;

    private String oldDocuno;

    private String newDocuno;

    private Date createdDate;

    private Date updatedDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOldDocuno() {
        return oldDocuno;
    }

    public void setOldDocuno(String oldDocuno) {
        this.oldDocuno = oldDocuno == null ? null : oldDocuno.trim();
    }

    public String getNewDocuno() {
        return newDocuno;
    }

    public void setNewDocuno(String newDocuno) {
        this.newDocuno = newDocuno == null ? null : newDocuno.trim();
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}