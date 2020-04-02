package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.policyBenefit;

public interface policyBenefitMapper {
    int deleteByPrimaryKey(String policyBenefitId);

    int insert(policyBenefit record);

    int insertSelective(policyBenefit record);

    policyBenefit selectByPrimaryKey(String policyBenefitId);

    int updateByPrimaryKeySelective(policyBenefit record);

    int updateByPrimaryKeyWithBLOBs(policyBenefit record);

    int updateByPrimaryKey(policyBenefit record);
}