package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbIcd10;

public interface tbIcd10Mapper {
    int deleteByPrimaryKey(String icd);

    int insert(tbIcd10 record);

    int insertSelective(tbIcd10 record);

    tbIcd10 selectByPrimaryKey(String icd);

    int updateByPrimaryKeySelective(tbIcd10 record);

    int updateByPrimaryKey(tbIcd10 record);
}