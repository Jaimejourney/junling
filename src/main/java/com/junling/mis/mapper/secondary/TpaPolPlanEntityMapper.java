package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.TpaPolPlanEntity;

public interface TpaPolPlanEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TpaPolPlanEntity record);

    int insertSelective(TpaPolPlanEntity record);

    TpaPolPlanEntity selectByPrimaryKey(Integer id);

    TpaPolPlanEntity selectByPolNo(String polNo);

    int updateByPrimaryKeySelective(TpaPolPlanEntity record);

    int updateByPrimaryKey(TpaPolPlanEntity record);
}