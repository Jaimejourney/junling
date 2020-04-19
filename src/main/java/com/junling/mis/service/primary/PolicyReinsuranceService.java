package com.junling.mis.service.primary;

import com.junling.mis.model.primary.PolicyReinsurance;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface PolicyReinsuranceService {

	Boolean addPolicyReinsurance(PolicyReinsurance policyReinsurance) throws Exception;

	Boolean updatePolicyReinsurance(PolicyReinsurance policyReinsurance) throws Exception;

	PolicyReinsurance findDetailPolicyReinsurance(String policyReinsuranceId) throws Exception;
	
//	Result listPolicyReinsurance(PolicyReinsuranceModel policyReinsuranceModel) throws Exception;
//
//    Result listPolicyReinsurancePage(PolicyReinsuranceModel policyReinsuranceModel) throws Exception;
//
//	Result countPolicyReinsurance(PolicyReinsuranceModel policyReinsuranceModel) throws Exception;
	
	Boolean deletePolicyReinsurance(String policyReinsuranceId) throws Exception;
}