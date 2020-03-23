package com.junling.mis.mapper;

import com.junling.mis.model.thirdPartyPaymentEntity;
import com.junling.mis.model.thirdPartyPaymentEntityKey;

public interface thirdPartyPaymentEntityMapper {
    int deleteByPrimaryKey(thirdPartyPaymentEntityKey key);

    int insert(thirdPartyPaymentEntity record);

    int insertSelective(thirdPartyPaymentEntity record);

    thirdPartyPaymentEntity selectByPrimaryKey(thirdPartyPaymentEntityKey key);

    int updateByPrimaryKeySelective(thirdPartyPaymentEntity record);

    int updateByPrimaryKey(thirdPartyPaymentEntity record);
}