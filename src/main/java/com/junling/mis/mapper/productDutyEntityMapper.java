package com.junling.mis.mapper;

import com.junling.mis.model.productDutyEntity;
import com.junling.mis.model.productDutyEntityKey;

public interface productDutyEntityMapper {
    int deleteByPrimaryKey(productDutyEntityKey key);

    int insert(productDutyEntity record);

    int insertSelective(productDutyEntity record);

    productDutyEntity selectByPrimaryKey(productDutyEntityKey key);

    int updateByPrimaryKeySelective(productDutyEntity record);

    int updateByPrimaryKey(productDutyEntity record);
}