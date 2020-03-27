package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.polPlanBenefitTblEntity;

public interface polPlanBenefitTblEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(polPlanBenefitTblEntity record);

    int insertSelective(polPlanBenefitTblEntity record);

    polPlanBenefitTblEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(polPlanBenefitTblEntity record);

    int updateByPrimaryKey(polPlanBenefitTblEntity record);
}