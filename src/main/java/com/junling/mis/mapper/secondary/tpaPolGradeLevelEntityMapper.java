package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.tpaPolGradeLevelEntity;

public interface tpaPolGradeLevelEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(tpaPolGradeLevelEntity record);

    int insertSelective(tpaPolGradeLevelEntity record);

    tpaPolGradeLevelEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(tpaPolGradeLevelEntity record);

    int updateByPrimaryKey(tpaPolGradeLevelEntity record);
}