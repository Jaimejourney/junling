package com.junling.mis.service.primary;

import com.junling.mis.model.primary.customerAction;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface CustomerActionService {

	Boolean addCustomerAction(customerAction customerAction) throws Exception;

	Boolean updateCustomerAction(customerAction customerAction) throws Exception;

	customerAction findDetailCustomerAction(String customerActionId) throws Exception;
	
//	Result listCustomerAction(CustomerActionModel customerActionModel) throws Exception;
//
//    Result listCustomerActionPage(CustomerActionModel customerActionModel) throws Exception;
//
//	Result countCustomerAction(CustomerActionModel customerActionModel) throws Exception;
	
	Boolean deleteCustomerAction(String customerActionId) throws Exception;
}