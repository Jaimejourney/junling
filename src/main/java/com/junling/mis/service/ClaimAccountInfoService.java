package com.junling.mis.service;


import com.junling.mis.model.claimAccountInfoEntity;

/**
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface ClaimAccountInfoService {

    Boolean addClaimAccountInfo(claimAccountInfoEntity claimAccountInfoEntity) throws Exception;

    Boolean updateClaimAccountInfo(claimAccountInfoEntity claimAccountInfoEntity) throws Exception;
//
    claimAccountInfoEntity findDetailClaimAccountInfo(String accountId) throws Exception;
//
//    Result listClaimAccountInfo(ClaimAccountInfoModel claimAccountInfoModel) throws Exception;
//
//    Result listClaimAccountInfoPage(ClaimAccountInfoModel claimAccountInfoModel) throws Exception;
//
//    Result countClaimAccountInfo(ClaimAccountInfoModel claimAccountInfoModel) throws Exception;
//
    Boolean deleteClaimAccountInfo(String accountId) throws Exception;
}
