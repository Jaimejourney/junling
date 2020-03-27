package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.actRuTimerJobEntity;

public interface actRuTimerJobEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(actRuTimerJobEntity record);

    int insertSelective(actRuTimerJobEntity record);

    actRuTimerJobEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(actRuTimerJobEntity record);

    int updateByPrimaryKey(actRuTimerJobEntity record);
}