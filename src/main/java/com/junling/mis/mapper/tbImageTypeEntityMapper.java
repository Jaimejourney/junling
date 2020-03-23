package com.junling.mis.mapper;

import com.junling.mis.model.tbImageTypeEntity;

public interface tbImageTypeEntityMapper {
    int deleteByPrimaryKey(String docTypeCode);

    int insert(tbImageTypeEntity record);

    int insertSelective(tbImageTypeEntity record);

    tbImageTypeEntity selectByPrimaryKey(String docTypeCode);

    int updateByPrimaryKeySelective(tbImageTypeEntity record);

    int updateByPrimaryKey(tbImageTypeEntity record);
}