package com.junling.mis.mapper;

import com.junling.mis.model.dutyInfoEntity;

public interface dutyInfoEntityMapper {
    int deleteByPrimaryKey(String dutyId);

    int insert(dutyInfoEntity record);

    int insertSelective(dutyInfoEntity record);

    dutyInfoEntity selectByPrimaryKey(String dutyId);

    int updateByPrimaryKeySelective(dutyInfoEntity record);

    int updateByPrimaryKey(dutyInfoEntity record);
}