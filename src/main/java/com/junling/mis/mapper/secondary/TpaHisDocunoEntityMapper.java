package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.TpaHisDocunoEntity;

public interface TpaHisDocunoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TpaHisDocunoEntity record);

    int insertSelective(TpaHisDocunoEntity record);

    TpaHisDocunoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TpaHisDocunoEntity record);

    int updateByPrimaryKey(TpaHisDocunoEntity record);
}