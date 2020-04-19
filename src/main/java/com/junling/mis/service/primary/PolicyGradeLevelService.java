package com.junling.mis.service.primary;

import com.junling.mis.model.primary.PolicyGradeLevel;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface PolicyGradeLevelService {

	Boolean addPolicyGradeLevel(PolicyGradeLevel policyGradeLevel) throws Exception;

	Boolean updatePolicyGradeLevel(PolicyGradeLevel policyGradeLevel) throws Exception;

	PolicyGradeLevel findDetailPolicyGradeLevel(String policyGradeLevelId) throws Exception;
	
//	Result listPolicyGradeLevel(PolicyGradeLevelModel policyGradeLevelModel) throws Exception;
//
//    Result listPolicyGradeLevelPage(PolicyGradeLevelModel policyGradeLevelModel) throws Exception;
//
//	Result countPolicyGradeLevel(PolicyGradeLevelModel policyGradeLevelModel) throws Exception;
	
	Boolean deletePolicyGradeLevel(String policyGradeLevelId) throws Exception;
}