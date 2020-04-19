package com.junling.mis.model.secondary;

public class RiskDetailDiagnoseEntity {
    private Integer diagnoseid;

    private Integer riskdetailid;

    private String diagnosename;

    private String diagnosetype;

    public Integer getDiagnoseid() {
        return diagnoseid;
    }

    public void setDiagnoseid(Integer diagnoseid) {
        this.diagnoseid = diagnoseid;
    }

    public Integer getRiskdetailid() {
        return riskdetailid;
    }

    public void setRiskdetailid(Integer riskdetailid) {
        this.riskdetailid = riskdetailid;
    }

    public String getDiagnosename() {
        return diagnosename;
    }

    public void setDiagnosename(String diagnosename) {
        this.diagnosename = diagnosename == null ? null : diagnosename.trim();
    }

    public String getDiagnosetype() {
        return diagnosetype;
    }

    public void setDiagnosetype(String diagnosetype) {
        this.diagnosetype = diagnosetype == null ? null : diagnosetype.trim();
    }
}