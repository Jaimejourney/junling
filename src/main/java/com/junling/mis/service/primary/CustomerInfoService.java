package com.junling.mis.service.primary;

import com.junling.mis.model.primary.customerInfo;


/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface CustomerInfoService {

	Boolean addCustomerInfo(customerInfo customerInfo) throws Exception;

	Boolean updateCustomerInfo(customerInfo customerInfo) throws Exception;

	customerInfo findDetailCustomerInfo(String customerNo) throws Exception;
	
//	Result listCustomerInfo(CustomerInfoModel customerInfoModel) throws Exception;
//
//    Result listCustomerInfoPage(CustomerInfoModel customerInfoModel) throws Exception;
//
//	Result countCustomerInfo(CustomerInfoModel customerInfoModel) throws Exception;
	
	Boolean deleteCustomerInfo(String customerNo) throws Exception;
}