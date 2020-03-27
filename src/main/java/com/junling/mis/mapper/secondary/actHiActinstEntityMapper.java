package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.actHiActinstEntity;

public interface actHiActinstEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(actHiActinstEntity record);

    int insertSelective(actHiActinstEntity record);

    actHiActinstEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(actHiActinstEntity record);

    int updateByPrimaryKey(actHiActinstEntity record);
}