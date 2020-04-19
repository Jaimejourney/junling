package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.TbIdType;

public interface TbIdTypeMapper {
    int deleteByPrimaryKey(String idTypeCode);

    int insert(TbIdType record);

    int insertSelective(TbIdType record);

    TbIdType selectByPrimaryKey(String idTypeCode);

    int updateByPrimaryKeySelective(TbIdType record);

    int updateByPrimaryKey(TbIdType record);
}