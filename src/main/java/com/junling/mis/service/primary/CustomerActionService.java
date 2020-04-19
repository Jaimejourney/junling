package com.junling.mis.service.primary;

import com.junling.mis.model.primary.CustomerAction;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface CustomerActionService {

	Boolean addCustomerAction(CustomerAction customerAction) throws Exception;

	Boolean updateCustomerAction(CustomerAction customerAction) throws Exception;

	CustomerAction findDetailCustomerAction(String customerActionId) throws Exception;
	
//	Result listCustomerAction(CustomerActionModel customerActionModel) throws Exception;
//
//    Result listCustomerActionPage(CustomerActionModel customerActionModel) throws Exception;
//
//	Result countCustomerAction(CustomerActionModel customerActionModel) throws Exception;
	
	Boolean deleteCustomerAction(String customerActionId) throws Exception;
}