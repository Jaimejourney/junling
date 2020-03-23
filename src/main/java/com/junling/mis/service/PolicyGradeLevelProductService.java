package com.junling.mis.service;

import com.junling.mis.model.policyGradeLevelProductEntity;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface PolicyGradeLevelProductService {

	Boolean addPolicyGradeLevelProduct(policyGradeLevelProductEntity policyGradeLevelProductEntity) throws Exception;

	Boolean updatePolicyGradeLevelProduct(policyGradeLevelProductEntity policyGradeLevelProductEntity) throws Exception;

	policyGradeLevelProductEntity findDetailPolicyGradeLevelProduct(String pglProductId) throws Exception;
	
//	Result listPolicyGradeLevelProduct(PolicyGradeLevelProductModel policyGradeLevelProductModel) throws Exception;
//
//    Result listPolicyGradeLevelProductPage(PolicyGradeLevelProductModel policyGradeLevelProductModel) throws Exception;
//
//	Result countPolicyGradeLevelProduct(PolicyGradeLevelProductModel policyGradeLevelProductModel) throws Exception;
	
	Boolean deletePolicyGradeLevelProduct(String pglProductId) throws Exception;
}