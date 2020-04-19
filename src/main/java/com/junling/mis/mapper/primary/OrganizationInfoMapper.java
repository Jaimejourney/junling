package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.OrganizationInfo;

public interface OrganizationInfoMapper {
    int deleteByPrimaryKey(String organizationId);

    int insert(OrganizationInfo record);

    int insertSelective(OrganizationInfo record);

    OrganizationInfo selectByPrimaryKey(String organizationId);

    int updateByPrimaryKeySelective(OrganizationInfo record);

    int updateByPrimaryKey(OrganizationInfo record);
}