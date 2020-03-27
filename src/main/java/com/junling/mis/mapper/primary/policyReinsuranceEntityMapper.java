package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.policyReinsuranceEntity;

public interface policyReinsuranceEntityMapper {
    int deleteByPrimaryKey(String policyReinsuranceId);

    int insert(policyReinsuranceEntity record);

    int insertSelective(policyReinsuranceEntity record);

    policyReinsuranceEntity selectByPrimaryKey(String policyReinsuranceId);

    int updateByPrimaryKeySelective(policyReinsuranceEntity record);

    int updateByPrimaryKeyWithBLOBs(policyReinsuranceEntity record);

    int updateByPrimaryKey(policyReinsuranceEntity record);
}