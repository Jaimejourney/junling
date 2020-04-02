package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.claimAccountInfo;
import com.junling.mis.model.primary.claimAccountInfoKey;

public interface claimAccountInfoMapper {
    int deleteByPrimaryKey(claimAccountInfoKey key);

    int insert(claimAccountInfo record);

    int insertSelective(claimAccountInfo record);

    claimAccountInfo selectByPrimaryKey(claimAccountInfoKey key);

    int updateByPrimaryKeySelective(claimAccountInfo record);

    int updateByPrimaryKey(claimAccountInfo record);
}