package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.tpaPolPlanBenefitEntity;

public interface tpaPolPlanBenefitEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(tpaPolPlanBenefitEntity record);

    int insertSelective(tpaPolPlanBenefitEntity record);

    tpaPolPlanBenefitEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(tpaPolPlanBenefitEntity record);

    int updateByPrimaryKey(tpaPolPlanBenefitEntity record);
}