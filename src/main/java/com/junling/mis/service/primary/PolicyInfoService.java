package com.junling.mis.service.primary;

import com.junling.mis.model.primary.policyInfo;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface PolicyInfoService {

	Boolean addPolicyInfo(policyInfo policyInfo) throws Exception;

	Boolean updatePolicyInfo(policyInfo policyInfo) throws Exception;

	policyInfo findDetailPolicyInfo(String policyInfoId) throws Exception;
	
//	Result listPolicyInfo(PolicyInfoModel policyInfoModel) throws Exception;
//
//    Result listPolicyInfoPage(PolicyInfoModel policyInfoModel) throws Exception;
//
//	Result countPolicyInfo(PolicyInfoModel policyInfoModel) throws Exception;
	
	Boolean deletePolicyInfo(String policyInfoId) throws Exception;
}