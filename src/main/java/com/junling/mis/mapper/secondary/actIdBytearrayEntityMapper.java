package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.actIdBytearrayEntity;

public interface actIdBytearrayEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(actIdBytearrayEntity record);

    int insertSelective(actIdBytearrayEntity record);

    actIdBytearrayEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(actIdBytearrayEntity record);

    int updateByPrimaryKeyWithBLOBs(actIdBytearrayEntity record);

    int updateByPrimaryKey(actIdBytearrayEntity record);
}