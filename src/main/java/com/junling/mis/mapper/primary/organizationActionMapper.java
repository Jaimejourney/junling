package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.organizationAction;

public interface organizationActionMapper {
    int deleteByPrimaryKey(String organizationId);

    int insert(organizationAction record);

    int insertSelective(organizationAction record);

    organizationAction selectByPrimaryKey(String organizationId);

    int updateByPrimaryKeySelective(organizationAction record);

    int updateByPrimaryKey(organizationAction record);
}