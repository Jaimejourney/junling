package com.junling.mis.model.secondary;

import java.util.Date;

public class jlverifylogEntity {
    private String jlVerifySeq;

    private String insuredId;

    private String hosCodeHb;

    private String flowId;

    private String docuno;

    private String seqno;

    private String jlResult;

    private String status;

    private String partnerId;

    private String updatePoson;

    private Date updateTime;

    private Long isDelete;

    private String visitRecordId;

    public String getJlVerifySeq() {
        return jlVerifySeq;
    }

    public void setJlVerifySeq(String jlVerifySeq) {
        this.jlVerifySeq = jlVerifySeq == null ? null : jlVerifySeq.trim();
    }

    public String getInsuredId() {
        return insuredId;
    }

    public void setInsuredId(String insuredId) {
        this.insuredId = insuredId == null ? null : insuredId.trim();
    }

    public String getHosCodeHb() {
        return hosCodeHb;
    }

    public void setHosCodeHb(String hosCodeHb) {
        this.hosCodeHb = hosCodeHb == null ? null : hosCodeHb.trim();
    }

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId == null ? null : flowId.trim();
    }

    public String getDocuno() {
        return docuno;
    }

    public void setDocuno(String docuno) {
        this.docuno = docuno == null ? null : docuno.trim();
    }

    public String getSeqno() {
        return seqno;
    }

    public void setSeqno(String seqno) {
        this.seqno = seqno == null ? null : seqno.trim();
    }

    public String getJlResult() {
        return jlResult;
    }

    public void setJlResult(String jlResult) {
        this.jlResult = jlResult == null ? null : jlResult.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId == null ? null : partnerId.trim();
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

    public String getVisitRecordId() {
        return visitRecordId;
    }

    public void setVisitRecordId(String visitRecordId) {
        this.visitRecordId = visitRecordId == null ? null : visitRecordId.trim();
    }
}