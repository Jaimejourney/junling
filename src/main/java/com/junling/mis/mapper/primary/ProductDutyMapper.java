package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.ProductDuty;

public interface ProductDutyMapper {
    int deleteByPrimaryKey(String productDutyId);

    int insert(ProductDuty record);

    int insertSelective(ProductDuty record);

    ProductDuty selectByPrimaryKey(String productDutyId);

    int updateByPrimaryKeySelective(ProductDuty record);

    int updateByPrimaryKey(ProductDuty record);
}