package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbCompanyNature;

public interface tbCompanyNatureMapper {
    int deleteByPrimaryKey(String tbCompanyCode);

    int insert(tbCompanyNature record);

    int insertSelective(tbCompanyNature record);

    tbCompanyNature selectByPrimaryKey(String tbCompanyCode);

    int updateByPrimaryKeySelective(tbCompanyNature record);

    int updateByPrimaryKey(tbCompanyNature record);
}