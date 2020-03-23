package com.junling.mis.service;

import com.junling.mis.model.policyInsuredEntity;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface PolicyInsuredService {

	Boolean addPolicyInsured(policyInsuredEntity policyInsuredEntity) throws Exception;

	Boolean updatePolicyInsured(policyInsuredEntity policyInsuredEntity) throws Exception;

	policyInsuredEntity findDetailPolicyInsured(String policyInsuredId) throws Exception;
	
//	Result listPolicyInsured(PolicyInsuredModel policyInsuredModel) throws Exception;
//
//    Result listPolicyInsuredPage(PolicyInsuredModel policyInsuredModel) throws Exception;
//
//	Result countPolicyInsured(PolicyInsuredModel policyInsuredModel) throws Exception;
	
	Boolean deletePolicyInsured(String policyInsuredId) throws Exception;
}