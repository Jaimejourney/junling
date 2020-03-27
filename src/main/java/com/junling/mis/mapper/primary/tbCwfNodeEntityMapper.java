package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbCwfNodeEntity;

public interface tbCwfNodeEntityMapper {
    int deleteByPrimaryKey(String cwfNode);

    int insert(tbCwfNodeEntity record);

    int insertSelective(tbCwfNodeEntity record);

    tbCwfNodeEntity selectByPrimaryKey(String cwfNode);

    int updateByPrimaryKeySelective(tbCwfNodeEntity record);

    int updateByPrimaryKey(tbCwfNodeEntity record);
}