package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.PolicyInsured;

public interface PolicyInsuredMapper {
    int deleteByPrimaryKey(String policyInsuredId);

    int insert(PolicyInsured record);

    int insertSelective(PolicyInsured record);

    PolicyInsured selectByPrimaryKey(String policyInsuredId);

    int updateByPrimaryKeySelective(PolicyInsured record);

    int updateByPrimaryKey(PolicyInsured record);
}