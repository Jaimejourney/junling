package com.junling.mis.model.secondary;

public class test1Entity {
    private String a;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a == null ? null : a.trim();
    }
}