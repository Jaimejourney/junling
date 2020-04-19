package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.TpaHisClaimInfoEntity;

public interface TpaHisClaimInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TpaHisClaimInfoEntity record);

    int insertSelective(TpaHisClaimInfoEntity record);

    TpaHisClaimInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TpaHisClaimInfoEntity record);

    int updateByPrimaryKey(TpaHisClaimInfoEntity record);
}