package com.junling.mis.service.primary;

import com.junling.mis.model.primary.dutyInfoEntity;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface DutyInfoService {

	Boolean addDutyInfo(dutyInfoEntity dutyInfoEntity) throws Exception;

	Boolean updateDutyInfo(dutyInfoEntity dutyInfoEntity) throws Exception;
//
	dutyInfoEntity findDetailDutyInfo(String dutyId) throws Exception;
//
//	Result listDutyInfo(DutyInfoModel dutyInfoModel) throws Exception;
//
//    Result listDutyInfoPage(DutyInfoModel dutyInfoModel) throws Exception;
//
//	Result countDutyInfo(DutyInfoModel dutyInfoModel) throws Exception;
//
	Boolean deleteDutyInfo(String dutyId) throws Exception;
}