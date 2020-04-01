package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.customerRelationEntity;

public interface customerRelationEntityMapper {
    int deleteByPrimaryKey(String customerRelationId);

    int insert(customerRelationEntity record);

    int insertSelective(customerRelationEntity record);

    customerRelationEntity selectByPrimaryKey(String customerRelationId);

    int updateByPrimaryKeySelective(customerRelationEntity record);

    int updateByPrimaryKey(customerRelationEntity record);
}