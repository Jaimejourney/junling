package com.junling.mis.mapper;

import com.junling.mis.model.tbCompanyNatureEntity;

public interface tbCompanyNatureEntityMapper {
    int deleteByPrimaryKey(String tbCompanyCode);

    int insert(tbCompanyNatureEntity record);

    int insertSelective(tbCompanyNatureEntity record);

    tbCompanyNatureEntity selectByPrimaryKey(String tbCompanyCode);

    int updateByPrimaryKeySelective(tbCompanyNatureEntity record);

    int updateByPrimaryKey(tbCompanyNatureEntity record);
}