package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ActHiActinstEntity;

public interface ActHiActinstEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActHiActinstEntity record);

    int insertSelective(ActHiActinstEntity record);

    ActHiActinstEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActHiActinstEntity record);

    int updateByPrimaryKey(ActHiActinstEntity record);
}