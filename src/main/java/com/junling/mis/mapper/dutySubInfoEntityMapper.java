package com.junling.mis.mapper;

import com.junling.mis.model.dutySubInfoEntity;

public interface dutySubInfoEntityMapper {
    int deleteByPrimaryKey(String dutySubId);

    int insert(dutySubInfoEntity record);

    int insertSelective(dutySubInfoEntity record);

    dutySubInfoEntity selectByPrimaryKey(String dutySubId);

    int updateByPrimaryKeySelective(dutySubInfoEntity record);

    int updateByPrimaryKey(dutySubInfoEntity record);
}