package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ActRuHistoryJobEntity;

public interface ActRuHistoryJobEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActRuHistoryJobEntity record);

    int insertSelective(ActRuHistoryJobEntity record);

    ActRuHistoryJobEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActRuHistoryJobEntity record);

    int updateByPrimaryKey(ActRuHistoryJobEntity record);
}