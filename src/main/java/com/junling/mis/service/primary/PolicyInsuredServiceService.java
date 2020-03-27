package com.junling.mis.service.primary;

import com.junling.mis.model.primary.policyInsuredServiceEntity;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface PolicyInsuredServiceService {

	Boolean addPolicyInsuredService(policyInsuredServiceEntity policyInsuredServiceEntity) throws Exception;

	Boolean updatePolicyInsuredService(policyInsuredServiceEntity policyInsuredServiceEntity) throws Exception;

	policyInsuredServiceEntity findDetailPolicyInsuredService(String policyInsuredServiceId) throws Exception;
	
//	Result listPolicyInsuredService(PolicyInsuredServiceModel policyInsuredServiceModel) throws Exception;
//
//    Result listPolicyInsuredServicePage(PolicyInsuredServiceModel policyInsuredServiceModel) throws Exception;
//
//	Result countPolicyInsuredService(PolicyInsuredServiceModel policyInsuredServiceModel) throws Exception;
	
	Boolean deletePolicyInsuredService(String policyInsuredServiceId) throws Exception;
}