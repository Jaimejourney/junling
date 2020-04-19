package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.InvoiceProblemEntity;

public interface InvoiceProblemEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InvoiceProblemEntity record);

    int insertSelective(InvoiceProblemEntity record);

    InvoiceProblemEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InvoiceProblemEntity record);

    int updateByPrimaryKey(InvoiceProblemEntity record);
}