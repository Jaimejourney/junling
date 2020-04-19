package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ErrorLogEntity;

public interface ErrorLogEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ErrorLogEntity record);

    int insertSelective(ErrorLogEntity record);

    ErrorLogEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ErrorLogEntity record);

    int updateByPrimaryKey(ErrorLogEntity record);
}