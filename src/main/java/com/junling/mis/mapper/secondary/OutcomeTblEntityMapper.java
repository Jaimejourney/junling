package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.OutcomeTblEntity;

public interface OutcomeTblEntityMapper {
    int deleteByPrimaryKey(String outcomeId);

    int insert(OutcomeTblEntity record);

    int insertSelective(OutcomeTblEntity record);

    OutcomeTblEntity selectByPrimaryKey(String outcomeId);

    int updateByPrimaryKeySelective(OutcomeTblEntity record);

    int updateByPrimaryKey(OutcomeTblEntity record);
}