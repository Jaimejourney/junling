package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.InvoicedetailEntity;

public interface InvoicedetailEntityMapper {
    int deleteByPrimaryKey(Long invoicedetailId);

    int insert(InvoicedetailEntity record);

    int insertSelective(InvoicedetailEntity record);

    InvoicedetailEntity selectByPrimaryKey(Long invoicedetailId);

    int updateByPrimaryKeySelective(InvoicedetailEntity record);

    int updateByPrimaryKey(InvoicedetailEntity record);
}