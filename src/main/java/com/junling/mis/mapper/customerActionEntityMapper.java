package com.junling.mis.mapper;

import com.junling.mis.model.customerActionEntity;

public interface customerActionEntityMapper {
    int deleteByPrimaryKey(String customerActionId);

    int insert(customerActionEntity record);

    int insertSelective(customerActionEntity record);

    customerActionEntity selectByPrimaryKey(String customerActionId);

    int updateByPrimaryKeySelective(customerActionEntity record);

    int updateByPrimaryKey(customerActionEntity record);
}