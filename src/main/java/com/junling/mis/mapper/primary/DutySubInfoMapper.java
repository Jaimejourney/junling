package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.DutySubInfo;

public interface DutySubInfoMapper {
    int deleteByPrimaryKey(String dutySubId);

    int insert(DutySubInfo record);

    int insertSelective(DutySubInfo record);

    DutySubInfo selectByPrimaryKey(String dutySubId);

    int updateByPrimaryKeySelective(DutySubInfo record);

    int updateByPrimaryKey(DutySubInfo record);
}