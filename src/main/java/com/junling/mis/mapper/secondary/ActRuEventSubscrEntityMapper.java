package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ActRuEventSubscrEntity;

public interface ActRuEventSubscrEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActRuEventSubscrEntity record);

    int insertSelective(ActRuEventSubscrEntity record);

    ActRuEventSubscrEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActRuEventSubscrEntity record);

    int updateByPrimaryKey(ActRuEventSubscrEntity record);
}