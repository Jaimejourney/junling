package com.junling.mis.service.primary;

import com.junling.mis.model.primary.TbIdType;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbIdTypeService {

	Boolean addTbIdType(TbIdType tbIdType) throws Exception;

	Boolean updateTbIdType(TbIdType tbIdType) throws Exception;

	TbIdType findDetailTbIdType(String idTypeCode) throws Exception;

//	Result listTbIdType(TbIdTypeModel tbIdTypeModel) throws Exception;
//
//    Result listTbIdTypePage(TbIdTypeModel tbIdTypeModel) throws Exception;
//
//	Result countTbIdType(TbIdTypeModel tbIdTypeModel) throws Exception;
	
	Boolean deleteTbIdType(String idTypeCode) throws Exception;
}