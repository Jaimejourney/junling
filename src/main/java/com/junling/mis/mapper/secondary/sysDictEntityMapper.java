package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.sysDictEntity;

public interface sysDictEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(sysDictEntity record);

    int insertSelective(sysDictEntity record);

    sysDictEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(sysDictEntity record);

    int updateByPrimaryKey(sysDictEntity record);
}