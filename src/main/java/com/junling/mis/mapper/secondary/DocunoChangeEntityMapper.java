package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.DocunoChangeEntity;

public interface DocunoChangeEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DocunoChangeEntity record);

    int insertSelective(DocunoChangeEntity record);

    DocunoChangeEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DocunoChangeEntity record);

    int updateByPrimaryKey(DocunoChangeEntity record);
}