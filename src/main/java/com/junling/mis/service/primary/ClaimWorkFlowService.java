package com.junling.mis.service.primary;

import com.junling.mis.model.primary.claimWorkFlow;


/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface ClaimWorkFlowService {

	Boolean addClaimWorkFlow(claimWorkFlow claimWorkFlow) throws Exception;

	Boolean updateClaimWorkFlow(claimWorkFlow claimWorkFlow) throws Exception;

	claimWorkFlow findDetailClaimWorkFlow(String claimWorkFlowId) throws Exception;
	
//	Result listClaimWorkFlow(ClaimWorkFlowModel claimWorkFlowModel) throws Exception;
//
//    Result listClaimWorkFlowPage(ClaimWorkFlowModel claimWorkFlowModel) throws Exception;
//
//	Result countClaimWorkFlow(ClaimWorkFlowModel claimWorkFlowModel) throws Exception;
	
	Boolean deleteClaimWorkFlow(String claimWorkFlowId) throws Exception;
}