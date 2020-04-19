package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.PglpsdClaimRate;

public interface PglpsdClaimRateMapper {
    int deleteByPrimaryKey(String pglpsdClaimRateId);

    int insert(PglpsdClaimRate record);

    int insertSelective(PglpsdClaimRate record);

    PglpsdClaimRate selectByPrimaryKey(String pglpsdClaimRateId);

    int updateByPrimaryKeySelective(PglpsdClaimRate record);

    int updateByPrimaryKey(PglpsdClaimRate record);
}