package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.ClaimInfo;
import com.junling.mis.model.primary.ClaimInfoKey;

public interface ClaimInfoMapper {
    int deleteByPrimaryKey(ClaimInfoKey key);

    int insert(ClaimInfo record);

    int insertSelective(ClaimInfo record);

    ClaimInfo selectByPrimaryKey(ClaimInfoKey key);

    ClaimInfo selectByClaimNo(String claimNo);

    int updateByPrimaryKeySelective(ClaimInfo record);

    int updateByPrimaryKey(ClaimInfo record);
}