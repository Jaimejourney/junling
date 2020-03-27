package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.invoiceProblemEntity;

public interface invoiceProblemEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(invoiceProblemEntity record);

    int insertSelective(invoiceProblemEntity record);

    invoiceProblemEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(invoiceProblemEntity record);

    int updateByPrimaryKey(invoiceProblemEntity record);
}