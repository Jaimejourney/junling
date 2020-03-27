package com.junling.mis.service.primary;

import com.junling.mis.model.primary.customerActionEntity;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface CustomerActionService {

	Boolean addCustomerAction(customerActionEntity customerActionEntity) throws Exception;

	Boolean updateCustomerAction(customerActionEntity customerActionEntity) throws Exception;

	customerActionEntity findDetailCustomerAction(String customerActionId) throws Exception;
	
//	Result listCustomerAction(CustomerActionModel customerActionModel) throws Exception;
//
//    Result listCustomerActionPage(CustomerActionModel customerActionModel) throws Exception;
//
//	Result countCustomerAction(CustomerActionModel customerActionModel) throws Exception;
	
	Boolean deleteCustomerAction(String customerActionId) throws Exception;
}