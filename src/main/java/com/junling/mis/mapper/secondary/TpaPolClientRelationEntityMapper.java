package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.TpaPolClientRelationEntity;

public interface TpaPolClientRelationEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TpaPolClientRelationEntity record);

    int insertSelective(TpaPolClientRelationEntity record);

    TpaPolClientRelationEntity selectByPrimaryKey(Integer id);

    TpaPolClientRelationEntity selectByInsuredId(Long insuredId);

    int updateByPrimaryKeySelective(TpaPolClientRelationEntity record);

    int updateByPrimaryKey(TpaPolClientRelationEntity record);
}