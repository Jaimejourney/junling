package com.junling.mis.mapper;

import com.junling.mis.model.policyGradeLevelProductEntity;

public interface policyGradeLevelProductEntityMapper {
    int deleteByPrimaryKey(String pglProductId);

    int insert(policyGradeLevelProductEntity record);

    int insertSelective(policyGradeLevelProductEntity record);

    policyGradeLevelProductEntity selectByPrimaryKey(String pglProductId);

    int updateByPrimaryKeySelective(policyGradeLevelProductEntity record);

    int updateByPrimaryKey(policyGradeLevelProductEntity record);
}