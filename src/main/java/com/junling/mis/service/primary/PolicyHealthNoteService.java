package com.junling.mis.service.primary;

import com.junling.mis.model.primary.policyHealthNote;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface PolicyHealthNoteService {

	Boolean addPolicyHealthNote(policyHealthNote policyHealthNote) throws Exception;

	Boolean updatePolicyHealthNote(policyHealthNote policyHealthNote) throws Exception;

	policyHealthNote findDetailPolicyHealthNote(String healthNoteId) throws Exception;
	
//	Result listPolicyHealthNote(PolicyHealthNoteModel policyHealthNoteModel) throws Exception;
//
//    Result listPolicyHealthNotePage(PolicyHealthNoteModel policyHealthNoteModel) throws Exception;
//
//	Result countPolicyHealthNote(PolicyHealthNoteModel policyHealthNoteModel) throws Exception;
	
	Boolean deletePolicyHealthNote(String healthNoteId) throws Exception;
}