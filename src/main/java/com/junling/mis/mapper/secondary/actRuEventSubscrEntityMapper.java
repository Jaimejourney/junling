package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.actRuEventSubscrEntity;

public interface actRuEventSubscrEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(actRuEventSubscrEntity record);

    int insertSelective(actRuEventSubscrEntity record);

    actRuEventSubscrEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(actRuEventSubscrEntity record);

    int updateByPrimaryKey(actRuEventSubscrEntity record);
}