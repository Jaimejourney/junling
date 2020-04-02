package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.customerRelation;

public interface customerRelationMapper {
    int deleteByPrimaryKey(String customerRelationId);

    int insert(customerRelation record);

    int insertSelective(customerRelation record);

    customerRelation selectByPrimaryKey(String customerRelationId);

    int updateByPrimaryKeySelective(customerRelation record);

    int updateByPrimaryKey(customerRelation record);
}