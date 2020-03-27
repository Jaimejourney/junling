package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.errorLogEntity;

public interface errorLogEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(errorLogEntity record);

    int insertSelective(errorLogEntity record);

    errorLogEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(errorLogEntity record);

    int updateByPrimaryKey(errorLogEntity record);
}