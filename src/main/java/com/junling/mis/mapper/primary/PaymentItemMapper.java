package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.PaymentItem;

public interface PaymentItemMapper {
    int insert(PaymentItem record);

    int insertSelective(PaymentItem record);
}