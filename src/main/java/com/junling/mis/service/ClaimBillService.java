package com.junling.mis.service;;

import com.junling.mis.model.claimBillEntity;
import com.junling.mis.model.claimBillEntityKey;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface ClaimBillService {

	Boolean addClaimBill(claimBillEntity claimBillEntity) throws Exception;

	Boolean updateClaimBill(claimBillEntity claimBillEntity) throws Exception;

	claimBillEntity findDetailClaimBill(claimBillEntityKey key) throws Exception;
	
//	Result listClaimBill(ClaimBillModel claimBillModel) throws Exception;
//
//    Result listClaimBillPage(ClaimBillModel claimBillModel) throws Exception;
//
//	Result countClaimBill(ClaimBillModel claimBillModel) throws Exception;
	
	 Boolean deleteClaimBill(claimBillEntityKey key) throws Exception;
}