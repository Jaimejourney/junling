package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.scheduleTaskEntity;

public interface scheduleTaskEntityMapper {
    int deleteByPrimaryKey(String requstId);

    int insert(scheduleTaskEntity record);

    int insertSelective(scheduleTaskEntity record);

    scheduleTaskEntity selectByPrimaryKey(String requstId);

    int updateByPrimaryKeySelective(scheduleTaskEntity record);

    int updateByPrimaryKeyWithBLOBs(scheduleTaskEntity record);

    int updateByPrimaryKey(scheduleTaskEntity record);
}