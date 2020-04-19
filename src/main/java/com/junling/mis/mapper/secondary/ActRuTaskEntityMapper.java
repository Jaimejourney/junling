package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ActRuTaskEntity;

public interface ActRuTaskEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActRuTaskEntity record);

    int insertSelective(ActRuTaskEntity record);

    ActRuTaskEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActRuTaskEntity record);

    int updateByPrimaryKey(ActRuTaskEntity record);
}