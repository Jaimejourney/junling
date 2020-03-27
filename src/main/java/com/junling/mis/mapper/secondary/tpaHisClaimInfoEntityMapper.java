package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.tpaHisClaimInfoEntity;

public interface tpaHisClaimInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(tpaHisClaimInfoEntity record);

    int insertSelective(tpaHisClaimInfoEntity record);

    tpaHisClaimInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(tpaHisClaimInfoEntity record);

    int updateByPrimaryKey(tpaHisClaimInfoEntity record);
}