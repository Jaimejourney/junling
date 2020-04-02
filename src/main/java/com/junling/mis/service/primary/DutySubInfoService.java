package com.junling.mis.service.primary;

import com.junling.mis.model.primary.dutySubInfo;


/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface DutySubInfoService {

	Boolean addDutySubInfo(dutySubInfo dutySubInfo) throws Exception;

	Boolean updateDutySubInfo(dutySubInfo dutySubInfo) throws Exception;

	dutySubInfo findDetailDutySubInfo(String dutySubId) throws Exception;
	
//	Result listDutySubInfo(DutySubInfoModel dutySubInfoModel) throws Exception;
//
//    Result listDutySubInfoPage(DutySubInfoModel dutySubInfoModel) throws Exception;
//
//	Result countDutySubInfo(DutySubInfoModel dutySubInfoModel) throws Exception;
	
	Boolean deleteDutySubInfo(String dutySubId) throws Exception;
}