package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.actHiProcinstEntity;

public interface actHiProcinstEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(actHiProcinstEntity record);

    int insertSelective(actHiProcinstEntity record);

    actHiProcinstEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(actHiProcinstEntity record);

    int updateByPrimaryKey(actHiProcinstEntity record);
}