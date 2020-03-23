package com.junling.mis.service;

import com.junling.mis.model.policyPublicCoverageEntity;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface PolicyPublicCoverageService {

	Boolean addPolicyPublicCoverage(policyPublicCoverageEntity policyPublicCoverageEntity) throws Exception;

	Boolean updatePolicyPublicCoverage(policyPublicCoverageEntity policyPublicCoverageEntity) throws Exception;

	policyPublicCoverageEntity findDetailPolicyPublicCoverage(String policyPublicCoverageId) throws Exception;
	
//	Result listPolicyPublicCoverage(PolicyPublicCoverageModel policyPublicCoverageModel) throws Exception;
//
//    Result listPolicyPublicCoveragePage(PolicyPublicCoverageModel policyPublicCoverageModel) throws Exception;
//
//	Result countPolicyPublicCoverage(PolicyPublicCoverageModel policyPublicCoverageModel) throws Exception;
	
	Boolean deletePolicyPublicCoverage(String policyPublicCoverageId) throws Exception;
}