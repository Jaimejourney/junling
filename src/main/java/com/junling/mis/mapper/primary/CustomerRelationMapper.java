package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.CustomerRelation;

public interface CustomerRelationMapper {
    int deleteByPrimaryKey(String customerRelationId);

    int insert(CustomerRelation record);

    int insertSelective(CustomerRelation record);

    CustomerRelation selectByPrimaryKey(String customerRelationId);

    CustomerRelation selectByOrganizationId(String organizationId);

    int updateByPrimaryKeySelective(CustomerRelation record);

    int updateByPrimaryKey(CustomerRelation record);
}