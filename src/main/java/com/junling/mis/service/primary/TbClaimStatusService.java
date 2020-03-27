package com.junling.mis.service.primary;

import com.junling.mis.model.primary.tbClaimStatusEntity;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbClaimStatusService {

	Boolean addTbClaimStatus(tbClaimStatusEntity tbClaimStatusEntity) throws Exception;

	Boolean updateTbClaimStatus(tbClaimStatusEntity tbClaimStatusEntity) throws Exception;

	tbClaimStatusEntity findDetailTbClaimStatus(String statusCode) throws Exception;

//	Result listTbClaimStatus(TbClaimStatusModel tbClaimStatusModel) throws Exception;
//
//    Result listTbClaimStatusPage(TbClaimStatusModel tbClaimStatusModel) throws Exception;
//
//	Result countTbClaimStatus(TbClaimStatusModel tbClaimStatusModel) throws Exception;

	Boolean deleteTbClaimStatus(String statusCode) throws Exception;
}