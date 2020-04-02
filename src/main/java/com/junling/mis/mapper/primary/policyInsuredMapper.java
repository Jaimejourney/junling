package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.policyInsured;

public interface policyInsuredMapper {
    int deleteByPrimaryKey(String policyInsuredId);

    int insert(policyInsured record);

    int insertSelective(policyInsured record);

    policyInsured selectByPrimaryKey(String policyInsuredId);

    int updateByPrimaryKeySelective(policyInsured record);

    int updateByPrimaryKey(policyInsured record);
}