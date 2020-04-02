package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.policyInfo;

public interface policyInfoMapper {
    int deleteByPrimaryKey(String policyInfoId);

    int insert(policyInfo record);

    int insertSelective(policyInfo record);

    policyInfo selectByPrimaryKey(String policyInfoId);

    int updateByPrimaryKeySelective(policyInfo record);

    int updateByPrimaryKeyWithBLOBs(policyInfo record);

    int updateByPrimaryKey(policyInfo record);
}