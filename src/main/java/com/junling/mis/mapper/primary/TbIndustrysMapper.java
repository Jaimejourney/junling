package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.TbIndustrys;

public interface TbIndustrysMapper {
    int deleteByPrimaryKey(String industryTypeCode);

    int insert(TbIndustrys record);

    int insertSelective(TbIndustrys record);

    TbIndustrys selectByPrimaryKey(String industryTypeCode);

    int updateByPrimaryKeySelective(TbIndustrys record);

    int updateByPrimaryKey(TbIndustrys record);
}