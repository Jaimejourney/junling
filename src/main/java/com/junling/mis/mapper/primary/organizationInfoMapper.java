package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.organizationInfo;

public interface organizationInfoMapper {
    int deleteByPrimaryKey(String organizationId);

    int insert(organizationInfo record);

    int insertSelective(organizationInfo record);

    organizationInfo selectByPrimaryKey(String organizationId);

    int updateByPrimaryKeySelective(organizationInfo record);

    int updateByPrimaryKey(organizationInfo record);
}