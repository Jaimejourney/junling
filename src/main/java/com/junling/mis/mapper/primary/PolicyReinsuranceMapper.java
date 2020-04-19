package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.PolicyReinsurance;

public interface PolicyReinsuranceMapper {
    int deleteByPrimaryKey(String policyReinsuranceId);

    int insert(PolicyReinsurance record);

    int insertSelective(PolicyReinsurance record);

    PolicyReinsurance selectByPrimaryKey(String policyReinsuranceId);

    int updateByPrimaryKeySelective(PolicyReinsurance record);

    int updateByPrimaryKeyWithBLOBs(PolicyReinsurance record);

    int updateByPrimaryKey(PolicyReinsurance record);
}