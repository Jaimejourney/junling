package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.TpaPolGradeLevelEntity;

public interface TpaPolGradeLevelEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TpaPolGradeLevelEntity record);

    int insertSelective(TpaPolGradeLevelEntity record);

    TpaPolGradeLevelEntity selectByPrimaryKey(Integer id);

    TpaPolGradeLevelEntity selectByPolNo(String polNo);

    int updateByPrimaryKeySelective(TpaPolGradeLevelEntity record);

    int updateByPrimaryKey(TpaPolGradeLevelEntity record);
}