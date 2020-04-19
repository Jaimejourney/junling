package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.TbCompanyNature;

public interface TbCompanyNatureMapper {
    int deleteByPrimaryKey(String tbCompanyCode);

    int insert(TbCompanyNature record);

    int insertSelective(TbCompanyNature record);

    TbCompanyNature selectByPrimaryKey(String tbCompanyCode);

    int updateByPrimaryKeySelective(TbCompanyNature record);

    int updateByPrimaryKey(TbCompanyNature record);
}