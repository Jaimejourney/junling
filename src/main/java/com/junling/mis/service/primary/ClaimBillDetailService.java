package com.junling.mis.service.primary;


import com.junling.mis.model.primary.claimBillDetail;
import com.junling.mis.model.primary.claimBillDetailKey;

/**
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface ClaimBillDetailService {

	Boolean addClaimBillDetail(claimBillDetail claimBillDetailEntity) throws Exception;

	Boolean updateClaimBillDetail(claimBillDetail claimBillDetailEntity) throws Exception;

	claimBillDetail findDetailClaimBillDetail(claimBillDetailKey key) throws Exception;
	
//	Result listClaimBillDetail(ClaimBillDetailModel claimBillDetailModel) throws Exception;
//
//    Result listClaimBillDetailPage(ClaimBillDetailModel claimBillDetailModel) throws Exception;
//
//	Result countClaimBillDetail(ClaimBillDetailModel claimBillDetailModel) throws Exception;
	
	Boolean deleteClaimBillDetail(claimBillDetailKey key) throws Exception;
}