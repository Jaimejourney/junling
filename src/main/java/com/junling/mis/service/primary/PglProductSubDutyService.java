package com.junling.mis.service.primary;

import com.junling.mis.model.primary.pglProdSubDuty;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface PglProductSubDutyService {

	Boolean addPglProductSubDuty(pglProdSubDuty pglProductSubDuty) throws Exception;

	Boolean updatePglProductSubDuty(pglProdSubDuty pglProductSubDuty) throws Exception;

	pglProdSubDuty findDetailPglProductSubDuty(String pglProductSubDutyId) throws Exception;
	
//	Result listPglProductSubDuty(PglProductSubDutyModel pglProductSubDutyModel) throws Exception;
//
//    Result listPglProductSubDutyPage(PglProductSubDutyModel pglProductSubDutyModel) throws Exception;
//
//	Result countPglProductSubDuty(PglProductSubDutyModel pglProductSubDutyModel) throws Exception;
	
	Boolean deletePglProductSubDuty(String pglProductSubDutyId) throws Exception;
}