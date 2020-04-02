package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.dutySubInfo;

public interface dutySubInfoMapper {
    int deleteByPrimaryKey(String dutySubId);

    int insert(dutySubInfo record);

    int insertSelective(dutySubInfo record);

    dutySubInfo selectByPrimaryKey(String dutySubId);

    int updateByPrimaryKeySelective(dutySubInfo record);

    int updateByPrimaryKey(dutySubInfo record);
}