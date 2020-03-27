package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.invoicedetailEntity;

public interface invoicedetailEntityMapper {
    int deleteByPrimaryKey(Long invoicedetailId);

    int insert(invoicedetailEntity record);

    int insertSelective(invoicedetailEntity record);

    invoicedetailEntity selectByPrimaryKey(Long invoicedetailId);

    int updateByPrimaryKeySelective(invoicedetailEntity record);

    int updateByPrimaryKey(invoicedetailEntity record);
}