package com.junling.mis.model.secondary;

import java.math.BigDecimal;
import java.util.Date;

public class visitRecordEntity {
    private String id;

    private String openid;

    private String applyType;

    private String claimType;

    private String visitTime;

    private String accidentTime;

    private BigDecimal personId;

    private BigDecimal imageId;

    private BigDecimal bankId;

    private Integer status;

    private Double amount;

    private String payTime;

    private String payType;

    private String cardId;

    private String claimTime;

    private String applyTime;

    private Date updateTime;

    private String replyTime;

    private String finishTime;

    private Integer optStatus;

    private String remark;

    private String zipPath;

    private String updateBy;

    private String hospitalCode;

    private String docuno;

    private String clientPolIds;

    private String cpayresult;

    private String comment;

    private String relationshipId;

    private String processType;

    private String applyPersonId;

    private String source;

    private String caseType;

    private String acciDesci;

    private String acciPlace;

    private String toAnxin;

    private String partner;

    private Date initialreviewtime;

    private Date createTime;

    private Date initialReviewEndTime;

    private String applyBy;

    private String reviewBy;

    private String pushstatus;

    private String pdfurl;

    private String pauseMark;

    private String calfailtype;

    private String calculateChannel;

    private String excessexamineflag;

    private String deathexamineflag;

    private String problem;

    private Integer isArtificial;

    private String artificialBy;

    private String hangFlag;

    private String handlestatus;

    private String needpushdeathremarkflag;

    private String approveBy;

    private String isSyncCaseAttr;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getApplyType() {
        return applyType;
    }

    public void setApplyType(String applyType) {
        this.applyType = applyType == null ? null : applyType.trim();
    }

    public String getClaimType() {
        return claimType;
    }

    public void setClaimType(String claimType) {
        this.claimType = claimType == null ? null : claimType.trim();
    }

    public String getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(String visitTime) {
        this.visitTime = visitTime == null ? null : visitTime.trim();
    }

    public String getAccidentTime() {
        return accidentTime;
    }

    public void setAccidentTime(String accidentTime) {
        this.accidentTime = accidentTime == null ? null : accidentTime.trim();
    }

    public BigDecimal getPersonId() {
        return personId;
    }

    public void setPersonId(BigDecimal personId) {
        this.personId = personId;
    }

    public BigDecimal getImageId() {
        return imageId;
    }

    public void setImageId(BigDecimal imageId) {
        this.imageId = imageId;
    }

    public BigDecimal getBankId() {
        return bankId;
    }

    public void setBankId(BigDecimal bankId) {
        this.bankId = bankId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime == null ? null : payTime.trim();
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
    }

    public String getClaimTime() {
        return claimTime;
    }

    public void setClaimTime(String claimTime) {
        this.claimTime = claimTime == null ? null : claimTime.trim();
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime == null ? null : applyTime.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(String replyTime) {
        this.replyTime = replyTime == null ? null : replyTime.trim();
    }

    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime == null ? null : finishTime.trim();
    }

    public Integer getOptStatus() {
        return optStatus;
    }

