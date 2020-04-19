package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.TbClaimStatus;

public interface TbClaimStatusMapper {
    int deleteByPrimaryKey(String statusCode);

    int insert(TbClaimStatus record);

    int insertSelective(TbClaimStatus record);

    TbClaimStatus selectByPrimaryKey(String statusCode);

    int updateByPrimaryKeySelective(TbClaimStatus record);

    int updateByPrimaryKey(TbClaimStatus record);
}