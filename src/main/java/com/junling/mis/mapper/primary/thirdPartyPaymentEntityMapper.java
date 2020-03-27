package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.thirdPartyPaymentEntity;
import com.junling.mis.model.primary.thirdPartyPaymentEntityKey;

public interface thirdPartyPaymentEntityMapper {
    int deleteByPrimaryKey(thirdPartyPaymentEntityKey key);

    int insert(thirdPartyPaymentEntity record);

    int insertSelective(thirdPartyPaymentEntity record);

    thirdPartyPaymentEntity selectByPrimaryKey(thirdPartyPaymentEntityKey key);

    int updateByPrimaryKeySelective(thirdPartyPaymentEntity record);

    int updateByPrimaryKey(thirdPartyPaymentEntity record);
}