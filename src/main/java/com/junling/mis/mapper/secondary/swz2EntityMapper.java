package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.swz2Entity;

public interface swz2EntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(swz2Entity record);

    int insertSelective(swz2Entity record);

    swz2Entity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(swz2Entity record);

    int updateByPrimaryKey(swz2Entity record);
}