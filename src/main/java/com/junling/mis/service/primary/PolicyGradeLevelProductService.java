package com.junling.mis.service.primary;

import com.junling.mis.model.primary.PolicyGradeLevelPro;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface PolicyGradeLevelProductService {

	Boolean addPolicyGradeLevelProduct(PolicyGradeLevelPro policyGradeLevelProduct) throws Exception;

	Boolean updatePolicyGradeLevelProduct(PolicyGradeLevelPro policyGradeLevelProduct) throws Exception;

	PolicyGradeLevelPro findDetailPolicyGradeLevelProduct(String pglProductId) throws Exception;
	
//	Result listPolicyGradeLevelProduct(PolicyGradeLevelProductModel policyGradeLevelProductModel) throws Exception;
//
//    Result listPolicyGradeLevelProductPage(PolicyGradeLevelProductModel policyGradeLevelProductModel) throws Exception;
//
//	Result countPolicyGradeLevelProduct(PolicyGradeLevelProductModel policyGradeLevelProductModel) throws Exception;
	
	Boolean deletePolicyGradeLevelProduct(String pglProductId) throws Exception;
}