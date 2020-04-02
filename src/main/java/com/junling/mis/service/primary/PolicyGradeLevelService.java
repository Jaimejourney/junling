package com.junling.mis.service.primary;

import com.junling.mis.model.primary.policyGradeLevel;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface PolicyGradeLevelService {

	Boolean addPolicyGradeLevel(policyGradeLevel policyGradeLevel) throws Exception;

	Boolean updatePolicyGradeLevel(policyGradeLevel policyGradeLevel) throws Exception;

	policyGradeLevel findDetailPolicyGradeLevel(String policyGradeLevelId) throws Exception;
	
//	Result listPolicyGradeLevel(PolicyGradeLevelModel policyGradeLevelModel) throws Exception;
//
//    Result listPolicyGradeLevelPage(PolicyGradeLevelModel policyGradeLevelModel) throws Exception;
//
//	Result countPolicyGradeLevel(PolicyGradeLevelModel policyGradeLevelModel) throws Exception;
	
	Boolean deletePolicyGradeLevel(String policyGradeLevelId) throws Exception;
}