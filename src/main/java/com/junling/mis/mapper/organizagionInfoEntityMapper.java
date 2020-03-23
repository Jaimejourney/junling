package com.junling.mis.mapper;

import com.junling.mis.model.organizationInfoEntity;

public interface organizagionInfoEntityMapper {
    int deleteByPrimaryKey(String organizationId);

    int insert(organizationInfoEntity record);

    int insertSelective(organizationInfoEntity record);

    organizationInfoEntity selectByPrimaryKey(String organizationId);

    int updateByPrimaryKeySelective(organizationInfoEntity record);

    int updateByPrimaryKey(organizationInfoEntity record);
}