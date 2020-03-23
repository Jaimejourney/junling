package com.junling.mis.service;

import com.junling.mis.model.policyReinsuranceEntity;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface PolicyReinsuranceService {

	Boolean addPolicyReinsurance(policyReinsuranceEntity policyReinsuranceEntity) throws Exception;

	Boolean updatePolicyReinsurance(policyReinsuranceEntity policyReinsuranceEntity) throws Exception;

	policyReinsuranceEntity findDetailPolicyReinsurance(String policyReinsuranceId) throws Exception;
	
//	Result listPolicyReinsurance(PolicyReinsuranceModel policyReinsuranceModel) throws Exception;
//
//    Result listPolicyReinsurancePage(PolicyReinsuranceModel policyReinsuranceModel) throws Exception;
//
//	Result countPolicyReinsurance(PolicyReinsuranceModel policyReinsuranceModel) throws Exception;
	
	Boolean deletePolicyReinsurance(String policyReinsuranceId) throws Exception;
}