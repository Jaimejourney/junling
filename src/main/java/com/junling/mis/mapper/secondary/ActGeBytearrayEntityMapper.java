package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ActGeBytearrayEntity;

public interface ActGeBytearrayEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActGeBytearrayEntity record);

    int insertSelective(ActGeBytearrayEntity record);

    ActGeBytearrayEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActGeBytearrayEntity record);

    int updateByPrimaryKeyWithBLOBs(ActGeBytearrayEntity record);

    int updateByPrimaryKey(ActGeBytearrayEntity record);
}