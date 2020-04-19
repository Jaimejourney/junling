package com.junling.mis.service.primary;

import com.junling.mis.model.primary.PolicyInsured;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface PolicyInsuredService {

	Boolean addPolicyInsured(PolicyInsured policyInsured) throws Exception;

	Boolean updatePolicyInsured(PolicyInsured policyInsured) throws Exception;

	PolicyInsured findDetailPolicyInsured(String policyInsuredId) throws Exception;
	
//	Result listPolicyInsured(PolicyInsuredModel policyInsuredModel) throws Exception;
//
//    Result listPolicyInsuredPage(PolicyInsuredModel policyInsuredModel) throws Exception;
//
//	Result countPolicyInsured(PolicyInsuredModel policyInsuredModel) throws Exception;
	
	Boolean deletePolicyInsured(String policyInsuredId) throws Exception;
}