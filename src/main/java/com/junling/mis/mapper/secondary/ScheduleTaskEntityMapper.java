package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ScheduleTaskEntity;

public interface ScheduleTaskEntityMapper {
    int deleteByPrimaryKey(String requstId);

    int insert(ScheduleTaskEntity record);

    int insertSelective(ScheduleTaskEntity record);

    ScheduleTaskEntity selectByPrimaryKey(String requstId);

    int updateByPrimaryKeySelective(ScheduleTaskEntity record);

    int updateByPrimaryKeyWithBLOBs(ScheduleTaskEntity record);

    int updateByPrimaryKey(ScheduleTaskEntity record);
}