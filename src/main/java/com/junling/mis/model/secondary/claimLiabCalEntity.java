package com.junling.mis.model.secondary;

import java.util.Date;

public class claimLiabCalEntity {
    private String id;

    private String docuno;

    private String polno;

    private String planCode;

    private String gradeLevel;

    private String benefitCode;

    private Long calAmt;

    private Long examAmt;

    private Long deductibleAmt;

    private String insuredId;

    private String updatePoson;

    private Date updateTime;

    private Long isDelete;

    private String amtCur;

    private String payResult;

    private String refusePayReason;

    private Long billAmt;

    private String accno;

    private String riskcode;

    private String riskname;

    private Long declineamt;

    private String benefitName;

    private String examcomment;

    private String planName;

    private Long paidamnt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDocuno() {
        return docuno;
    }

    public void setDocuno(String docuno) {
        this.docuno = docuno == null ? null : docuno.trim();
    }

    public String getPolno() {
        return polno;
    }

    public void setPolno(String polno) {
        this.polno = polno == null ? null : polno.trim();
    }

    public String getPlanCode() {
        return planCode;
    }

    public void setPlanCode(String planCode) {
        this.planCode = planCode == null ? null : planCode.trim();
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel == null ? null : gradeLevel.trim();
    }

    public String getBenefitCode() {
        return benefitCode;
    }

    public void setBenefitCode(String benefitCode) {
        this.benefitCode = benefitCode == null ? null : benefitCode.trim();
    }

    public Long getCalAmt() {
        return calAmt;
    }

    public void setCalAmt(Long calAmt) {
        this.calAmt = calAmt;
    }

    public Long getExamAmt() {
        return examAmt;
    }

    public void setExamAmt(Long examAmt) {
        this.examAmt = examAmt;
    }

    public Long getDeductibleAmt() {
        return deductibleAmt;
    }

    public void setDeductibleAmt(Long deductibleAmt) {
        this.deductibleAmt = deductibleAmt;
    }

    public String getInsuredId() {
        return insuredId;
    }

    public void setInsuredId(String insuredId) {
        this.insuredId = insuredId == null ? null : insuredId.trim();
    }

    public String getUpdatePoson() {
        return updatePoson;
    }

    public void setUpdatePoson(String updatePoson) {
        this.updatePoson = updatePoson == null ? null : updatePoson.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Long isDelete) {
        this.isDelete = isDelete;
    }

    public String getAmtCur() {
        return amtCur;
    }

    public void setAmtCur(String amtCur) {
        this.amtCur = amtCur == null ? null : amtCur.trim();
    }

    public String getPayResult() {
        return payResult;
    }

    public void setPayResult(String payResult) {
        this.payResult = payResult == null ? null : payResult.trim();
    }

    public String getRefusePayReason() {
        return refusePayReason;
    }

    public void setRefusePayReason(String refusePayReason) {
        this.refusePayReason = refusePayReason == null ? null : refusePayReason.trim();
    }

    public Long getBillAmt() {
        return billAmt;
    }

    public void setBillAmt(Long billAmt) {
        this.billAmt = billAmt;
    }

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno == null ? null : accno.trim();
    }

    public String getRiskcode() {
        return riskcode;
    }

    public void setRiskcode(String riskcode) {
        this.riskcode = riskcode == null ? null : riskcode.trim();
    }

    public String getRiskname() {
        return riskname;
    }

    public void setRiskname(String riskname) {
        this.riskname = riskname == null ? null : riskname.trim();
    }

    public Long getDeclineamt() {
        return declineamt;
    }

    public void setDeclineamt(Long declineamt) {
        this.declineamt = declineamt;
    }

    public String getBenefitName() {
        return benefitName;
    }

    public void setBenefitName(String benefitName) {
        this.benefitName = benefitName == null ? null : benefitName.trim();
    }

    public String getExamcomment() {
        return examcomment;
    }

    public void setExamcomment(String examcomment) {
        this.examcomment = examcomment == null ? null : examcomment.trim();
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName == null ? null : planName.trim();
    }

    public Long getPaidamnt() {
        return paidamnt;
    }

    public void setPaidamnt(Long paidamnt) {
        this.paidamnt = paidamnt;
    }
}