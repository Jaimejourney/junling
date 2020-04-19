package com.junling.mis.service.primary;

import com.junling.mis.model.primary.PolicyInfo;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface PolicyInfoService {

	Boolean addPolicyInfo(PolicyInfo policyInfo) throws Exception;

	Boolean updatePolicyInfo(PolicyInfo policyInfo) throws Exception;

	PolicyInfo findDetailPolicyInfo(String policyInfoId) throws Exception;
	
//	Result listPolicyInfo(PolicyInfoModel policyInfoModel) throws Exception;
//
//    Result listPolicyInfoPage(PolicyInfoModel policyInfoModel) throws Exception;
//
//	Result countPolicyInfo(PolicyInfoModel policyInfoModel) throws Exception;
	
	Boolean deletePolicyInfo(String policyInfoId) throws Exception;
}