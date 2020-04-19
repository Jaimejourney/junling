package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.SwzEntity;

public interface SwzEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SwzEntity record);

    int insertSelective(SwzEntity record);

    SwzEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SwzEntity record);

    int updateByPrimaryKey(SwzEntity record);
}