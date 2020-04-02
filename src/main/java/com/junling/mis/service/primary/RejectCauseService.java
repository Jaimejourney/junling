package com.junling.mis.service.primary;

import com.junling.mis.model.primary.rejectCause;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface RejectCauseService {

	Boolean addRejectCause(rejectCause rejectCause) throws Exception;

	Boolean updateRejectCause(rejectCause rejectCause) throws Exception;

	rejectCause findDetailRejectCause(String rejectCauseCode) throws Exception;
	
//	Result listRejectCause(RejectCauseModel rejectCauseModel) throws Exception;
//
//    Result listRejectCausePage(RejectCauseModel rejectCauseModel) throws Exception;
//
//	Result countRejectCause(RejectCauseModel rejectCauseModel) throws Exception;
	
	Boolean deleteRejectCause(String rejectCauseCode) throws Exception;
}