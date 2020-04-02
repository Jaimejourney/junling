package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.claimInfo;
import com.junling.mis.model.primary.claimInfoKey;

public interface claimInfoMapper {
    int deleteByPrimaryKey(claimInfoKey key);

    int insert(claimInfo record);

    int insertSelective(claimInfo record);

    claimInfo selectByPrimaryKey(claimInfoKey key);

    int updateByPrimaryKeySelective(claimInfo record);

    int updateByPrimaryKey(claimInfo record);
}