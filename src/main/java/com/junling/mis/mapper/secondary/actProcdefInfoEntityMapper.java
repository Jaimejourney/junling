package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.actProcdefInfoEntity;

public interface actProcdefInfoEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(actProcdefInfoEntity record);

    int insertSelective(actProcdefInfoEntity record);

    actProcdefInfoEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(actProcdefInfoEntity record);

    int updateByPrimaryKey(actProcdefInfoEntity record);
}