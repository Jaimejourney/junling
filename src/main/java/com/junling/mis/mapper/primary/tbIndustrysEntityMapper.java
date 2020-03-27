package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbIndustrysEntity;

public interface tbIndustrysEntityMapper {
    int deleteByPrimaryKey(String industryTypeCode);

    int insert(tbIndustrysEntity record);

    int insertSelective(tbIndustrysEntity record);

    tbIndustrysEntity selectByPrimaryKey(String industryTypeCode);

    int updateByPrimaryKeySelective(tbIndustrysEntity record);

    int updateByPrimaryKey(tbIndustrysEntity record);
}