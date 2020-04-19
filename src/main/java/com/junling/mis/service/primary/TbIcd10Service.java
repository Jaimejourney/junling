package com.junling.mis.service.primary;

import com.junling.mis.model.primary.TbIcd10;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbIcd10Service {

	Boolean addTbIcd10(TbIcd10 tbIcd10) throws Exception;

	Boolean updateTbIcd10(TbIcd10 tbIcd10) throws Exception;

	TbIcd10 findDetailTbIcd10(String icd) throws Exception;
	
//	Result listTbIcd10(TbIcd10Model tbIcd10Model) throws Exception;
//
//    Result listTbIcd10Page(TbIcd10Model tbIcd10Model) throws Exception;
//
//	Result countTbIcd10(TbIcd10Model tbIcd10Model) throws Exception;
	
	Boolean deleteTbIcd10(String icd) throws Exception;
}