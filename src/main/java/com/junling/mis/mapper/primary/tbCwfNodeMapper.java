package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbCwfNode;

public interface tbCwfNodeMapper {
    int deleteByPrimaryKey(String cwfNode);

    int insert(tbCwfNode record);

    int insertSelective(tbCwfNode record);

    tbCwfNode selectByPrimaryKey(String cwfNode);

    int updateByPrimaryKeySelective(tbCwfNode record);

    int updateByPrimaryKey(tbCwfNode record);
}