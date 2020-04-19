package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ActIdInfoEntity;

public interface ActIdInfoEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActIdInfoEntity record);

    int insertSelective(ActIdInfoEntity record);

    ActIdInfoEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActIdInfoEntity record);

    int updateByPrimaryKeyWithBLOBs(ActIdInfoEntity record);

    int updateByPrimaryKey(ActIdInfoEntity record);
}