package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.InvoicetotalityEntity;

public interface InvoicetotalityEntityMapper {
    int deleteByPrimaryKey(Long invoicetotalityId);

    int insert(InvoicetotalityEntity record);

    int insertSelective(InvoicetotalityEntity record);

    InvoicetotalityEntity selectByPrimaryKey(Long invoicetotalityId);

    int updateByPrimaryKeySelective(InvoicetotalityEntity record);

    int updateByPrimaryKey(InvoicetotalityEntity record);
}