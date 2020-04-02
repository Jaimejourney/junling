package com.junling.mis.service.primary;


import com.junling.mis.model.primary.claimAccountInfo;
import com.junling.mis.model.primary.claimAccountInfoKey;

/**
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface ClaimAccountInfoService {

    Boolean addClaimAccountInfo(claimAccountInfo claimAccountInfoEntity) throws Exception;

    Boolean updateClaimAccountInfo(claimAccountInfo claimAccountInfoEntity) throws Exception;
//
    claimAccountInfo findDetailClaimAccountInfo(claimAccountInfoKey key) throws Exception;
//
//    Result listClaimAccountInfo(ClaimAccountInfoModel claimAccountInfoModel) throws Exception;
//
//    Result listClaimAccountInfoPage(ClaimAccountInfoModel claimAccountInfoModel) throws Exception;
//
//    Result countClaimAccountInfo(ClaimAccountInfoModel claimAccountInfoModel) throws Exception;
//
    Boolean deleteClaimAccountInfo(claimAccountInfoKey key) throws Exception;
}
