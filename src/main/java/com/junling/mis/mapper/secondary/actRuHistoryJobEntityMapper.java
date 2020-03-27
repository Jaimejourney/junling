package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.actRuHistoryJobEntity;

public interface actRuHistoryJobEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(actRuHistoryJobEntity record);

    int insertSelective(actRuHistoryJobEntity record);

    actRuHistoryJobEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(actRuHistoryJobEntity record);

    int updateByPrimaryKey(actRuHistoryJobEntity record);
}