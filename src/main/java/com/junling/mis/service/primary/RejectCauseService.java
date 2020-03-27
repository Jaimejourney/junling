package com.junling.mis.service.primary;

import com.junling.mis.model.primary.rejectCauseEntity;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface RejectCauseService {

	Boolean addRejectCause(rejectCauseEntity rejectCauseEntity) throws Exception;

	Boolean updateRejectCause(rejectCauseEntity rejectCauseEntity) throws Exception;

	rejectCauseEntity findDetailRejectCause(String rejectCauseCode) throws Exception;
	
//	Result listRejectCause(RejectCauseModel rejectCauseModel) throws Exception;
//
//    Result listRejectCausePage(RejectCauseModel rejectCauseModel) throws Exception;
//
//	Result countRejectCause(RejectCauseModel rejectCauseModel) throws Exception;
	
	Boolean deleteRejectCause(String rejectCauseCode) throws Exception;
}