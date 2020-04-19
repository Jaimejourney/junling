package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.PlanBenefitEntity;

public interface PlanBenefitEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(PlanBenefitEntity record);

    int insertSelective(PlanBenefitEntity record);

    PlanBenefitEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PlanBenefitEntity record);

    int updateByPrimaryKey(PlanBenefitEntity record);
}