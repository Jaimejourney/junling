package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbImageTypeEntity;

public interface tbImageTypeEntityMapper {
    int deleteByPrimaryKey(String docTypeCode);

    int insert(tbImageTypeEntity record);

    int insertSelective(tbImageTypeEntity record);

    tbImageTypeEntity selectByPrimaryKey(String docTypeCode);

    int updateByPrimaryKeySelective(tbImageTypeEntity record);

    int updateByPrimaryKey(tbImageTypeEntity record);
}