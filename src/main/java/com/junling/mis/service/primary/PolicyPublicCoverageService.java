package com.junling.mis.service.primary;

import com.junling.mis.model.primary.PolicyPublicCoverage;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface PolicyPublicCoverageService {

	Boolean addPolicyPublicCoverage(PolicyPublicCoverage policyPublicCoverage) throws Exception;

	Boolean updatePolicyPublicCoverage(PolicyPublicCoverage policyPublicCoverage) throws Exception;

	PolicyPublicCoverage findDetailPolicyPublicCoverage(String policyPublicCoverageId) throws Exception;
	
//	Result listPolicyPublicCoverage(PolicyPublicCoverageModel policyPublicCoverageModel) throws Exception;
//
//    Result listPolicyPublicCoveragePage(PolicyPublicCoverageModel policyPublicCoverageModel) throws Exception;
//
//	Result countPolicyPublicCoverage(PolicyPublicCoverageModel policyPublicCoverageModel) throws Exception;
	
	Boolean deletePolicyPublicCoverage(String policyPublicCoverageId) throws Exception;
}