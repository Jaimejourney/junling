package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.PaymentItemRelation;

public interface PaymentItemRelationMapper {
    int insert(PaymentItemRelation record);

    int insertSelective(PaymentItemRelation record);
}