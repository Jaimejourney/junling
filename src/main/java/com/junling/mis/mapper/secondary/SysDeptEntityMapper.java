package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.SysDeptEntity;

public interface SysDeptEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysDeptEntity record);

    int insertSelective(SysDeptEntity record);

    SysDeptEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysDeptEntity record);

    int updateByPrimaryKey(SysDeptEntity record);
}