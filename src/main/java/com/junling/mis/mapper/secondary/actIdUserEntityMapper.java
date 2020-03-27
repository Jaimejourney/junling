package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.actIdUserEntity;

public interface actIdUserEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(actIdUserEntity record);

    int insertSelective(actIdUserEntity record);

    actIdUserEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(actIdUserEntity record);

    int updateByPrimaryKey(actIdUserEntity record);
}