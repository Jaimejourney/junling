package com.junling.mis.service;

import com.junling.mis.model.dutySubInfoEntity;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface DutySubInfoService {

	Boolean addDutySubInfo(dutySubInfoEntity dutySubInfoEntity) throws Exception;

	Boolean updateDutySubInfo(dutySubInfoEntity dutySubInfoEntity) throws Exception;

	dutySubInfoEntity findDetailDutySubInfo(String dutySubId) throws Exception;
	
//	Result listDutySubInfo(DutySubInfoModel dutySubInfoModel) throws Exception;
//
//    Result listDutySubInfoPage(DutySubInfoModel dutySubInfoModel) throws Exception;
//
//	Result countDutySubInfo(DutySubInfoModel dutySubInfoModel) throws Exception;
	
	Boolean deleteDutySubInfo(String dutySubId) throws Exception;
}