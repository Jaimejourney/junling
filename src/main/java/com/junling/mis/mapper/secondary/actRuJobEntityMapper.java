package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.actRuJobEntity;

public interface actRuJobEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(actRuJobEntity record);

    int insertSelective(actRuJobEntity record);

    actRuJobEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(actRuJobEntity record);

    int updateByPrimaryKey(actRuJobEntity record);
}