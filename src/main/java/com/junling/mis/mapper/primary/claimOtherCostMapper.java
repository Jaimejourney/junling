package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.claimOtherCost;
import com.junling.mis.model.primary.claimOtherCostKey;

public interface claimOtherCostMapper {
    int deleteByPrimaryKey(claimOtherCostKey key);

    int insert(claimOtherCost record);

    int insertSelective(claimOtherCost record);

    claimOtherCost selectByPrimaryKey(claimOtherCostKey key);

    int updateByPrimaryKeySelective(claimOtherCost record);

    int updateByPrimaryKey(claimOtherCost record);
}