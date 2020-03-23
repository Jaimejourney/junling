package com.junling.mis.service;

import com.junling.mis.model.policyInfoEntity;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface PolicyInfoService {

	Boolean addPolicyInfo(policyInfoEntity policyInfoEntity) throws Exception;

	Boolean updatePolicyInfo(policyInfoEntity policyInfoEntity) throws Exception;

	policyInfoEntity findDetailPolicyInfo(String policyInfoId) throws Exception;
	
//	Result listPolicyInfo(PolicyInfoModel policyInfoModel) throws Exception;
//
//    Result listPolicyInfoPage(PolicyInfoModel policyInfoModel) throws Exception;
//
//	Result countPolicyInfo(PolicyInfoModel policyInfoModel) throws Exception;
	
	Boolean deletePolicyInfo(String policyInfoId) throws Exception;
}