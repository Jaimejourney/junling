package com.junling.mis.service.primary;


import com.junling.mis.model.primary.ClaimBillDetail;
import com.junling.mis.model.primary.ClaimBillDetailKey;

/**
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface ClaimBillDetailService {

	Boolean addClaimBillDetail(ClaimBillDetail claimBillDetailEntity) throws Exception;

	Boolean updateClaimBillDetail(ClaimBillDetail claimBillDetailEntity) throws Exception;

	ClaimBillDetail findDetailClaimBillDetail(ClaimBillDetailKey key) throws Exception;
	
//	Result listClaimBillDetail(ClaimBillDetailModel claimBillDetailModel) throws Exception;
//
//    Result listClaimBillDetailPage(ClaimBillDetailModel claimBillDetailModel) throws Exception;
//
//	Result countClaimBillDetail(ClaimBillDetailModel claimBillDetailModel) throws Exception;
	
	Boolean deleteClaimBillDetail(ClaimBillDetailKey key) throws Exception;
}