package com.junling.mis.service.primary;

import com.junling.mis.model.primary.ClaimWorkFlow;


/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface ClaimWorkFlowService {

	Boolean addClaimWorkFlow(ClaimWorkFlow claimWorkFlow) throws Exception;

	Boolean updateClaimWorkFlow(ClaimWorkFlow claimWorkFlow) throws Exception;

	ClaimWorkFlow findDetailClaimWorkFlow(String claimWorkFlowId) throws Exception;
	
//	Result listClaimWorkFlow(ClaimWorkFlowModel claimWorkFlowModel) throws Exception;
//
//    Result listClaimWorkFlowPage(ClaimWorkFlowModel claimWorkFlowModel) throws Exception;
//
//	Result countClaimWorkFlow(ClaimWorkFlowModel claimWorkFlowModel) throws Exception;
	
	Boolean deleteClaimWorkFlow(String claimWorkFlowId) throws Exception;
}