package com.junling.mis.model.secondary;

import java.util.Date;

public class polMainEntity {
    private String polno;

    private Date effDate;

    private Date matuDate;

    private String polStatus;

    private String polType;

    public String getPolno() {
        return polno;
    }

    public void setPolno(String polno) {
        this.polno = polno == null ? null : polno.trim();
    }

    public Date getEffDate() {
        return effDate;
    }

    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public Date getMatuDate() {
        return matuDate;
    }

    public void setMatuDate(Date matuDate) {
        this.matuDate = matuDate;
    }

    public String getPolStatus() {
        return polStatus;
    }

    public void setPolStatus(String polStatus) {
        this.polStatus = polStatus == null ? null : polStatus.trim();
    }

    public String getPolType() {
        return polType;
    }

    public void setPolType(String polType) {
        this.polType = polType == null ? null : polType.trim();
    }
}