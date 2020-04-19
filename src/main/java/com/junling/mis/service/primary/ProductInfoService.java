package com.junling.mis.service.primary;

import com.junling.mis.model.primary.ProductInfo;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface ProductInfoService {

	Boolean addProductInfo(ProductInfo productInfo) throws Exception;

	Boolean updateProductInfo(ProductInfo productInfo) throws Exception;

	ProductInfo findDetailProductInfo(String productId) throws Exception;
	
//	Result listProductInfo(ProductInfoModel productInfoModel) throws Exception;
//
//    Result listProductInfoPage(ProductInfoModel productInfoModel) throws Exception;
//
//	Result countProductInfo(ProductInfoModel productInfoModel) throws Exception;
	
	Boolean deleteProductInfo(String productId) throws Exception;
}