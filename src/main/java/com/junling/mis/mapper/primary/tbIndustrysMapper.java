package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbIndustrys;

public interface tbIndustrysMapper {
    int deleteByPrimaryKey(String industryTypeCode);

    int insert(tbIndustrys record);

    int insertSelective(tbIndustrys record);

    tbIndustrys selectByPrimaryKey(String industryTypeCode);

    int updateByPrimaryKeySelective(tbIndustrys record);

    int updateByPrimaryKey(tbIndustrys record);
}