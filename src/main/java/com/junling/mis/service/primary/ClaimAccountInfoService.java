package com.junling.mis.service.primary;


import com.junling.mis.model.primary.ClaimAccountInfo;
import com.junling.mis.model.primary.ClaimAccountInfoKey;

/**
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface ClaimAccountInfoService {

    Boolean addClaimAccountInfo(ClaimAccountInfo claimAccountInfoEntity) throws Exception;

    Boolean updateClaimAccountInfo(ClaimAccountInfo claimAccountInfoEntity) throws Exception;
//
    ClaimAccountInfo findDetailClaimAccountInfo(ClaimAccountInfoKey key) throws Exception;
//
//    Result listClaimAccountInfo(ClaimAccountInfoModel claimAccountInfoModel) throws Exception;
//
//    Result listClaimAccountInfoPage(ClaimAccountInfoModel claimAccountInfoModel) throws Exception;
//
//    Result countClaimAccountInfo(ClaimAccountInfoModel claimAccountInfoModel) throws Exception;
//
    Boolean deleteClaimAccountInfo(ClaimAccountInfoKey key) throws Exception;
}
