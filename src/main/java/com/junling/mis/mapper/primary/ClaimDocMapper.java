package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.ClaimDoc;
import com.junling.mis.model.primary.ClaimDocKey;

public interface ClaimDocMapper {
    int deleteByPrimaryKey(ClaimDocKey key);

    int insert(ClaimDoc record);

    int insertSelective(ClaimDoc record);

    ClaimDoc selectByPrimaryKey(ClaimDocKey key);

    ClaimDoc selectByClaimNo(String claimNo);

    int updateByPrimaryKeySelective(ClaimDoc record);

    int updateByPrimaryKey(ClaimDoc record);
}