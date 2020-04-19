package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.TradeLogEntity;

public interface TradeLogEntityMapper {
    int deleteByPrimaryKey(String tradeno);

    int insert(TradeLogEntity record);

    int insertSelective(TradeLogEntity record);

    TradeLogEntity selectByPrimaryKey(String tradeno);

    int updateByPrimaryKeySelective(TradeLogEntity record);

    int updateByPrimaryKey(TradeLogEntity record);
}