package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.PolicyInfo;

public interface PolicyInfoMapper {
    int deleteByPrimaryKey(String policyInfoId);

    int insert(PolicyInfo record);

    int insertSelective(PolicyInfo record);

    PolicyInfo selectByPrimaryKey(String policyInfoId);

    int updateByPrimaryKeySelective(PolicyInfo record);

    int updateByPrimaryKeyWithBLOBs(PolicyInfo record);

    int updateByPrimaryKey(PolicyInfo record);
}