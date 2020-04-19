package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.TbImageType;

public interface TbImageTypeMapper {
    int deleteByPrimaryKey(String docTypeCode);

    int insert(TbImageType record);

    int insertSelective(TbImageType record);

    TbImageType selectByPrimaryKey(String docTypeCode);

    int updateByPrimaryKeySelective(TbImageType record);

    int updateByPrimaryKey(TbImageType record);
}