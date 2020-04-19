package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.Swz2Entity;

public interface Swz2EntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Swz2Entity record);

    int insertSelective(Swz2Entity record);

    Swz2Entity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Swz2Entity record);

    int updateByPrimaryKey(Swz2Entity record);
}