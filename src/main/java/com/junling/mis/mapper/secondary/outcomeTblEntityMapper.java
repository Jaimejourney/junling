package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.outcomeTblEntity;

public interface outcomeTblEntityMapper {
    int deleteByPrimaryKey(String outcomeId);

    int insert(outcomeTblEntity record);

    int insertSelective(outcomeTblEntity record);

    outcomeTblEntity selectByPrimaryKey(String outcomeId);

    int updateByPrimaryKeySelective(outcomeTblEntity record);

    int updateByPrimaryKey(outcomeTblEntity record);
}