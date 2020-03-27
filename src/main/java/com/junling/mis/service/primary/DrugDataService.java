package com.junling.mis.service.primary;

import com.junling.mis.model.primary.drugDataEntity;


/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface DrugDataService {

	Boolean addDrugData(drugDataEntity drugDataEntity) throws Exception;

//	Result updateDrugData(DrugDataModel drugDataModel) throws Exception;
//
//	Result findDetailDrugData(DrugDataModel drugDataModel) throws Exception;
//
//	Result listDrugData(DrugDataModel drugDataModel) throws Exception;
//
//    Result listDrugDataPage(DrugDataModel drugDataModel) throws Exception;
//
//	Result countDrugData(DrugDataModel drugDataModel) throws Exception;
//
//	Result deleteDrugData(DrugDataModel drugDataModel) throws Exception;
}