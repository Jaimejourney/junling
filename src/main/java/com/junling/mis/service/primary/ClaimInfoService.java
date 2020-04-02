package com.junling.mis.service.primary;


import com.junling.mis.model.primary.claimInfo;
import com.junling.mis.model.primary.claimInfoKey;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface ClaimInfoService {

	Boolean addClaimInfo(claimInfo claimInfo) throws Exception;

	Boolean updateClaimInfo(claimInfo claimInfo) throws Exception;

	claimInfo findDetailClaimInfo(claimInfoKey key) throws Exception;
	
//	Result listClaimInfo(ClaimInfoModel claimInfoModel) throws Exception;
//
//    Result listClaimInfoPage(ClaimInfoModel claimInfoModel) throws Exception;
//
//	Result countClaimInfo(ClaimInfoModel claimInfoModel) throws Exception;
	
	Boolean deleteClaimInfo(claimInfoKey key) throws Exception;
}