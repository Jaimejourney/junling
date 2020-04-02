package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.policyReinsurance;

public interface policyReinsuranceMapper {
    int deleteByPrimaryKey(String policyReinsuranceId);

    int insert(policyReinsurance record);

    int insertSelective(policyReinsurance record);

    policyReinsurance selectByPrimaryKey(String policyReinsuranceId);

    int updateByPrimaryKeySelective(policyReinsurance record);

    int updateByPrimaryKeyWithBLOBs(policyReinsurance record);

    int updateByPrimaryKey(policyReinsurance record);
}