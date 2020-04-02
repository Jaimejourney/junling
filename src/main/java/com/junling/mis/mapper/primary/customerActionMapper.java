package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.customerAction;

public interface customerActionMapper {
    int deleteByPrimaryKey(String customerActionId);

    int insert(customerAction record);

    int insertSelective(customerAction record);

    customerAction selectByPrimaryKey(String customerActionId);

    int updateByPrimaryKeySelective(customerAction record);

    int updateByPrimaryKey(customerAction record);
}