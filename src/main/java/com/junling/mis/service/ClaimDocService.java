package com.junling.mis.service;;

import com.junling.mis.model.claimDocEntity;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface ClaimDocService {

	Boolean addClaimDoc(claimDocEntity claimDocEntity) throws Exception;

	Boolean updateClaimDoc(claimDocEntity claimDocEntity) throws Exception;

	claimDocEntity findDetailClaimDoc(Integer docId) throws Exception;

//	Result listClaimDoc(ClaimDocModel claimDocModel) throws Exception;
//
//    Result listClaimDocPage(ClaimDocModel claimDocModel) throws Exception;
//
//	Result countClaimDoc(ClaimDocModel claimDocModel) throws Exception;
	
	Boolean deleteClaimDoc(Integer docId) throws Exception;
}