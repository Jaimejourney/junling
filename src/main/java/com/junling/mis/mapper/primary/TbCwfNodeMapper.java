package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.TbCwfNode;

public interface TbCwfNodeMapper {
    int deleteByPrimaryKey(String cwfNode);

    int insert(TbCwfNode record);

    int insertSelective(TbCwfNode record);

    TbCwfNode selectByPrimaryKey(String cwfNode);

    int updateByPrimaryKeySelective(TbCwfNode record);

    int updateByPrimaryKey(TbCwfNode record);
}