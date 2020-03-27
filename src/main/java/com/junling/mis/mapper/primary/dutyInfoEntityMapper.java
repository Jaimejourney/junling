package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.dutyInfoEntity;

public interface dutyInfoEntityMapper {
    int deleteByPrimaryKey(String dutyId);

    int insert(dutyInfoEntity record);

    int insertSelective(dutyInfoEntity record);

    dutyInfoEntity selectByPrimaryKey(String dutyId);

    int updateByPrimaryKeySelective(dutyInfoEntity record);

    int updateByPrimaryKey(dutyInfoEntity record);
}