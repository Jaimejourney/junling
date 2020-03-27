package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.tpaHisDocunoEntity;

public interface tpaHisDocunoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(tpaHisDocunoEntity record);

    int insertSelective(tpaHisDocunoEntity record);

    tpaHisDocunoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(tpaHisDocunoEntity record);

    int updateByPrimaryKey(tpaHisDocunoEntity record);
}