package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbClaimStatus;

public interface tbClaimStatusMapper {
    int deleteByPrimaryKey(String statusCode);

    int insert(tbClaimStatus record);

    int insertSelective(tbClaimStatus record);

    tbClaimStatus selectByPrimaryKey(String statusCode);

    int updateByPrimaryKeySelective(tbClaimStatus record);

    int updateByPrimaryKey(tbClaimStatus record);
}