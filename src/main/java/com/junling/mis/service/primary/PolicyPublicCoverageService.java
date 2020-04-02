package com.junling.mis.service.primary;

import com.junling.mis.model.primary.policyPublicCoverage;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface PolicyPublicCoverageService {

	Boolean addPolicyPublicCoverage(policyPublicCoverage policyPublicCoverage) throws Exception;

	Boolean updatePolicyPublicCoverage(policyPublicCoverage policyPublicCoverage) throws Exception;

	policyPublicCoverage findDetailPolicyPublicCoverage(String policyPublicCoverageId) throws Exception;
	
//	Result listPolicyPublicCoverage(PolicyPublicCoverageModel policyPublicCoverageModel) throws Exception;
//
//    Result listPolicyPublicCoveragePage(PolicyPublicCoverageModel policyPublicCoverageModel) throws Exception;
//
//	Result countPolicyPublicCoverage(PolicyPublicCoverageModel policyPublicCoverageModel) throws Exception;
	
	Boolean deletePolicyPublicCoverage(String policyPublicCoverageId) throws Exception;
}