package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.tpaPolClientRelationEntity;

public interface tpaPolClientRelationEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(tpaPolClientRelationEntity record);

    int insertSelective(tpaPolClientRelationEntity record);

    tpaPolClientRelationEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(tpaPolClientRelationEntity record);

    int updateByPrimaryKey(tpaPolClientRelationEntity record);
}