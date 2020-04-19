package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.OrganizationAction;

public interface OrganizationActionMapper {
    int deleteByPrimaryKey(String organizationId);

    int insert(OrganizationAction record);

    int insertSelective(OrganizationAction record);

    OrganizationAction selectByPrimaryKey(String organizationId);

    int updateByPrimaryKeySelective(OrganizationAction record);

    int updateByPrimaryKey(OrganizationAction record);
}