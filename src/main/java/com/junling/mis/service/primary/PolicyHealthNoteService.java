package com.junling.mis.service.primary;

import com.junling.mis.model.primary.PolicyHealthNote;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface PolicyHealthNoteService {

	Boolean addPolicyHealthNote(PolicyHealthNote policyHealthNote) throws Exception;

	Boolean updatePolicyHealthNote(PolicyHealthNote policyHealthNote) throws Exception;

	PolicyHealthNote findDetailPolicyHealthNote(String healthNoteId) throws Exception;
	
//	Result listPolicyHealthNote(PolicyHealthNoteModel policyHealthNoteModel) throws Exception;
//
//    Result listPolicyHealthNotePage(PolicyHealthNoteModel policyHealthNoteModel) throws Exception;
//
//	Result countPolicyHealthNote(PolicyHealthNoteModel policyHealthNoteModel) throws Exception;
	
	Boolean deletePolicyHealthNote(String healthNoteId) throws Exception;
}