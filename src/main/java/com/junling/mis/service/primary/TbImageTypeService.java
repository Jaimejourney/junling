package com.junling.mis.service.primary;

import com.junling.mis.model.primary.tbImageTypeEntity;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbImageTypeService {

	Boolean addTbImageType(tbImageTypeEntity tbImageTypeEntity) throws Exception;

	Boolean updateTbImageType(tbImageTypeEntity tbImageTypeEntity) throws Exception;

	tbImageTypeEntity findDetailTbImageType(String docTypeCode) throws Exception;

//	Result listTbImageType(TbImageTypeModel tbImageTypeModel) throws Exception;
//
//    Result listTbImageTypePage(TbImageTypeModel tbImageTypeModel) throws Exception;
//
//	Result countTbImageType(TbImageTypeModel tbImageTypeModel) throws Exception;
//
	Boolean deleteTbImageType(String docTypeCode) throws Exception;
}