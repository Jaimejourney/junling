package com.junling.mis.service.primary;

import com.junling.mis.model.primary.claimBill;
import com.junling.mis.model.primary.claimBillKey;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface ClaimBillService {

	Boolean addClaimBill(claimBill claimBill) throws Exception;

	Boolean updateClaimBill(claimBill claimBill) throws Exception;

	claimBill findDetailClaimBill(claimBillKey key) throws Exception;
	
//	Result listClaimBill(ClaimBillModel claimBillModel) throws Exception;
//
//    Result listClaimBillPage(ClaimBillModel claimBillModel) throws Exception;
//
//	Result countClaimBill(ClaimBillModel claimBillModel) throws Exception;
	
	 Boolean deleteClaimBill(claimBillKey key) throws Exception;
}