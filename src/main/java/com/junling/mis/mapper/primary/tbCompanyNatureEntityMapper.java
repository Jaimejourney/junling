package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbCompanyNatureEntity;

public interface tbCompanyNatureEntityMapper {
    int deleteByPrimaryKey(String tbCompanyCode);

    int insert(tbCompanyNatureEntity record);

    int insertSelective(tbCompanyNatureEntity record);

    tbCompanyNatureEntity selectByPrimaryKey(String tbCompanyCode);

    int updateByPrimaryKeySelective(tbCompanyNatureEntity record);

    int updateByPrimaryKey(tbCompanyNatureEntity record);
}