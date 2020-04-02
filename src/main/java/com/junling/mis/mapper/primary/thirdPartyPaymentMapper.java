package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.thirdPartyPayment;
import com.junling.mis.model.primary.thirdPartyPaymentKey;

public interface thirdPartyPaymentMapper {
    int deleteByPrimaryKey(thirdPartyPaymentKey key);

    int insert(thirdPartyPayment record);

    int insertSelective(thirdPartyPayment record);

    thirdPartyPayment selectByPrimaryKey(thirdPartyPaymentKey key);

    int updateByPrimaryKeySelective(thirdPartyPayment record);

    int updateByPrimaryKey(thirdPartyPayment record);
}