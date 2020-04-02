package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.pglpdClaimRate;

public interface pglpdClaimRateMapper {
    int deleteByPrimaryKey(String pglpdClaimRateId);

    int insert(pglpdClaimRate record);

    int insertSelective(pglpdClaimRate record);

    pglpdClaimRate selectByPrimaryKey(String pglpdClaimRateId);

    int updateByPrimaryKeySelective(pglpdClaimRate record);

    int updateByPrimaryKey(pglpdClaimRate record);
}