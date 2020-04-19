package com.junling.mis.model.secondary;

public class ClaimMainOldEntityKey {
    private Long procno;

    private String docuno;

    public Long getProcno() {
        return procno;
    }

    public void setProcno(Long procno) {
        this.procno = procno;
    }

    public String getDocuno() {
        return docuno;
    }

    public void setDocuno(String docuno) {
        this.docuno = docuno == null ? null : docuno.trim();
    }
}