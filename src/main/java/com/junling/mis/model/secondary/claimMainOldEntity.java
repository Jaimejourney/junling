package com.junling.mis.model.secondary;

import java.util.Date;

public class claimMainOldEntity extends claimMainOldEntityKey {
    private String insuredId;

    private String docuStatus;

    private Date docuDate;

    private Date examDate;

    private Date endDate;

    private String isDirectBill;

    private Long examAmt;

    private String examResult;

    private String rejectCause;

    private String accdntResult;

    private String idno;

    private String name;

    private String idType;

    private String partnerId;

    private String reasoncode;

    private String sex;

    private String phone;

    private Date signDate;

    private Date approveDate;

    private String needMaterial;

    private String newOpinion;

    private Long prepaidpayamt;

    private String autocheck;

    private String pauseMark;

    private String terminate;

    private String zeronDeductible;

    private String caseformula;

    private String death;

    private String signautocheck;

    private String deathproblem;

    public String getInsuredId() {
        return insuredId;
    }

    public void setInsuredId(String insuredId) {
        this.insuredId = insuredId == null ? null : insuredId.trim();
    }

    public String getDocuStatus() {
        return docuStatus;
    }

    public void setDocuStatus(String docuStatus) {
        this.docuStatus = docuStatus == null ? null : docuStatus.trim();
    }

    public Date getDocuDate() {
        return docuDate;
    }

    public void setDocuDate(Date docuDate) {
        this.docuDate = docuDate;
    }

    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getIsDirectBill() {
        return isDirectBill;
    }

    public void setIsDirectBill(String isDirectBill) {
        this.isDirectBill = isDirectBill == null ? null : isDirectBill.trim();
    }

    public Long getExamAmt() {
        return examAmt;
    }

    public void setExamAmt(Long examAmt) {
        this.examAmt = examAmt;
    }

    public String getExamResult() {
        return examResult;
    }

    public void setExamResult(String examResult) {
        this.examResult = examResult == null ? null : examResult.trim();
    }

    public String getRejectCause() {
        return rejectCause;
    }

    public void setRejectCause(String rejectCause) {
        this.rejectCause = rejectCause == null ? null : rejectCause.trim();
    }

    public String getAccdntResult() {
        return accdntResult;
    }

    public void setAccdntResult(String accdntResult) {
        this.accdntResult = accdntResult == null ? null : accdntResult.trim();
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno == null ? null : idno.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType == null ? null : idType.trim();
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId == null ? null : partnerId.trim();
    }

    public String getReasoncode() {
        return reasoncode;
    }

    public void setReasoncode(String reasoncode) {
        this.reasoncode = reasoncode == null ? null : reasoncode.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    public Date getApproveDate() {
        return approveDate;
    }

    public void setApproveDate(Date approveDate) {
        this.approveDate = approveDate;
    }

    public String getNeedMaterial() {
        return needMaterial;
    }

    public void setNeedMaterial(String needMaterial) {
        this.needMaterial = needMaterial == null ? null : needMaterial.trim();
    }

    public String getNewOpinion() {
        return newOpinion;
    }

    public void setNewOpinion(String newOpinion) {
        this.newOpinion = newOpinion == null ? null : newOpinion.trim();
    }

    public Long getPrepaidpayamt() {
        return prepaidpayamt;
    }

    public void setPrepaidpayamt(Long prepaidpayamt) {
        this.prepaidpayamt = prepaidpayamt;
    }

    public String getAutocheck() {
        return autocheck;
    }

    public void setAutocheck(String autocheck) {
        this.autocheck = autocheck == null ? null : autocheck.trim();
    }

    public String getPauseMark() {
        return pauseMark;
    }

    public void setPauseMark(String pauseMark) {
        this.pauseMark = pauseMark == null ? null : pauseMark.trim();
    }

    public String getTerminate() {
        return terminate;
    }

    public void setTerminate(String terminate) {
        this.terminate = terminate == null ? null : terminate.trim();
    }

    public String getZeronDeductible() {
        return zeronDeductible;
    }

    public void setZeronDeductible(String zeronDeductible) {
        this.zeronDeductible = zeronDeductible == null ? null : zeronDeductible.trim();
    }

    public String getCaseformula() {
        return caseformula;
    }

    public void setCaseformula(String caseformula) {
        this.caseformula = caseformula == null ? null : caseformula.trim();
    }

    public String getDeath() {
        return death;
    }

    public void setDeath(String death) {
        this.death = death == null ? null : death.trim();
    }

    public String getSignautocheck() {
        return signautocheck;
    }

    public void setSignautocheck(String signautocheck) {
        this.signautocheck = signautocheck == null ? null : signautocheck.trim();
    }

    public String getDeathproblem() {
        return deathproblem;
    }

    public void setDeathproblem(String deathproblem) {
        this.deathproblem = deathproblem == null ? null : deathproblem.trim();
    }
}