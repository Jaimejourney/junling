package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.actRuTaskEntity;

public interface actRuTaskEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(actRuTaskEntity record);

    int insertSelective(actRuTaskEntity record);

    actRuTaskEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(actRuTaskEntity record);

    int updateByPrimaryKey(actRuTaskEntity record);
}