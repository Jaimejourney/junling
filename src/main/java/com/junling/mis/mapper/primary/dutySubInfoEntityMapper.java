package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.dutySubInfoEntity;

public interface dutySubInfoEntityMapper {
    int deleteByPrimaryKey(String dutySubId);

    int insert(dutySubInfoEntity record);

    int insertSelective(dutySubInfoEntity record);

    dutySubInfoEntity selectByPrimaryKey(String dutySubId);

    int updateByPrimaryKeySelective(dutySubInfoEntity record);

    int updateByPrimaryKey(dutySubInfoEntity record);
}