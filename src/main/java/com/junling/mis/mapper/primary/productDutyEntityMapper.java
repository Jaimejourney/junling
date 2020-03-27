package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.productDutyEntity;
import com.junling.mis.model.primary.productDutyEntityKey;

public interface productDutyEntityMapper {
    int deleteByPrimaryKey(productDutyEntityKey key);

    int insert(productDutyEntity record);

    int insertSelective(productDutyEntity record);

    productDutyEntity selectByPrimaryKey(productDutyEntityKey key);

    int updateByPrimaryKeySelective(productDutyEntity record);

    int updateByPrimaryKey(productDutyEntity record);
}