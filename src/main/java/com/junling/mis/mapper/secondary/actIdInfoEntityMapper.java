package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.actIdInfoEntity;

public interface actIdInfoEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(actIdInfoEntity record);

    int insertSelective(actIdInfoEntity record);

    actIdInfoEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(actIdInfoEntity record);

    int updateByPrimaryKeyWithBLOBs(actIdInfoEntity record);

    int updateByPrimaryKey(actIdInfoEntity record);
}