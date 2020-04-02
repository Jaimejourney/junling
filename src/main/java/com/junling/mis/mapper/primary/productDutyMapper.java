package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.productDuty;

public interface productDutyMapper {
    int deleteByPrimaryKey(String productDutyId);

    int insert(productDuty record);

    int insertSelective(productDuty record);

    productDuty selectByPrimaryKey(String productDutyId);

    int updateByPrimaryKeySelective(productDuty record);

    int updateByPrimaryKey(productDuty record);
}