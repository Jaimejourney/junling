package com.junling.mis.service.primary;

import com.junling.mis.model.primary.pglProductDutyClaimRateEntity;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface PglProductDutyClaimRateService {
	Boolean addPglProductDutyClaimRate(pglProductDutyClaimRateEntity pglProductDutyClaimRateEntity) throws Exception;

	Boolean updatePglProductDutyClaimRate(pglProductDutyClaimRateEntity pglProductDutyClaimRateEntity) throws Exception;

	pglProductDutyClaimRateEntity findDetailPglProductDutyClaimRate(String pglpdClaimRateId) throws Exception;
	
//	Result listPglProductDutyClaimRate(PglProductDutyClaimRateModel pglProductDutyClaimRateModel) throws Exception;
//
//    Result listPglProductDutyClaimRatePage(PglProductDutyClaimRateModel pglProductDutyClaimRateModel) throws Exception;
//
//	Result countPglProductDutyClaimRate(PglProductDutyClaimRateModel pglProductDutyClaimRateModel) throws Exception;
	
	Boolean deletePglProductDutyClaimRate(String pglpdClaimRateId) throws Exception;
}