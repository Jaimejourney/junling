package com.junling.mis.model.secondary;

public class VisitImageEntityWithBLOBs extends VisitImageEntity {
    private String idCard;

    private String originalCertificate;

    private String detailList;

    private String hospitalRecords;

    private String accidentProof;

    private String outpatientRecords;

    private String biochemicalReport;

    private String medicalReport;

    private String otherReport;

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getOriginalCertificate() {
        return originalCertificate;
    }

    public void setOriginalCertificate(String originalCertificate) {
        this.originalCertificate = originalCertificate == null ? null : originalCertificate.trim();
    }

    public String getDetailList() {
        return detailList;
    }

    public void setDetailList(String detailList) {
        this.detailList = detailList == null ? null : detailList.trim();
    }

    public String getHospitalRecords() {
        return hospitalRecords;
    }

    public void setHospitalRecords(String hospitalRecords) {
        this.hospitalRecords = hospitalRecords == null ? null : hospitalRecords.trim();
    }

    public String getAccidentProof() {
        return accidentProof;
    }

    public void setAccidentProof(String accidentProof) {
        this.accidentProof = accidentProof == null ? null : accidentProof.trim();
    }

    public String getOutpatientRecords() {
        return outpatientRecords;
    }

    public void setOutpatientRecords(String outpatientRecords) {
        this.outpatientRecords = outpatientRecords == null ? null : outpatientRecords.trim();
    }

    public String getBiochemicalReport() {
        return biochemicalReport;
    }

    public void setBiochemicalReport(String biochemicalReport) {
        this.biochemicalReport = biochemicalReport == null ? null : biochemicalReport.trim();
    }

    public String getMedicalReport() {
        return medicalReport;
    }

    public void setMedicalReport(String medicalReport) {
        this.medicalReport = medicalReport == null ? null : medicalReport.trim();
    }

    public String getOtherReport() {
        return otherReport;
    }

    public void setOtherReport(String otherReport) {
        this.otherReport = otherReport == null ? null : otherReport.trim();
    }
}