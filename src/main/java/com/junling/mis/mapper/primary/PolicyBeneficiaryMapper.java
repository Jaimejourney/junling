package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.PolicyBeneficiary;

public interface PolicyBeneficiaryMapper {
    int deleteByPrimaryKey(String policyBeneficiaryId);

    int insert(PolicyBeneficiary record);

    int insertSelective(PolicyBeneficiary record);

    PolicyBeneficiary selectByPrimaryKey(String policyBeneficiaryId);

    int updateByPrimaryKeySelective(PolicyBeneficiary record);

    int updateByPrimaryKey(PolicyBeneficiary record);
}