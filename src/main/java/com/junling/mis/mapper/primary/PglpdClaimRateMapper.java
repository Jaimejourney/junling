package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.PglpdClaimRate;

public interface PglpdClaimRateMapper {
    int deleteByPrimaryKey(String pglpdClaimRateId);

    int insert(PglpdClaimRate record);

    int insertSelective(PglpdClaimRate record);

    PglpdClaimRate selectByPrimaryKey(String pglpdClaimRateId);

    int updateByPrimaryKeySelective(PglpdClaimRate record);

    int updateByPrimaryKey(PglpdClaimRate record);
}