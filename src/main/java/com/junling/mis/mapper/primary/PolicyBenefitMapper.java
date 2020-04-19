package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.PolicyBenefit;

public interface PolicyBenefitMapper {
    int deleteByPrimaryKey(String policyBenefitId);

    int insert(PolicyBenefit record);

    int insertSelective(PolicyBenefit record);

    PolicyBenefit selectByPrimaryKey(String policyBenefitId);

    int updateByPrimaryKeySelective(PolicyBenefit record);

    int updateByPrimaryKeyWithBLOBs(PolicyBenefit record);

    int updateByPrimaryKey(PolicyBenefit record);
}