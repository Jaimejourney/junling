package com.junling.mis.service.primary;

import com.junling.mis.model.primary.gradeLevelProduct;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface GradeLevelProductService {

	Boolean addGradeLevelProduct(gradeLevelProduct gradeLevelProduct) throws Exception;

	Boolean updateGradeLevelProduct(gradeLevelProduct gradeLevelProduct) throws Exception;

	gradeLevelProduct findDetailGradeLevelProduct(String gradeLevelProductId) throws Exception;
//
//	Result listGradeLevelProduct(GradeLevelProductModel gradeLevelProductModel) throws Exception;
//
//    Result listGradeLevelProductPage(GradeLevelProductModel gradeLevelProductModel) throws Exception;
//
//	Result countGradeLevelProduct(GradeLevelProductModel gradeLevelProductModel) throws Exception;
	
	Boolean deleteGradeLevelProduct(String gradeLevelProductId) throws Exception;
}