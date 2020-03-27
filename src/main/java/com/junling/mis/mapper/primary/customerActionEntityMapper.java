package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.customerActionEntity;

public interface customerActionEntityMapper {
    int deleteByPrimaryKey(String customerActionId);

    int insert(customerActionEntity record);

    int insertSelective(customerActionEntity record);

    customerActionEntity selectByPrimaryKey(String customerActionId);

    int updateByPrimaryKeySelective(customerActionEntity record);

    int updateByPrimaryKey(customerActionEntity record);
}