package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.SysDictEntity;

public interface SysDictEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysDictEntity record);

    int insertSelective(SysDictEntity record);

    SysDictEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysDictEntity record);

    int updateByPrimaryKey(SysDictEntity record);
}