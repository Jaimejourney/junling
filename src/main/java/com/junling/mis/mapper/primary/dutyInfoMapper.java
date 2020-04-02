package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.dutyInfo;

public interface dutyInfoMapper {
    int deleteByPrimaryKey(String dutyId);

    int insert(dutyInfo record);

    int insertSelective(dutyInfo record);

    dutyInfo selectByPrimaryKey(String dutyId);

    int updateByPrimaryKeySelective(dutyInfo record);

    int updateByPrimaryKey(dutyInfo record);
}