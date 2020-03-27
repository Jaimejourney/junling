package com.junling.mis.model.secondary;

import java.util.Date;

public class electronicMedicalEntity {
    private Integer id;

    private String medicalnum;

    private String hospitalrecordid;

    private String inhospitalnum;

    private String cheifcomplaint;

    private String medicalabstract;

    private String physicalexamination;

    private String juniorcollege;

    private String auxiliaryexamination;

    private String totalrecordinfo;

    private Date createdDate;

    private Date updatedDate;

    private String sendtradenum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMedicalnum() {
        return medicalnum;
    }

    public void setMedicalnum(String medicalnum) {
        this.medicalnum = medicalnum == null ? null : medicalnum.trim();
    }

    public String getHospitalrecordid() {
        return hospitalrecordid;
    }

    public void setHospitalrecordid(String hospitalrecordid) {
        this.hospitalrecordid = hospitalrecordid == null ? null : hospitalrecordid.trim();
    }

    public String getInhospitalnum() {
        return inhospitalnum;
    }

    public void setInhospitalnum(String inhospitalnum) {
        this.inhospitalnum = inhospitalnum == null ? null : inhospitalnum.trim();
    }

    public String getCheifcomplaint() {
        return cheifcomplaint;
    }

    public void setCheifcomplaint(String cheifcomplaint) {
        this.cheifcomplaint = cheifcomplaint == null ? null : cheifcomplaint.trim();
    }

    public String getMedicalabstract() {
        return medicalabstract;
    }

    public void setMedicalabstract(String medicalabstract) {
        this.medicalabstract = medicalabstract == null ? null : medicalabstract.trim();
    }

    public String getPhysicalexamination() {
        return physicalexamination;
    }

    public void setPhysicalexamination(String physicalexamination) {
        this.physicalexamination = physicalexamination == null ? null : physicalexamination.trim();
    }

    public String getJuniorcollege() {
        return juniorcollege;
    }

    public void setJuniorcollege(String juniorcollege) {
        this.juniorcollege = juniorcollege == null ? null : juniorcollege.trim();
    }

    public String getAuxiliaryexamination() {
        return auxiliaryexamination;
    }

    public void setAuxiliaryexamination(String auxiliaryexamination) {
        this.auxiliaryexamination = auxiliaryexamination == null ? null : auxiliaryexamination.trim();
    }

    public String getTotalrecordinfo() {
        return totalrecordinfo;
    }

    public void setTotalrecordinfo(String totalrecordinfo) {
        this.totalrecordinfo = totalrecordinfo == null ? null : totalrecordinfo.trim();
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

    public String getSendtradenum() {
        return sendtradenum;
    }

    public void setSendtradenum(String sendtradenum) {
        this.sendtradenum = sendtradenum == null ? null : sendtradenum.trim();
    }
}