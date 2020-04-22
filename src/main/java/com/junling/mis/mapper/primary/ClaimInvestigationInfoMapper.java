package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.ClaimInvestigationInfo;

public interface ClaimInvestigationInfoMapper {
    int deleteByPrimaryKey(String claimInvestigationInfoId);

    int insert(ClaimInvestigationInfo record);

    int insertSelective(ClaimInvestigationInfo record);

    ClaimInvestigationInfo selectByPrimaryKey(String claimInvestigationInfoId);

    ClaimInvestigationInfo selectByClaimNo(String claimNo);

    int updateByPrimaryKeySelective(ClaimInvestigationInfo record);

    int updateByPrimaryKey(ClaimInvestigationInfo record);
}