package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.planBenefitEntity;

public interface planBenefitEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(planBenefitEntity record);

    int insertSelective(planBenefitEntity record);

    planBenefitEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(planBenefitEntity record);

    int updateByPrimaryKey(planBenefitEntity record);
}