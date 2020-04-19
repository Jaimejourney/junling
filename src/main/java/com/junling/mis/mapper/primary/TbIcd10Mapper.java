package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.TbIcd10;

public interface TbIcd10Mapper {
    int deleteByPrimaryKey(String icd);

    int insert(TbIcd10 record);

    int insertSelective(TbIcd10 record);

    TbIcd10 selectByPrimaryKey(String icd);

    int updateByPrimaryKeySelective(TbIcd10 record);

    int updateByPrimaryKey(TbIcd10 record);
}