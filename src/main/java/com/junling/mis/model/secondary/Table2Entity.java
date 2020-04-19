package com.junling.mis.model.secondary;

public class Table2Entity {
    private String 保健康报案号;

    private String 姓名;

    private String 证件号;

    private String 申请金额;

    private String 初审用户;

    private String 初审申请时间;

    private String 初审提交时间;

    private String 初审不通过结论;

    public String get保健康报案号() {
        return 保健康报案号;
    }

    public void set保健康报案号(String 保健康报案号) {
        this.保健康报案号 = 保健康报案号 == null ? null : 保健康报案号.trim();
    }

    public String get姓名() {
        return 姓名;
    }

    public void set姓名(String 姓名) {
        this.姓名 = 姓名 == null ? null : 姓名.trim();
    }

    public String get证件号() {
        return 证件号;
    }

    public void set证件号(String 证件号) {
        this.证件号 = 证件号 == null ? null : 证件号.trim();
    }

    public String get申请金额() {
        return 申请金额;
    }

    public void set申请金额(String 申请金额) {
        this.申请金额 = 申请金额 == null ? null : 申请金额.trim();
    }

    public String get初审用户() {
        return 初审用户;
    }

    public void set初审用户(String 初审用户) {
        this.初审用户 = 初审用户 == null ? null : 初审用户.trim();
    }

    public String get初审申请时间() {
        return 初审申请时间;
    }

    public void set初审申请时间(String 初审申请时间) {
        this.初审申请时间 = 初审申请时间 == null ? null : 初审申请时间.trim();
    }

    public String get初审提交时间() {
        return 初审提交时间;
    }

    public void set初审提交时间(String 初审提交时间) {
        this.初审提交时间 = 初审提交时间 == null ? null : 初审提交时间.trim();
    }

    public String get初审不通过结论() {
        return 初审不通过结论;
    }

    public void set初审不通过结论(String 初审不通过结论) {
        this.初审不通过结论 = 初审不通过结论 == null ? null : 初审不通过结论.trim();
    }
}