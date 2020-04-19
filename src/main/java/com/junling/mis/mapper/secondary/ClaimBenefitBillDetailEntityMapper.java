package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ClaimBenefitBillDetailEntity;

public interface ClaimBenefitBillDetailEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClaimBenefitBillDetailEntity record);

    int insertSelective(ClaimBenefitBillDetailEntity record);

    ClaimBenefitBillDetailEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClaimBenefitBillDetailEntity record);

    int updateByPrimaryKey(ClaimBenefitBillDetailEntity record);
}