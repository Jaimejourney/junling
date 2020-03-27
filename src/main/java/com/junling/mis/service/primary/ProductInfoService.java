package com.junling.mis.service.primary;

import com.junling.mis.model.primary.productInfoEntity;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface ProductInfoService {

	Boolean addProductInfo(productInfoEntity productInfoEntity) throws Exception;

	Boolean updateProductInfo(productInfoEntity productInfoEntity) throws Exception;

	productInfoEntity findDetailProductInfo(String productId) throws Exception;
	
//	Result listProductInfo(ProductInfoModel productInfoModel) throws Exception;
//
//    Result listProductInfoPage(ProductInfoModel productInfoModel) throws Exception;
//
//	Result countProductInfo(ProductInfoModel productInfoModel) throws Exception;
	
	Boolean deleteProductInfo(String productId) throws Exception;
}