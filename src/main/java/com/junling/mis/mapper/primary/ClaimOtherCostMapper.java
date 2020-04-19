package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.ClaimOtherCost;
import com.junling.mis.model.primary.ClaimOtherCostKey;

public interface ClaimOtherCostMapper {
    int deleteByPrimaryKey(ClaimOtherCostKey key);

    int insert(ClaimOtherCost record);

    int insertSelective(ClaimOtherCost record);

    ClaimOtherCost selectByPrimaryKey(ClaimOtherCostKey key);

    int updateByPrimaryKeySelective(ClaimOtherCost record);

    int updateByPrimaryKey(ClaimOtherCost record);
}