package com.junling.mis.service.primary;

import com.junling.mis.model.primary.claimInfoEntity;
import com.junling.mis.model.primary.clauseInfoEntity;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface ClauseInfoService {

	Boolean addClauseInfo(clauseInfoEntity clauseInfoEntity) throws Exception;

	Boolean updateClauseInfo(clauseInfoEntity clauseInfoEntity) throws Exception;

	clauseInfoEntity findDetailClauseInfo(String clauseId) throws Exception;

//	Result listClauseInfo(ClauseInfoModel clauseInfoModel) throws Exception;
//
//    Result listClauseInfoPage(ClauseInfoModel clauseInfoModel) throws Exception;
//
//	Result countClauseInfo(ClauseInfoModel clauseInfoModel) throws Exception;
	
	Boolean deleteClauseInfo(String clauseId) throws Exception;
}