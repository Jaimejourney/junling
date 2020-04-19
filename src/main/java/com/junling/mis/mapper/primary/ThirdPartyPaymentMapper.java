package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.ThirdPartyPayment;
import com.junling.mis.model.primary.ThirdPartyPaymentKey;

public interface ThirdPartyPaymentMapper {
    int deleteByPrimaryKey(ThirdPartyPaymentKey key);

    int insert(ThirdPartyPayment record);

    int insertSelective(ThirdPartyPayment record);

    ThirdPartyPayment selectByPrimaryKey(ThirdPartyPaymentKey key);

    int updateByPrimaryKeySelective(ThirdPartyPayment record);

    int updateByPrimaryKey(ThirdPartyPayment record);
}