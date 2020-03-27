package com.junling.mis.model.secondary;

import java.math.BigDecimal;
import java.util.Date;

public class invoicedetailEntity {
    private Long invoicedetailId;

    private Long invoicetotalityId;

    private String insurdictionarycode;

    private String dictionaryname;

    private BigDecimal money;

    private Date createdTime;

    private Date updatedTime;

    private String sendtradenum;

    private String invoiceno;

    public Long getInvoicedetailId() {
        return invoicedetailId;
    }

    public void setInvoicedetailId(Long invoicedetailId) {
        this.invoicedetailId = invoicedetailId;
    }

    public Long getInvoicetotalityId() {
        return invoicetotalityId;
    }

    public void setInvoicetotalityId(Long invoicetotalityId) {
        this.invoicetotalityId = invoicetotalityId;
    }

    public String getInsurdictionarycode() {
        return insurdictionarycode;
    }

    public void setInsurdictionarycode(String insurdictionarycode) {
        this.insurdictionarycode = insurdictionarycode == null ? null : insurdictionarycode.trim();
    }

    public String getDictionaryname() {
        return dictionaryname;
    }

    public void setDictionaryname(String dictionaryname) {
        this.dictionaryname = dictionaryname == null ? null : dictionaryname.trim();
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getSendtradenum() {
        return sendtradenum;
    }

    public void setSendtradenum(String sendtradenum) {
        this.sendtradenum = sendtradenum == null ? null : sendtradenum.trim();
    }

    public String getInvoiceno() {
        return invoiceno;
    }

    public void setInvoiceno(String invoiceno) {
        this.invoiceno = invoiceno == null ? null : invoiceno.trim();
    }
}