package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.paymentItemEntity;

public interface paymentItemEntityMapper {
    int insert(paymentItemEntity record);

    int insertSelective(paymentItemEntity record);
}