    public void setOptStatus(Integer optStatus) {
        this.optStatus = optStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getZipPath() {
        return zipPath;
    }

    public void setZipPath(String zipPath) {
        this.zipPath = zipPath == null ? null : zipPath.trim();
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public String getHospitalCode() {
        return hospitalCode;
    }

    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode == null ? null : hospitalCode.trim();
    }

    public String getDocuno() {
        return docuno;
    }

    public void setDocuno(String docuno) {
        this.docuno = docuno == null ? null : docuno.trim();
    }

    public String getClientPolIds() {
        return clientPolIds;
    }

    public void setClientPolIds(String clientPolIds) {
        this.clientPolIds = clientPolIds == null ? null : clientPolIds.trim();
    }

    public String getCpayresult() {
        return cpayresult;
    }

    public void setCpayresult(String cpayresult) {
        this.cpayresult = cpayresult == null ? null : cpayresult.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getRelationshipId() {
        return relationshipId;
    }

    public void setRelationshipId(String relationshipId) {
        this.relationshipId = relationshipId == null ? null : relationshipId.trim();
    }

    public String getProcessType() {
        return processType;
    }

    public void setProcessType(String processType) {
        this.processType = processType == null ? null : processType.trim();
    }

    public String getApplyPersonId() {
        return applyPersonId;
    }

    public void setApplyPersonId(String applyPersonId) {
        this.applyPersonId = applyPersonId == null ? null : applyPersonId.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType == null ? null : caseType.trim();
    }

    public String getAcciDesci() {
        return acciDesci;
    }

    public void setAcciDesci(String acciDesci) {
        this.acciDesci = acciDesci == null ? null : acciDesci.trim();
    }

    public String getAcciPlace() {
        return acciPlace;
    }

    public void setAcciPlace(String acciPlace) {
        this.acciPlace = acciPlace == null ? null : acciPlace.trim();
    }

    public String getToAnxin() {
        return toAnxin;
    }

    public void setToAnxin(String toAnxin) {
        this.toAnxin = toAnxin == null ? null : toAnxin.trim();
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner == null ? null : partner.trim();
    }

    public Date getInitialreviewtime() {
        return initialreviewtime;
    }

    public void setInitialreviewtime(Date initialreviewtime) {
        this.initialreviewtime = initialreviewtime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getInitialReviewEndTime() {
        return initialReviewEndTime;
    }

    public void setInitialReviewEndTime(Date initialReviewEndTime) {
        this.initialReviewEndTime = initialReviewEndTime;
    }

    public String getApplyBy() {
        return applyBy;
    }

    public void setApplyBy(String applyBy) {
        this.applyBy = applyBy == null ? null : applyBy.trim();
    }

    public String getReviewBy() {
        return reviewBy;
    }

    public void setReviewBy(String reviewBy) {
        this.reviewBy = reviewBy == null ? null : reviewBy.trim();
    }

    public String getPushstatus() {
        return pushstatus;
    }

    public void setPushstatus(String pushstatus) {
        this.pushstatus = pushstatus == null ? null : pushstatus.trim();
    }

    public String getPdfurl() {
        return pdfurl;
    }

    public void setPdfurl(String pdfurl) {
        this.pdfurl = pdfurl == null ? null : pdfurl.trim();
    }

    public String getPauseMark() {
        return pauseMark;
    }

    public void setPauseMark(String pauseMark) {
        this.pauseMark = pauseMark == null ? null : pauseMark.trim();
    }

    public String getCalfailtype() {
        return calfailtype;
    }

    public void setCalfailtype(String calfailtype) {
        this.calfailtype = calfailtype == null ? null : calfailtype.trim();
    }

    public String getCalculateChannel() {
        return calculateChannel;
    }

    public void setCalculateChannel(String calculateChannel) {
        this.calculateChannel = calculateChannel == null ? null : calculateChannel.trim();
    }

    public String getExcessexamineflag() {
        return excessexamineflag;
    }

    public void setExcessexamineflag(String excessexamineflag) {
        this.excessexamineflag = excessexamineflag == null ? null : excessexamineflag.trim();
    }

    public String getDeathexamineflag() {
        return deathexamineflag;
    }

    public void setDeathexamineflag(String deathexamineflag) {
        this.deathexamineflag = deathexamineflag == null ? null : deathexamineflag.trim();
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem == null ? null : problem.trim();
    }

    public Integer getIsArtificial() {
        return isArtificial;
    }

    public void setIsArtificial(Integer isArtificial) {
        this.isArtificial = isArtificial;
    }

    public String getArtificialBy() {
        return artificialBy;
    }

    public void setArtificialBy(String artificialBy) {
        this.artificialBy = artificialBy == null ? null : artificialBy.trim();
    }

    public String getHangFlag() {
        return hangFlag;
    }

    public void setHangFlag(String hangFlag) {
        this.hangFlag = hangFlag == null ? null : hangFlag.trim();
    }

    public String getHandlestatus() {
        return handlestatus;
    }

    public void setHandlestatus(String handlestatus) {
        this.handlestatus = handlestatus == null ? null : handlestatus.trim();
    }

    public String getNeedpushdeathremarkflag() {
        return needpushdeathremarkflag;
    }

    public void setNeedpushdeathremarkflag(String needpushdeathremarkflag) {
        this.needpushdeathremarkflag = needpushdeathremarkflag == null ? null : needpushdeathremarkflag.trim();
    }

    public String getApproveBy() {
        return approveBy;
    }

    public void setApproveBy(String approveBy) {
        this.approveBy = approveBy == null ? null : approveBy.trim();
    }

    public String getIsSyncCaseAttr() {
        return isSyncCaseAttr;
    }

    public void setIsSyncCaseAttr(String isSyncCaseAttr) {
        this.isSyncCaseAttr = isSyncCaseAttr == null ? null : isSyncCaseAttr.trim();
    }
}