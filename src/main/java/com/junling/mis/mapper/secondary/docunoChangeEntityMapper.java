package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.docunoChangeEntity;

public interface docunoChangeEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(docunoChangeEntity record);

    int insertSelective(docunoChangeEntity record);

    docunoChangeEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(docunoChangeEntity record);

    int updateByPrimaryKey(docunoChangeEntity record);
}