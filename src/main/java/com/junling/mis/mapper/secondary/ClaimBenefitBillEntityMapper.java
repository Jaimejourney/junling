package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ClaimBenefitBillEntity;

public interface ClaimBenefitBillEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClaimBenefitBillEntity record);

    int insertSelective(ClaimBenefitBillEntity record);

    ClaimBenefitBillEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClaimBenefitBillEntity record);

    int updateByPrimaryKey(ClaimBenefitBillEntity record);
}