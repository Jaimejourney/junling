package com.junling.mis.service.primary;

import com.junling.mis.model.primary.TbClaimResult;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbClaimResultService {

	Boolean addTbClaimResult(TbClaimResult tbClaimResult) throws Exception;

	Boolean updateTbClaimResult(TbClaimResult tbClaimResult) throws Exception;

	TbClaimResult findDetailTbClaimResult(String resultCode) throws Exception;

//	Result listTbClaimResult(TbClaimResultModel tbClaimResultModel) throws Exception;
//
//    Result listTbClaimResultPage(TbClaimResultModel tbClaimResultModel) throws Exception;
//
//	Result countTbClaimResult(TbClaimResultModel tbClaimResultModel) throws Exception;
	
	Boolean deleteTbClaimResult(String resultCode) throws Exception;
}