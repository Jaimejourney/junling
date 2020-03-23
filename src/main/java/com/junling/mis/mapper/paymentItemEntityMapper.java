package com.junling.mis.mapper;

import com.junling.mis.model.paymentItemEntity;

public interface paymentItemEntityMapper {
    int insert(paymentItemEntity record);

    int insertSelective(paymentItemEntity record);
}