package com.junling.mis.service.primary;

import com.junling.mis.model.primary.TbImageType;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbImageTypeService {

	Boolean addTbImageType(TbImageType tbImageType) throws Exception;

	Boolean updateTbImageType(TbImageType tbImageType) throws Exception;

	TbImageType findDetailTbImageType(String docTypeCode) throws Exception;

//	Result listTbImageType(TbImageTypeModel tbImageTypeModel) throws Exception;
//
//    Result listTbImageTypePage(TbImageTypeModel tbImageTypeModel) throws Exception;
//
//	Result countTbImageType(TbImageTypeModel tbImageTypeModel) throws Exception;
//
	Boolean deleteTbImageType(String docTypeCode) throws Exception;
}