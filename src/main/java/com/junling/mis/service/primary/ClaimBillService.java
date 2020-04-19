package com.junling.mis.service.primary;

import com.junling.mis.model.primary.ClaimBill;
import com.junling.mis.model.primary.ClaimBillKey;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface ClaimBillService {

	Boolean addClaimBill(ClaimBill claimBill) throws Exception;

	Boolean updateClaimBill(ClaimBill claimBill) throws Exception;

	ClaimBill findDetailClaimBill(ClaimBillKey key) throws Exception;
	
//	Result listClaimBill(ClaimBillModel claimBillModel) throws Exception;
//
//    Result listClaimBillPage(ClaimBillModel claimBillModel) throws Exception;
//
//	Result countClaimBill(ClaimBillModel claimBillModel) throws Exception;
	
	 Boolean deleteClaimBill(ClaimBillKey key) throws Exception;
}