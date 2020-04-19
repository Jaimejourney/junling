package com.junling.mis.service.primary;

import com.junling.mis.model.primary.TbClaimStatus;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbClaimStatusService {

	Boolean addTbClaimStatus(TbClaimStatus tbClaimStatus) throws Exception;

	Boolean updateTbClaimStatus(TbClaimStatus tbClaimStatus) throws Exception;

	TbClaimStatus findDetailTbClaimStatus(String statusCode) throws Exception;

//	Result listTbClaimStatus(TbClaimStatusModel tbClaimStatusModel) throws Exception;
//
//    Result listTbClaimStatusPage(TbClaimStatusModel tbClaimStatusModel) throws Exception;
//
//	Result countTbClaimStatus(TbClaimStatusModel tbClaimStatusModel) throws Exception;

	Boolean deleteTbClaimStatus(String statusCode) throws Exception;
}