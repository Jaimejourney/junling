package com.junling.mis.service.primary;

import com.junling.mis.model.primary.policyBenefit;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface PolicyBenefitService {

	Boolean addPolicyBenefit(policyBenefit policyBenefitModel) throws Exception;

	Boolean updatePolicyBenefit(policyBenefit policyBenefit) throws Exception;

	policyBenefit findDetailPolicyBenefit(String policyBenefitId) throws Exception;
	
//	Result listPolicyBenefit(PolicyBenefitModel policyBenefitModel) throws Exception;
//
//    Result listPolicyBenefitPage(PolicyBenefitModel policyBenefitModel) throws Exception;
//
//	Result countPolicyBenefit(PolicyBenefitModel policyBenefitModel) throws Exception;
	
	Boolean deletePolicyBenefit(String policyBenefitId) throws Exception;
}