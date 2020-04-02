package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.claimDoc;
import com.junling.mis.model.primary.claimDocKey;

public interface claimDocMapper {
    int deleteByPrimaryKey(claimDocKey key);

    int insert(claimDoc record);

    int insertSelective(claimDoc record);

    claimDoc selectByPrimaryKey(claimDocKey key);

    int updateByPrimaryKeySelective(claimDoc record);

    int updateByPrimaryKey(claimDoc record);
}