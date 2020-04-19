package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.PartnerInfoEntity;

public interface PartnerInfoEntityMapper {
    int deleteByPrimaryKey(String partnerId);

    int insert(PartnerInfoEntity record);

    int insertSelective(PartnerInfoEntity record);

    PartnerInfoEntity selectByPrimaryKey(String partnerId);

    int updateByPrimaryKeySelective(PartnerInfoEntity record);

    int updateByPrimaryKey(PartnerInfoEntity record);
}