package com.junling.mis.service.primary;

import com.junling.mis.model.primary.tbClaimSourceType;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbClaimSourceTypeService {

	Boolean addTbClaimSourceType(tbClaimSourceType tbClaimSourceType) throws Exception;

	Boolean updateTbClaimSourceType(tbClaimSourceType tbClaimSourceType) throws Exception;

	tbClaimSourceType findDetailTbClaimSourceType(String statusCode) throws Exception;
	
//	Result listTbClaimSourceType(TbClaimSourceTypeModel tbClaimSourceTypeModel) throws Exception;
//
//    Result listTbClaimSourceTypePage(TbClaimSourceTypeModel tbClaimSourceTypeModel) throws Exception;
//
//	Result countTbClaimSourceType(TbClaimSourceTypeModel tbClaimSourceTypeModel) throws Exception;
	
	Boolean deleteTbClaimSourceType(String statusCode) throws Exception;
}