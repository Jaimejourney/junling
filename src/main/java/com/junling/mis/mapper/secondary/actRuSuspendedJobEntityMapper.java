package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.actRuSuspendedJobEntity;

public interface actRuSuspendedJobEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(actRuSuspendedJobEntity record);

    int insertSelective(actRuSuspendedJobEntity record);

    actRuSuspendedJobEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(actRuSuspendedJobEntity record);

    int updateByPrimaryKey(actRuSuspendedJobEntity record);
}