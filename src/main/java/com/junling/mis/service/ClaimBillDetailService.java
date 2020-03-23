package com.junling.mis.service;;

import com.junling.mis.model.claimBillDetailEntity;
import com.junling.mis.model.claimBillDetailEntityKey;


/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface ClaimBillDetailService {

	Boolean addClaimBillDetail(claimBillDetailEntity claimBillDetailEntity) throws Exception;

	Boolean updateClaimBillDetail(claimBillDetailEntity claimBillDetailEntity) throws Exception;

	claimBillDetailEntity findDetailClaimBillDetail(claimBillDetailEntityKey key) throws Exception;
	
//	Result listClaimBillDetail(ClaimBillDetailModel claimBillDetailModel) throws Exception;
//
//    Result listClaimBillDetailPage(ClaimBillDetailModel claimBillDetailModel) throws Exception;
//
//	Result countClaimBillDetail(ClaimBillDetailModel claimBillDetailModel) throws Exception;
	
	Boolean deleteClaimBillDetail(claimBillDetailEntityKey key) throws Exception;
}