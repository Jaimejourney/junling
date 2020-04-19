package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.RenbaoEndCaseEntity;

public interface RenbaoEndCaseEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RenbaoEndCaseEntity record);

    int insertSelective(RenbaoEndCaseEntity record);

    RenbaoEndCaseEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RenbaoEndCaseEntity record);

    int updateByPrimaryKey(RenbaoEndCaseEntity record);
}