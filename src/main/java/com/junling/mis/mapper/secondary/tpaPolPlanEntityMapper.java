package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.tpaPolPlanEntity;

public interface tpaPolPlanEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(tpaPolPlanEntity record);

    int insertSelective(tpaPolPlanEntity record);

    tpaPolPlanEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(tpaPolPlanEntity record);

    int updateByPrimaryKey(tpaPolPlanEntity record);
}