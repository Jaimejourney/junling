package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.ClauseInfo;

public interface ClauseInfoMapper {
    int deleteByPrimaryKey(String clauseId);

    int insert(ClauseInfo record);

    int insertSelective(ClauseInfo record);

    ClauseInfo selectByPrimaryKey(String clauseId);

    int updateByPrimaryKeySelective(ClauseInfo record);

    int updateByPrimaryKeyWithBLOBs(ClauseInfo record);

    int updateByPrimaryKey(ClauseInfo record);
}