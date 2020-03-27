package com.junling.mis.service.primary;

import com.junling.mis.model.primary.pglProductSubDutyClaimRateEntity;


/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface PglProductSubDutyClaimRateService {

	Boolean addPglProductSubDutyClaimRate(pglProductSubDutyClaimRateEntity pglProductSubDutyClaimRateEntity) throws Exception;

	Boolean updatePglProductSubDutyClaimRate(pglProductSubDutyClaimRateEntity pglProductSubDutyClaimRateEntity) throws Exception;

	pglProductSubDutyClaimRateEntity findDetailPglProductSubDutyClaimRate(String pglpsdClaimRateId) throws Exception;
	
//	Result listPglProductSubDutyClaimRate(PglProductSubDutyClaimRateModel pglProductSubDutyClaimRateModel) throws Exception;
//
//    Result listPglProductSubDutyClaimRatePage(PglProductSubDutyClaimRateModel pglProductSubDutyClaimRateModel) throws Exception;
//
//	Result countPglProductSubDutyClaimRate(PglProductSubDutyClaimRateModel pglProductSubDutyClaimRateModel) throws Exception;
	
	Boolean deletePglProductSubDutyClaimRate(String pglpsdClaimRateId) throws Exception;
}