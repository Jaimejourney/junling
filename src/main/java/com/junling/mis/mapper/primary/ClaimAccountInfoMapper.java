package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.ClaimAccountInfo;
import com.junling.mis.model.primary.ClaimAccountInfoKey;

public interface ClaimAccountInfoMapper {
    int deleteByPrimaryKey(ClaimAccountInfoKey key);

    int insert(ClaimAccountInfo record);

    int insertSelective(ClaimAccountInfo record);

    ClaimAccountInfo selectByPrimaryKey(ClaimAccountInfoKey key);

    ClaimAccountInfo selectByClaimInfoId(String claimInfoId);

    int updateByPrimaryKeySelective(ClaimAccountInfo record);

    int updateByPrimaryKey(ClaimAccountInfo record);
}