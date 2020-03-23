package com.junling.mis.mapper;

import com.junling.mis.model.tbIcd10Entity;

public interface tbIcd10EntityMapper {
    int deleteByPrimaryKey(String icd);

    int insert(tbIcd10Entity record);

    int insertSelective(tbIcd10Entity record);

    tbIcd10Entity selectByPrimaryKey(String icd);

    int updateByPrimaryKeySelective(tbIcd10Entity record);

    int updateByPrimaryKey(tbIcd10Entity record);
}