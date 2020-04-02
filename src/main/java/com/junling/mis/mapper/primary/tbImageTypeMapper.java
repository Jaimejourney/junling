package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbImageType;

public interface tbImageTypeMapper {
    int deleteByPrimaryKey(String docTypeCode);

    int insert(tbImageType record);

    int insertSelective(tbImageType record);

    tbImageType selectByPrimaryKey(String docTypeCode);

    int updateByPrimaryKeySelective(tbImageType record);

    int updateByPrimaryKey(tbImageType record);
}