package com.junling.mis.model.secondary;

public class Table1Entity {
    private String id;

    private String 报案号;

    private String 沛合案件号;

    private String 人保健案件号;

    private String 报案姓名;

    private String 报案证件号码;

    private String 险种名称;

    private String 保单号码;

    private String 报案时间;

    private String 赔付金额;

    private String 发票数;

    private String 超10张发票;

    private String 初审用户名;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String get报案号() {
        return 报案号;
    }

    public void set报案号(String 报案号) {
        this.报案号 = 报案号 == null ? null : 报案号.trim();
    }

    public String get沛合案件号() {
        return 沛合案件号;
    }

    public void set沛合案件号(String 沛合案件号) {
        this.沛合案件号 = 沛合案件号 == null ? null : 沛合案件号.trim();
    }

    public String get人保健案件号() {
        return 人保健案件号;
    }

    public void set人保健案件号(String 人保健案件号) {
        this.人保健案件号 = 人保健案件号 == null ? null : 人保健案件号.trim();
    }

    public String get报案姓名() {
        return 报案姓名;
    }

    public void set报案姓名(String 报案姓名) {
        this.报案姓名 = 报案姓名 == null ? null : 报案姓名.trim();
    }

    public String get报案证件号码() {
        return 报案证件号码;
    }

    public void set报案证件号码(String 报案证件号码) {
        this.报案证件号码 = 报案证件号码 == null ? null : 报案证件号码.trim();
    }

    public String get险种名称() {
        return 险种名称;
    }

    public void set险种名称(String 险种名称) {
        this.险种名称 = 险种名称 == null ? null : 险种名称.trim();
    }

    public String get保单号码() {
        return 保单号码;
    }

    public void set保单号码(String 保单号码) {
        this.保单号码 = 保单号码 == null ? null : 保单号码.trim();
    }

    public String get报案时间() {
        return 报案时间;
    }

    public void set报案时间(String 报案时间) {
        this.报案时间 = 报案时间 == null ? null : 报案时间.trim();
    }

    public String get赔付金额() {
        return 赔付金额;
    }

    public void set赔付金额(String 赔付金额) {
        this.赔付金额 = 赔付金额 == null ? null : 赔付金额.trim();
    }

    public String get发票数() {
        return 发票数;
    }

    public void set发票数(String 发票数) {
        this.发票数 = 发票数 == null ? null : 发票数.trim();
    }

    public String get超10张发票() {
        return 超10张发票;
    }

    public void set超10张发票(String 超10张发票) {
        this.超10张发票 = 超10张发票 == null ? null : 超10张发票.trim();
    }

    public String get初审用户名() {
        return 初审用户名;
    }

    public void set初审用户名(String 初审用户名) {
        this.初审用户名 = 初审用户名 == null ? null : 初审用户名.trim();
    }
}