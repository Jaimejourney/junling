package com.junling.mis.service.primary;

import com.junling.mis.model.primary.PolicyShareCoverage;
import com.junling.mis.model.primary.PolicyShareCoverageKey;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface PolicyShareCoverageService {

	Boolean addPolicyShareCoverage(PolicyShareCoverage policyShareCoverage) throws Exception;

	Boolean updatePolicyShareCoverage(PolicyShareCoverage policyShareCoverage) throws Exception;

	PolicyShareCoverage findDetailPolicyShareCoverage(PolicyShareCoverageKey key) throws Exception;
	
//	Result listPolicyShareCoverage(PolicyShareCoverageModel policyShareCoverageModel) throws Exception;
//
//    Result listPolicyShareCoveragePage(PolicyShareCoverageModel policyShareCoverageModel) throws Exception;
//
//	Result countPolicyShareCoverage(PolicyShareCoverageModel policyShareCoverageModel) throws Exception;
	
	Boolean deletePolicyShareCoverage(PolicyShareCoverageKey key) throws Exception;
}