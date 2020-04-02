package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.paymentItem;

public interface paymentItemMapper {
    int insert(paymentItem record);

    int insertSelective(paymentItem record);
}