package com.junling.mis.service.primary;

import com.junling.mis.model.primary.pglpdClaimRate;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface PglProductDutyClaimRateService {
	Boolean addPglProductDutyClaimRate(pglpdClaimRate pglProductDutyClaimRate) throws Exception;

	Boolean updatePglProductDutyClaimRate(pglpdClaimRate pglProductDutyClaimRate) throws Exception;

	pglpdClaimRate findDetailPglProductDutyClaimRate(String pglpdClaimRateId) throws Exception;
	
//	Result listPglProductDutyClaimRate(PglProductDutyClaimRateModel pglProductDutyClaimRateModel) throws Exception;
//
//    Result listPglProductDutyClaimRatePage(PglProductDutyClaimRateModel pglProductDutyClaimRateModel) throws Exception;
//
//	Result countPglProductDutyClaimRate(PglProductDutyClaimRateModel pglProductDutyClaimRateModel) throws Exception;
	
	Boolean deletePglProductDutyClaimRate(String pglpdClaimRateId) throws Exception;
}