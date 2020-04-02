package com.junling.mis.service.primary;

import com.junling.mis.model.primary.claimInfo;
import com.junling.mis.model.primary.clauseInfo;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface ClauseInfoService {

	Boolean addClauseInfo(clauseInfo clauseInfo) throws Exception;

	Boolean updateClauseInfo(clauseInfo clauseInfo) throws Exception;

	clauseInfo findDetailClauseInfo(String clauseId) throws Exception;

//	Result listClauseInfo(ClauseInfoModel clauseInfoModel) throws Exception;
//
//    Result listClauseInfoPage(ClauseInfoModel clauseInfoModel) throws Exception;
//
//	Result countClauseInfo(ClauseInfoModel clauseInfoModel) throws Exception;
	
	Boolean deleteClauseInfo(String clauseId) throws Exception;
}