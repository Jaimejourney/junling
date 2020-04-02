package com.junling.mis.service.primary;

import com.junling.mis.model.primary.productInfo;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface ProductInfoService {

	Boolean addProductInfo(productInfo productInfo) throws Exception;

	Boolean updateProductInfo(productInfo productInfo) throws Exception;

	productInfo findDetailProductInfo(String productId) throws Exception;
	
//	Result listProductInfo(ProductInfoModel productInfoModel) throws Exception;
//
//    Result listProductInfoPage(ProductInfoModel productInfoModel) throws Exception;
//
//	Result countProductInfo(ProductInfoModel productInfoModel) throws Exception;
	
	Boolean deleteProductInfo(String productId) throws Exception;
}