package com.junling.mis.service;

import com.junling.mis.model.policyGradeLevelEntity;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface PolicyGradeLevelService {

	Boolean addPolicyGradeLevel(policyGradeLevelEntity policyGradeLevelEntity) throws Exception;

	Boolean updatePolicyGradeLevel(policyGradeLevelEntity policyGradeLevelEntity) throws Exception;

	policyGradeLevelEntity findDetailPolicyGradeLevel(String policyGradeLevelId) throws Exception;
	
//	Result listPolicyGradeLevel(PolicyGradeLevelModel policyGradeLevelModel) throws Exception;
//
//    Result listPolicyGradeLevelPage(PolicyGradeLevelModel policyGradeLevelModel) throws Exception;
//
//	Result countPolicyGradeLevel(PolicyGradeLevelModel policyGradeLevelModel) throws Exception;
	
	Boolean deletePolicyGradeLevel(String policyGradeLevelId) throws Exception;
}