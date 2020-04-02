package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.pglpsdClaimRate;

public interface pglpsdClaimRateMapper {
    int deleteByPrimaryKey(String pglpsdClaimRateId);

    int insert(pglpsdClaimRate record);

    int insertSelective(pglpsdClaimRate record);

    pglpsdClaimRate selectByPrimaryKey(String pglpsdClaimRateId);

    int updateByPrimaryKeySelective(pglpsdClaimRate record);

    int updateByPrimaryKey(pglpsdClaimRate record);
}