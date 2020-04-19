package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ActRuSuspendedJobEntity;

public interface ActRuSuspendedJobEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActRuSuspendedJobEntity record);

    int insertSelective(ActRuSuspendedJobEntity record);

    ActRuSuspendedJobEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActRuSuspendedJobEntity record);

    int updateByPrimaryKey(ActRuSuspendedJobEntity record);
}