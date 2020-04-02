package com.junling.mis.service.primary;

import com.junling.mis.model.primary.tbHdRelation;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbHdRelationService {

	Boolean addTbHdRelation(tbHdRelation tbHdRelationEntity) throws Exception;

	Boolean updateTbHdRelation(tbHdRelation tbHdRelationEntity) throws Exception;

	tbHdRelation findDetailTbHdRelation(String hospitalDepartmentId) throws Exception;

//	Result listTbHdRelation(TbHdRelationModel tbHdRelationModel) throws Exception;
//
//    Result listTbHdRelationPage(TbHdRelationModel tbHdRelationModel) throws Exception;
//
//	Result countTbHdRelation(TbHdRelationModel tbHdRelationModel) throws Exception;

	Boolean deleteTbHdRelation(String hospitalDepartmentId) throws Exception;
}