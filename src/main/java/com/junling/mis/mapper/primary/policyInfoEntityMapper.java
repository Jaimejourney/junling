package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.policyInfoEntity;

public interface policyInfoEntityMapper {
    int deleteByPrimaryKey(String policyInfoId);

    int insert(policyInfoEntity record);

    int insertSelective(policyInfoEntity record);

    policyInfoEntity selectByPrimaryKey(String policyInfoId);

    int updateByPrimaryKeySelective(policyInfoEntity record);

    int updateByPrimaryKeyWithBLOBs(policyInfoEntity record);

    int updateByPrimaryKey(policyInfoEntity record);
}