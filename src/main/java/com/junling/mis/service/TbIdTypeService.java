package com.junling.mis.service;

import com.junling.mis.model.tbIdTypeEntity;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbIdTypeService {

	Boolean addTbIdType(tbIdTypeEntity tbIdTypeEntity) throws Exception;

	Boolean updateTbIdType(tbIdTypeEntity tbIdTypeEntity) throws Exception;

	tbIdTypeEntity findDetailTbIdType(String idTypeCode) throws Exception;

//	Result listTbIdType(TbIdTypeModel tbIdTypeModel) throws Exception;
//
//    Result listTbIdTypePage(TbIdTypeModel tbIdTypeModel) throws Exception;
//
//	Result countTbIdType(TbIdTypeModel tbIdTypeModel) throws Exception;
	
	Boolean deleteTbIdType(String idTypeCode) throws Exception;
}