package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ActRuJobEntity;

public interface ActRuJobEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActRuJobEntity record);

    int insertSelective(ActRuJobEntity record);

    ActRuJobEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActRuJobEntity record);

    int updateByPrimaryKey(ActRuJobEntity record);
}