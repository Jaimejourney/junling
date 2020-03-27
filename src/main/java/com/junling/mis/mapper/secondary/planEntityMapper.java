package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.planEntity;

public interface planEntityMapper {
    int deleteByPrimaryKey(String planCode);

    int insert(planEntity record);

    int insertSelective(planEntity record);

    planEntity selectByPrimaryKey(String planCode);

    int updateByPrimaryKeySelective(planEntity record);

    int updateByPrimaryKey(planEntity record);
}