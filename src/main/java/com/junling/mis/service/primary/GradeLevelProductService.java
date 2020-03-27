package com.junling.mis.service.primary;

import com.junling.mis.model.primary.gradeLevelProductEntity;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface GradeLevelProductService {

	Boolean addGradeLevelProduct(gradeLevelProductEntity gradeLevelProductEntity) throws Exception;

	Boolean updateGradeLevelProduct(gradeLevelProductEntity gradeLevelProductEntity) throws Exception;

	gradeLevelProductEntity findDetailGradeLevelProduct(String gradeLevelProductId) throws Exception;
//
//	Result listGradeLevelProduct(GradeLevelProductModel gradeLevelProductModel) throws Exception;
//
//    Result listGradeLevelProductPage(GradeLevelProductModel gradeLevelProductModel) throws Exception;
//
//	Result countGradeLevelProduct(GradeLevelProductModel gradeLevelProductModel) throws Exception;
	
	Boolean deleteGradeLevelProduct(String gradeLevelProductId) throws Exception;
}