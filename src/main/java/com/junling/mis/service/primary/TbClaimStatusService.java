package com.junling.mis.service.primary;

import com.junling.mis.model.primary.tbClaimStatus;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbClaimStatusService {

	Boolean addTbClaimStatus(tbClaimStatus tbClaimStatus) throws Exception;

	Boolean updateTbClaimStatus(tbClaimStatus tbClaimStatus) throws Exception;

	tbClaimStatus findDetailTbClaimStatus(String statusCode) throws Exception;

//	Result listTbClaimStatus(TbClaimStatusModel tbClaimStatusModel) throws Exception;
//
//    Result listTbClaimStatusPage(TbClaimStatusModel tbClaimStatusModel) throws Exception;
//
//	Result countTbClaimStatus(TbClaimStatusModel tbClaimStatusModel) throws Exception;

	Boolean deleteTbClaimStatus(String statusCode) throws Exception;
}