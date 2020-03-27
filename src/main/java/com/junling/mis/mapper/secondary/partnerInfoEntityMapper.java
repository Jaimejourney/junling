package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.partnerInfoEntity;

public interface partnerInfoEntityMapper {
    int deleteByPrimaryKey(String partnerId);

    int insert(partnerInfoEntity record);

    int insertSelective(partnerInfoEntity record);

    partnerInfoEntity selectByPrimaryKey(String partnerId);

    int updateByPrimaryKeySelective(partnerInfoEntity record);

    int updateByPrimaryKey(partnerInfoEntity record);
}