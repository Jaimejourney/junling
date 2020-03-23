package com.junling.mis.service;

import com.junling.mis.model.policyShareCoverageEntity;
import com.junling.mis.model.policyShareCoverageEntityKey;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface PolicyShareCoverageService {

	Boolean addPolicyShareCoverage(policyShareCoverageEntity policyShareCoverageEntity) throws Exception;

	Boolean updatePolicyShareCoverage(policyShareCoverageEntity policyShareCoverageEntity) throws Exception;

	policyShareCoverageEntity findDetailPolicyShareCoverage(policyShareCoverageEntityKey key) throws Exception;
	
//	Result listPolicyShareCoverage(PolicyShareCoverageModel policyShareCoverageModel) throws Exception;
//
//    Result listPolicyShareCoveragePage(PolicyShareCoverageModel policyShareCoverageModel) throws Exception;
//
//	Result countPolicyShareCoverage(PolicyShareCoverageModel policyShareCoverageModel) throws Exception;
	
	Boolean deletePolicyShareCoverage(policyShareCoverageEntityKey key) throws Exception;
}