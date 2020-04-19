package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ActHiProcinstEntity;

public interface ActHiProcinstEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActHiProcinstEntity record);

    int insertSelective(ActHiProcinstEntity record);

    ActHiProcinstEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActHiProcinstEntity record);

    int updateByPrimaryKey(ActHiProcinstEntity record);
}