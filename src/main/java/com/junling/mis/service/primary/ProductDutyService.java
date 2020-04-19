package com.junling.mis.service.primary;

import com.junling.mis.model.primary.ProductDuty;


/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface ProductDutyService {

	Boolean addProductDuty(ProductDuty productDuty) throws Exception;

	Boolean updateProductDuty(ProductDuty productDuty) throws Exception;

	ProductDuty findDetailProductDuty(String productDutyId) throws Exception;
	
//	Result listProductDuty(ProductDutyModel productDutyModel) throws Exception;
//
//    Result listProductDutyPage(ProductDutyModel productDutyModel) throws Exception;
//
//	Result countProductDuty(ProductDutyModel productDutyModel) throws Exception;
	
	Boolean deleteProductDuty(String productDutyId) throws Exception;
}