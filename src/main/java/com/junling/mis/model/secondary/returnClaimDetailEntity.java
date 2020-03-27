package com.junling.mis.model.secondary;

public class returnClaimDetailEntity {
    private Integer id;

    private String visitId;

    private String docuno;

    private String returnClaimData;

    private String partnerCode;

    private String dataApplicant;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId == null ? null : visitId.trim();
    }

    public String getDocuno() {
        return docuno;
    }

    public void setDocuno(String docuno) {
        this.docuno = docuno == null ? null : docuno.trim();
    }

    public String getReturnClaimData() {
        return returnClaimData;
    }

    public void setReturnClaimData(String returnClaimData) {
        this.returnClaimData = returnClaimData == null ? null : returnClaimData.trim();
    }

    public String getPartnerCode() {
        return partnerCode;
    }

    public void setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode == null ? null : partnerCode.trim();
    }

    public String getDataApplicant() {
        return dataApplicant;
    }

    public void setDataApplicant(String dataApplicant) {
        this.dataApplicant = dataApplicant == null ? null : dataApplicant.trim();
    }
}