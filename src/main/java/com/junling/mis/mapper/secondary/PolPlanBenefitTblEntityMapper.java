package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.PolPlanBenefitTblEntity;

public interface PolPlanBenefitTblEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(PolPlanBenefitTblEntity record);

    int insertSelective(PolPlanBenefitTblEntity record);

    PolPlanBenefitTblEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PolPlanBenefitTblEntity record);

    int updateByPrimaryKey(PolPlanBenefitTblEntity record);
}