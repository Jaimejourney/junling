package com.junling.mis.service;

import com.junling.mis.model.tbClaimSourceTypeEntity;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbClaimSourceTypeService {

	Boolean addTbClaimSourceType(tbClaimSourceTypeEntity tbClaimSourceTypeEntity) throws Exception;

	Boolean updateTbClaimSourceType(tbClaimSourceTypeEntity tbClaimSourceTypeEntity) throws Exception;

	tbClaimSourceTypeEntity findDetailTbClaimSourceType(String statusCode) throws Exception;
	
//	Result listTbClaimSourceType(TbClaimSourceTypeModel tbClaimSourceTypeModel) throws Exception;
//
//    Result listTbClaimSourceTypePage(TbClaimSourceTypeModel tbClaimSourceTypeModel) throws Exception;
//
//	Result countTbClaimSourceType(TbClaimSourceTypeModel tbClaimSourceTypeModel) throws Exception;
	
	Boolean deleteTbClaimSourceType(String statusCode) throws Exception;
}