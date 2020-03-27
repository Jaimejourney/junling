package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.scheduleTaskCopyEntity;

public interface scheduleTaskCopyEntityMapper {
    int deleteByPrimaryKey(String requstId);

    int insert(scheduleTaskCopyEntity record);

    int insertSelective(scheduleTaskCopyEntity record);

    scheduleTaskCopyEntity selectByPrimaryKey(String requstId);

    int updateByPrimaryKeySelective(scheduleTaskCopyEntity record);

    int updateByPrimaryKeyWithBLOBs(scheduleTaskCopyEntity record);

    int updateByPrimaryKey(scheduleTaskCopyEntity record);
}