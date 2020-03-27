package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.organizationInfoEntity;

public interface organizagionInfoEntityMapper {
    int deleteByPrimaryKey(String organizationId);

    int insert(organizationInfoEntity record);

    int insertSelective(organizationInfoEntity record);

    organizationInfoEntity selectByPrimaryKey(String organizationId);

    int updateByPrimaryKeySelective(organizationInfoEntity record);

    int updateByPrimaryKey(organizationInfoEntity record);
}