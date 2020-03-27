package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.swzEntity;

public interface swzEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(swzEntity record);

    int insertSelective(swzEntity record);

    swzEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(swzEntity record);

    int updateByPrimaryKey(swzEntity record);
}