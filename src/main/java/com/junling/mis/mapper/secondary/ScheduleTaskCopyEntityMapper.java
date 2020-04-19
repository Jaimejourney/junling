package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ScheduleTaskCopyEntity;

public interface ScheduleTaskCopyEntityMapper {
    int deleteByPrimaryKey(String requstId);

    int insert(ScheduleTaskCopyEntity record);

    int insertSelective(ScheduleTaskCopyEntity record);

    ScheduleTaskCopyEntity selectByPrimaryKey(String requstId);

    int updateByPrimaryKeySelective(ScheduleTaskCopyEntity record);

    int updateByPrimaryKeyWithBLOBs(ScheduleTaskCopyEntity record);

    int updateByPrimaryKey(ScheduleTaskCopyEntity record);
}