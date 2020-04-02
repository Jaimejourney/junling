package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.policyBeneficiary;

public interface policyBeneficiaryMapper {
    int deleteByPrimaryKey(String policyBeneficiaryId);

    int insert(policyBeneficiary record);

    int insertSelective(policyBeneficiary record);

    policyBeneficiary selectByPrimaryKey(String policyBeneficiaryId);

    int updateByPrimaryKeySelective(policyBeneficiary record);

    int updateByPrimaryKey(policyBeneficiary record);
}