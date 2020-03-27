package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.organizationActionEntity;

public interface organizationActionEntityMapper {
    int deleteByPrimaryKey(String organizationActionId);

    int insert(organizationActionEntity record);

    int insertSelective(organizationActionEntity record);

    organizationActionEntity selectByPrimaryKey(String organizationActionId);

    int updateByPrimaryKeySelective(organizationActionEntity record);

    int updateByPrimaryKey(organizationActionEntity record);
}