package com.junling.mis.service.primary;

import com.junling.mis.model.primary.claimDoc;
import com.junling.mis.model.primary.claimDocKey;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface ClaimDocService {

	Boolean addClaimDoc(claimDoc claimDoc) throws Exception;

	Boolean updateClaimDoc(claimDoc claimDoc) throws Exception;

	claimDoc findDetailClaimDoc(claimDocKey key) throws Exception;

//	Result listClaimDoc(ClaimDocModel claimDocModel) throws Exception;
//
//    Result listClaimDocPage(ClaimDocModel claimDocModel) throws Exception;
//
//	Result countClaimDoc(ClaimDocModel claimDocModel) throws Exception;
	
	Boolean deleteClaimDoc(claimDocKey key) throws Exception;
}