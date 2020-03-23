package com.junling.mis.service;;


import com.junling.mis.model.claimInfoEntity;
import com.junling.mis.model.claimInfoEntityKey;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface ClaimInfoService {

	Boolean addClaimInfo(claimInfoEntity claimInfoEntity) throws Exception;

	Boolean updateClaimInfo(claimInfoEntity claimInfoEntity) throws Exception;

	claimInfoEntity findDetailClaimInfo(claimInfoEntityKey key) throws Exception;
	
//	Result listClaimInfo(ClaimInfoModel claimInfoModel) throws Exception;
//
//    Result listClaimInfoPage(ClaimInfoModel claimInfoModel) throws Exception;
//
//	Result countClaimInfo(ClaimInfoModel claimInfoModel) throws Exception;
	
	Boolean deleteClaimInfo(claimInfoEntityKey key) throws Exception;
}