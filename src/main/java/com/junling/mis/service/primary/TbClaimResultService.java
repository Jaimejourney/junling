package com.junling.mis.service.primary;

import com.junling.mis.model.primary.tbClaimResultEntity;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbClaimResultService {

	Boolean addTbClaimResult(tbClaimResultEntity tbClaimResultEntity) throws Exception;

	Boolean updateTbClaimResult(tbClaimResultEntity tbClaimResultEntity) throws Exception;

	tbClaimResultEntity findDetailTbClaimResult(String resultCode) throws Exception;

//	Result listTbClaimResult(TbClaimResultModel tbClaimResultModel) throws Exception;
//
//    Result listTbClaimResultPage(TbClaimResultModel tbClaimResultModel) throws Exception;
//
//	Result countTbClaimResult(TbClaimResultModel tbClaimResultModel) throws Exception;
	
	Boolean deleteTbClaimResult(String resultCode) throws Exception;
}