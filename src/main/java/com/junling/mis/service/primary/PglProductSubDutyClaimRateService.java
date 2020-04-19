package com.junling.mis.service.primary;

import com.junling.mis.model.primary.PglpsdClaimRate;


/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface PglProductSubDutyClaimRateService {

	Boolean addPglProductSubDutyClaimRate(PglpsdClaimRate pglProductSubDutyClaimRate) throws Exception;

	Boolean updatePglProductSubDutyClaimRate(PglpsdClaimRate pglProductSubDutyClaimRate) throws Exception;

	PglpsdClaimRate findDetailPglProductSubDutyClaimRate(String pglpsdClaimRateId) throws Exception;
	
//	Result listPglProductSubDutyClaimRate(PglProductSubDutyClaimRateModel pglProductSubDutyClaimRateModel) throws Exception;
//
//    Result listPglProductSubDutyClaimRatePage(PglProductSubDutyClaimRateModel pglProductSubDutyClaimRateModel) throws Exception;
//
//	Result countPglProductSubDutyClaimRate(PglProductSubDutyClaimRateModel pglProductSubDutyClaimRateModel) throws Exception;
	
	Boolean deletePglProductSubDutyClaimRate(String pglpsdClaimRateId) throws Exception;
}