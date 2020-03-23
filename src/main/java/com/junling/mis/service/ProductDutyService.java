package com.junling.mis.service;

import com.junling.mis.model.productDutyEntity;
import com.junling.mis.model.productDutyEntityKey;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface ProductDutyService {

	Boolean addProductDuty(productDutyEntity productDutyEntity) throws Exception;

	Boolean updateProductDuty(productDutyEntity productDutyEntity) throws Exception;

	productDutyEntity findDetailProductDuty(productDutyEntityKey key) throws Exception;
	
//	Result listProductDuty(ProductDutyModel productDutyModel) throws Exception;
//
//    Result listProductDutyPage(ProductDutyModel productDutyModel) throws Exception;
//
//	Result countProductDuty(ProductDutyModel productDutyModel) throws Exception;
	
	Boolean deleteProductDuty(productDutyEntityKey key) throws Exception;
}