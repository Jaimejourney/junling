package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.renbaoEndCaseEntity;

public interface renbaoEndCaseEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(renbaoEndCaseEntity record);

    int insertSelective(renbaoEndCaseEntity record);

    renbaoEndCaseEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(renbaoEndCaseEntity record);

    int updateByPrimaryKey(renbaoEndCaseEntity record);
}