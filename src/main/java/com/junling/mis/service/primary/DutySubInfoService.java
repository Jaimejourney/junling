package com.junling.mis.service.primary;

import com.junling.mis.model.primary.DutySubInfo;


/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface DutySubInfoService {

	Boolean addDutySubInfo(DutySubInfo dutySubInfo) throws Exception;

	Boolean updateDutySubInfo(DutySubInfo dutySubInfo) throws Exception;

	DutySubInfo findDetailDutySubInfo(String dutySubId) throws Exception;
	
//	Result listDutySubInfo(DutySubInfoModel dutySubInfoModel) throws Exception;
//
//    Result listDutySubInfoPage(DutySubInfoModel dutySubInfoModel) throws Exception;
//
//	Result countDutySubInfo(DutySubInfoModel dutySubInfoModel) throws Exception;
	
	Boolean deleteDutySubInfo(String dutySubId) throws Exception;
}