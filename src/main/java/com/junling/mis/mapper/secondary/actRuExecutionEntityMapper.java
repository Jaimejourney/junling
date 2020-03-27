package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.actRuExecutionEntity;

public interface actRuExecutionEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(actRuExecutionEntity record);

    int insertSelective(actRuExecutionEntity record);

    actRuExecutionEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(actRuExecutionEntity record);

    int updateByPrimaryKey(actRuExecutionEntity record);
}