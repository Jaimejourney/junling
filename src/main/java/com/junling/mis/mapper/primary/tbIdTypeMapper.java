package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbIdType;

public interface tbIdTypeMapper {
    int deleteByPrimaryKey(String idTypeCode);

    int insert(tbIdType record);

    int insertSelective(tbIdType record);

    tbIdType selectByPrimaryKey(String idTypeCode);

    int updateByPrimaryKeySelective(tbIdType record);

    int updateByPrimaryKey(tbIdType record);
}