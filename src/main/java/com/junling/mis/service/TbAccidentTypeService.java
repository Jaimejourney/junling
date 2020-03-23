package com.junling.mis.service;

import com.junling.mis.model.tbAccidentTypeEntity;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbAccidentTypeService {

	Boolean addTbAccidentType(tbAccidentTypeEntity tbAccidentTypeEntity) throws Exception;

	Boolean updateTbAccidentType(tbAccidentTypeEntity tbAccidentTypeEntity) throws Exception;

	tbAccidentTypeEntity findDetailTbAccidentType(String accidentTypeCode) throws Exception;
	
//	Result listTbAccidentType(TbAccidentTypeModel tbAccidentTypeModel) throws Exception;
//
//    Result listTbAccidentTypePage(TbAccidentTypeModel tbAccidentTypeModel) throws Exception;
//
//	Result countTbAccidentType(TbAccidentTypeModel tbAccidentTypeModel) throws Exception;
	
	Boolean deleteTbAccidentType(String accidentTypeCode) throws Exception;
}