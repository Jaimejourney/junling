package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.sysDeptEntity;

public interface sysDeptEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(sysDeptEntity record);

    int insertSelective(sysDeptEntity record);

    sysDeptEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(sysDeptEntity record);

    int updateByPrimaryKey(sysDeptEntity record);
}