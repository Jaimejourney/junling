package com.junling.mis.service;

import com.junling.mis.model.pglProductSubDutyEntity;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface PglProductSubDutyService {

	Boolean addPglProductSubDuty(pglProductSubDutyEntity pglProductSubDutyEntity) throws Exception;

	Boolean updatePglProductSubDuty(pglProductSubDutyEntity pglProductSubDutyEntity) throws Exception;

	pglProductSubDutyEntity findDetailPglProductSubDuty(String pglProductSubDutyId) throws Exception;
	
//	Result listPglProductSubDuty(PglProductSubDutyModel pglProductSubDutyModel) throws Exception;
//
//    Result listPglProductSubDutyPage(PglProductSubDutyModel pglProductSubDutyModel) throws Exception;
//
//	Result countPglProductSubDuty(PglProductSubDutyModel pglProductSubDutyModel) throws Exception;
	
	Boolean deletePglProductSubDuty(String pglProductSubDutyId) throws Exception;
}