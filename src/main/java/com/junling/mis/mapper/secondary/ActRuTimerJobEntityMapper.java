package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ActRuTimerJobEntity;

public interface ActRuTimerJobEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActRuTimerJobEntity record);

    int insertSelective(ActRuTimerJobEntity record);

    ActRuTimerJobEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActRuTimerJobEntity record);

    int updateByPrimaryKey(ActRuTimerJobEntity record);
}