package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ActRuExecutionEntity;

public interface ActRuExecutionEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActRuExecutionEntity record);

    int insertSelective(ActRuExecutionEntity record);

    ActRuExecutionEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActRuExecutionEntity record);

    int updateByPrimaryKey(ActRuExecutionEntity record);
}