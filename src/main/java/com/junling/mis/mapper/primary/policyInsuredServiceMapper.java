package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.policyInsuredService;

public interface policyInsuredServiceMapper {
    int deleteByPrimaryKey(String policyInsuredServiceId);

    int insert(policyInsuredService record);

    int insertSelective(policyInsuredService record);

    policyInsuredService selectByPrimaryKey(String policyInsuredServiceId);

    int updateByPrimaryKeySelective(policyInsuredService record);

    int updateByPrimaryKey(policyInsuredService record);
}