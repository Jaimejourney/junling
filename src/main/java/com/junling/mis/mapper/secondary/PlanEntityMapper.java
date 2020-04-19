package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.PlanEntity;

public interface PlanEntityMapper {
    int deleteByPrimaryKey(String planCode);

    int insert(PlanEntity record);

    int insertSelective(PlanEntity record);

    PlanEntity selectByPrimaryKey(String planCode);

    int updateByPrimaryKeySelective(PlanEntity record);

    int updateByPrimaryKey(PlanEntity record);
}