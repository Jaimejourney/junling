package com.junling.mis.model.secondary;

public class riskDetailStddiseaseEntity {
    private Integer stddiseaseid;

    private Integer riskdetaildiagnoseid;

    private String name;

    private String code;

    public Integer getStddiseaseid() {
        return stddiseaseid;
    }

    public void setStddiseaseid(Integer stddiseaseid) {
        this.stddiseaseid = stddiseaseid;
    }

    public Integer getRiskdetaildiagnoseid() {
        return riskdetaildiagnoseid;
    }

    public void setRiskdetaildiagnoseid(Integer riskdetaildiagnoseid) {
        this.riskdetaildiagnoseid = riskdetaildiagnoseid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }
}