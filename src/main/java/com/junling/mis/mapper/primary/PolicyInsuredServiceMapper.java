package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.PolicyInsuredService;

public interface PolicyInsuredServiceMapper {
    int deleteByPrimaryKey(String policyInsuredServiceId);

    int insert(PolicyInsuredService record);

    int insertSelective(PolicyInsuredService record);

    PolicyInsuredService selectByPrimaryKey(String policyInsuredServiceId);

    int updateByPrimaryKeySelective(PolicyInsuredService record);

    int updateByPrimaryKey(PolicyInsuredService record);
}