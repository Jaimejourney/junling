package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.DutyInfo;

public interface DutyInfoMapper {
    int deleteByPrimaryKey(String dutyId);

    int insert(DutyInfo record);

    int insertSelective(DutyInfo record);

    DutyInfo selectByPrimaryKey(String dutyId);

    int updateByPrimaryKeySelective(DutyInfo record);

    int updateByPrimaryKey(DutyInfo record);
}