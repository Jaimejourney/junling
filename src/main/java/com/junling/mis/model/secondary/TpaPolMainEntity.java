package com.junling.mis.model.secondary;

import java.util.Date;

public class TpaPolMainEntity {
    private Long id;

    private String polno;

    private String insuredName;

    private String premium;

    private Date effDate;

    private Date matuDate;

    private String polStatus;

    private String polType;

    private String specialAgreement;

    private String source;

    private String createdBy;

    private Date createdDate;

    private String updatedBy;

    private Date updatedDate;

    private String certno;

    private String sourceDesc;

    private String grpContno;

    private String xbidentification;

    private String ybidentification;

    private String oldPolno;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPolno() {
        return polno;
    }

    public void setPolno(String polno) {
        this.polno = polno == null ? null : polno.trim();
    }

    public String getInsuredName() {
        return insuredName;
    }

    public void setInsuredName(String insuredName) {
        this.insuredName = insuredName == null ? null : insuredName.trim();
    }

    public String getPremium() {
        return premium;
    }

    public void setPremium(String premium) {
        this.premium = premium == null ? null : premium.trim();
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

    public String getSpecialAgreement() {
        return specialAgreement;
    }

    public void setSpecialAgreement(String specialAgreement) {
        this.specialAgreement = specialAgreement == null ? null : specialAgreement.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getCertno() {
        return certno;
    }

    public void setCertno(String certno) {
        this.certno = certno == null ? null : certno.trim();
    }

    public String getSourceDesc() {
        return sourceDesc;
    }

    public void setSourceDesc(String sourceDesc) {
        this.sourceDesc = sourceDesc == null ? null : sourceDesc.trim();
    }

    public String getGrpContno() {
        return grpContno;
    }

    public void setGrpContno(String grpContno) {
        this.grpContno = grpContno == null ? null : grpContno.trim();
    }

    public String getXbidentification() {
        return xbidentification;
    }

    public void setXbidentification(String xbidentification) {
        this.xbidentification = xbidentification == null ? null : xbidentification.trim();
    }

    public String getYbidentification() {
        return ybidentification;
    }

    public void setYbidentification(String ybidentification) {
        this.ybidentification = ybidentification == null ? null : ybidentification.trim();
    }

    public String getOldPolno() {
        return oldPolno;
    }

    public void setOldPolno(String oldPolno) {
        this.oldPolno = oldPolno == null ? null : oldPolno.trim();
    }
}