package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.TpaPolPlanBenefitEntity;

import java.util.List;

public interface TpaPolPlanBenefitEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TpaPolPlanBenefitEntity record);

    int insertSelective(TpaPolPlanBenefitEntity record);

    TpaPolPlanBenefitEntity selectByPrimaryKey(Integer id);

    List<TpaPolPlanBenefitEntity> selectByPolNo(String polNo);

    int updateByPrimaryKeySelective(TpaPolPlanBenefitEntity record);

    int updateByPrimaryKey(TpaPolPlanBenefitEntity record);
}