package com.junling.mis.service.primary;

import com.junling.mis.model.primary.TbClaimSourceType;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbClaimSourceTypeService {

	Boolean addTbClaimSourceType(TbClaimSourceType tbClaimSourceType) throws Exception;

	Boolean updateTbClaimSourceType(TbClaimSourceType tbClaimSourceType) throws Exception;

	TbClaimSourceType findDetailTbClaimSourceType(String statusCode) throws Exception;
	
//	Result listTbClaimSourceType(TbClaimSourceTypeModel tbClaimSourceTypeModel) throws Exception;
//
//    Result listTbClaimSourceTypePage(TbClaimSourceTypeModel tbClaimSourceTypeModel) throws Exception;
//
//	Result countTbClaimSourceType(TbClaimSourceTypeModel tbClaimSourceTypeModel) throws Exception;
	
	Boolean deleteTbClaimSourceType(String statusCode) throws Exception;
}