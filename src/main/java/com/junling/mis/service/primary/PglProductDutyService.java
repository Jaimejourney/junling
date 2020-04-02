package com.junling.mis.service.primary;

import com.junling.mis.model.primary.pglProductDuty;


/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface PglProductDutyService {

	Boolean addPglProductDuty(pglProductDuty pglProductDuty) throws Exception;

	Boolean updatePglProductDuty(pglProductDuty pglProductDuty) throws Exception;

	pglProductDuty findDetailPglProductDuty(String pglProductDutyId) throws Exception;
//
//	Result listPglProductDuty(PglProductDutyModel pglProductDutyModel) throws Exception;
//
//    Result listPglProductDutyPage(PglProductDutyModel pglProductDutyModel) throws Exception;
//
//	Result countPglProductDuty(PglProductDutyModel pglProductDutyModel) throws Exception;
	
	Boolean deletePglProductDuty(String pglProductDutyId) throws Exception;
}