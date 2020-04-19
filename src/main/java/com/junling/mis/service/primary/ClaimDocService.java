package com.junling.mis.service.primary;

import com.junling.mis.model.primary.ClaimDoc;
import com.junling.mis.model.primary.ClaimDocKey;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface ClaimDocService {

	Boolean addClaimDoc(ClaimDoc claimDoc) throws Exception;

	Boolean updateClaimDoc(ClaimDoc claimDoc) throws Exception;

	ClaimDoc findDetailClaimDoc(ClaimDocKey key) throws Exception;

//	Result listClaimDoc(ClaimDocModel claimDocModel) throws Exception;
//
//    Result listClaimDocPage(ClaimDocModel claimDocModel) throws Exception;
//
//	Result countClaimDoc(ClaimDocModel claimDocModel) throws Exception;
	
	Boolean deleteClaimDoc(ClaimDocKey key) throws Exception;
}