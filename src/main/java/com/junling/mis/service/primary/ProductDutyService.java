package com.junling.mis.service.primary;

import com.junling.mis.model.primary.productDuty;


/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface ProductDutyService {

	Boolean addProductDuty(productDuty productDuty) throws Exception;

	Boolean updateProductDuty(productDuty productDuty) throws Exception;

	productDuty findDetailProductDuty(String productDutyId) throws Exception;
	
//	Result listProductDuty(ProductDutyModel productDutyModel) throws Exception;
//
//    Result listProductDutyPage(ProductDutyModel productDutyModel) throws Exception;
//
//	Result countProductDuty(ProductDutyModel productDutyModel) throws Exception;
	
	Boolean deleteProductDuty(String productDutyId) throws Exception;
}