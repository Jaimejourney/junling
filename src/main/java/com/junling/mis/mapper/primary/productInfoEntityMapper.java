package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.productInfoEntity;

public interface productInfoEntityMapper {
    int deleteByPrimaryKey(String productId);

    int insert(productInfoEntity record);

    int insertSelective(productInfoEntity record);

    productInfoEntity selectByPrimaryKey(String productId);

    int updateByPrimaryKeySelective(productInfoEntity record);

    int updateByPrimaryKey(productInfoEntity record);
}