package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ActProcdefInfoEntity;

public interface ActProcdefInfoEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActProcdefInfoEntity record);

    int insertSelective(ActProcdefInfoEntity record);

    ActProcdefInfoEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActProcdefInfoEntity record);

    int updateByPrimaryKey(ActProcdefInfoEntity record);
}