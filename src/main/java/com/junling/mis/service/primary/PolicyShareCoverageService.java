package com.junling.mis.service.primary;

import com.junling.mis.model.primary.policyShareCoverage;
import com.junling.mis.model.primary.policyShareCoverageKey;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface PolicyShareCoverageService {

	Boolean addPolicyShareCoverage(policyShareCoverage policyShareCoverage) throws Exception;

	Boolean updatePolicyShareCoverage(policyShareCoverage policyShareCoverage) throws Exception;

	policyShareCoverage findDetailPolicyShareCoverage(policyShareCoverageKey key) throws Exception;
	
//	Result listPolicyShareCoverage(PolicyShareCoverageModel policyShareCoverageModel) throws Exception;
//
//    Result listPolicyShareCoveragePage(PolicyShareCoverageModel policyShareCoverageModel) throws Exception;
//
//	Result countPolicyShareCoverage(PolicyShareCoverageModel policyShareCoverageModel) throws Exception;
	
	Boolean deletePolicyShareCoverage(policyShareCoverageKey key) throws Exception;
}