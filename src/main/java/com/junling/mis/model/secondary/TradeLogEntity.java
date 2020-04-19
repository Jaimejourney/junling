package com.junling.mis.model.secondary;

public class TradeLogEntity {
    private String tradeno;

    private String patientname;

    private String idcardno;

    private String bussid;

    public String getTradeno() {
        return tradeno;
    }

    public void setTradeno(String tradeno) {
        this.tradeno = tradeno == null ? null : tradeno.trim();
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname == null ? null : patientname.trim();
    }

    public String getIdcardno() {
        return idcardno;
    }

    public void setIdcardno(String idcardno) {
        this.idcardno = idcardno == null ? null : idcardno.trim();
    }

    public String getBussid() {
        return bussid;
    }

    public void setBussid(String bussid) {
        this.bussid = bussid == null ? null : bussid.trim();
    }
}