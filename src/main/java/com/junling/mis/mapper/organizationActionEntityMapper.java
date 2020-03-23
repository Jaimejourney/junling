package com.junling.mis.mapper;

import com.junling.mis.model.organizationActionEntity;

public interface organizationActionEntityMapper {
    int deleteByPrimaryKey(String organizationActionId);

    int insert(organizationActionEntity record);

    int insertSelective(organizationActionEntity record);

    organizationActionEntity selectByPrimaryKey(String organizationActionId);

    int updateByPrimaryKeySelective(organizationActionEntity record);

    int updateByPrimaryKey(organizationActionEntity record);
}