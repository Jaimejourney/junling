package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.tradeLogEntity;

public interface tradeLogEntityMapper {
    int deleteByPrimaryKey(String tradeno);

    int insert(tradeLogEntity record);

    int insertSelective(tradeLogEntity record);

    tradeLogEntity selectByPrimaryKey(String tradeno);

    int updateByPrimaryKeySelective(tradeLogEntity record);

    int updateByPrimaryKey(tradeLogEntity record);
}