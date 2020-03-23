package com.junling.mis.service;;

import com.junling.mis.model.claimWorkFlowEntity;


/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface ClaimWorkFlowService {

	Boolean addClaimWorkFlow(claimWorkFlowEntity claimWorkFlowEntity) throws Exception;

	Boolean updateClaimWorkFlow(claimWorkFlowEntity claimWorkFlowEntity) throws Exception;

	claimWorkFlowEntity findDetailClaimWorkFlow(String claimWorkFlowId) throws Exception;
	
//	Result listClaimWorkFlow(ClaimWorkFlowModel claimWorkFlowModel) throws Exception;
//
//    Result listClaimWorkFlowPage(ClaimWorkFlowModel claimWorkFlowModel) throws Exception;
//
//	Result countClaimWorkFlow(ClaimWorkFlowModel claimWorkFlowModel) throws Exception;
	
	Boolean deleteClaimWorkFlow(String claimWorkFlowId) throws Exception;
}