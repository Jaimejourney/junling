package com.junling.mis.model.secondary;

public class electronicMedicalEntityWithBLOBs extends electronicMedicalEntity {
    private String historypresentillness;

    private String pastdiseasehistory;

    private String personalhistory;

    private String obstetricalhistory;

    private String menstruationhistory;

    private String familyhistory;

    private String diagnosistreatment;

    private String attendingphysician;

    private String dischargestatus;

    private String dischargeorder;

    public String getHistorypresentillness() {
        return historypresentillness;
    }

    public void setHistorypresentillness(String historypresentillness) {
        this.historypresentillness = historypresentillness == null ? null : historypresentillness.trim();
    }

    public String getPastdiseasehistory() {
        return pastdiseasehistory;
    }

    public void setPastdiseasehistory(String pastdiseasehistory) {
        this.pastdiseasehistory = pastdiseasehistory == null ? null : pastdiseasehistory.trim();
    }

    public String getPersonalhistory() {
        return personalhistory;
    }

    public void setPersonalhistory(String personalhistory) {
        this.personalhistory = personalhistory == null ? null : personalhistory.trim();
    }

    public String getObstetricalhistory() {
        return obstetricalhistory;
    }

    public void setObstetricalhistory(String obstetricalhistory) {
        this.obstetricalhistory = obstetricalhistory == null ? null : obstetricalhistory.trim();
    }

    public String getMenstruationhistory() {
        return menstruationhistory;
    }

    public void setMenstruationhistory(String menstruationhistory) {
        this.menstruationhistory = menstruationhistory == null ? null : menstruationhistory.trim();
    }

    public String getFamilyhistory() {
        return familyhistory;
    }

    public void setFamilyhistory(String familyhistory) {
        this.familyhistory = familyhistory == null ? null : familyhistory.trim();
    }

    public String getDiagnosistreatment() {
        return diagnosistreatment;
    }

    public void setDiagnosistreatment(String diagnosistreatment) {
        this.diagnosistreatment = diagnosistreatment == null ? null : diagnosistreatment.trim();
    }

    public String getAttendingphysician() {
        return attendingphysician;
    }

    public void setAttendingphysician(String attendingphysician) {
        this.attendingphysician = attendingphysician == null ? null : attendingphysician.trim();
    }

    public String getDischargestatus() {
        return dischargestatus;
    }

    public void setDischargestatus(String dischargestatus) {
        this.dischargestatus = dischargestatus == null ? null : dischargestatus.trim();
    }

    public String getDischargeorder() {
        return dischargeorder;
    }

    public void setDischargeorder(String dischargeorder) {
        this.dischargeorder = dischargeorder == null ? null : dischargeorder.trim();
    }
}