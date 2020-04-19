package com.junling.mis.service.primary;


import com.junling.mis.model.primary.ClaimInfo;
import com.junling.mis.model.primary.ClaimInfoKey;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface ClaimInfoService {

	Boolean addClaimInfo(ClaimInfo claimInfo) throws Exception;

	Boolean updateClaimInfo(ClaimInfo claimInfo) throws Exception;

	ClaimInfo findDetailClaimInfo(ClaimInfoKey key) throws Exception;
	
//	Result listClaimInfo(ClaimInfoModel claimInfoModel) throws Exception;
//
//    Result listClaimInfoPage(ClaimInfoModel claimInfoModel) throws Exception;
//
//	Result countClaimInfo(ClaimInfoModel claimInfoModel) throws Exception;
	
	Boolean deleteClaimInfo(ClaimInfoKey key) throws Exception;
}