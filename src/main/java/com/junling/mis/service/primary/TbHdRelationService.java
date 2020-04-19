package com.junling.mis.service.primary;

import com.junling.mis.model.primary.TbHdRelation;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbHdRelationService {

	Boolean addTbHdRelation(TbHdRelation tbHdRelationEntity) throws Exception;

	Boolean updateTbHdRelation(TbHdRelation tbHdRelationEntity) throws Exception;

	TbHdRelation findDetailTbHdRelation(String hospitalDepartmentId) throws Exception;

//	Result listTbHdRelation(TbHdRelationModel tbHdRelationModel) throws Exception;
//
//    Result listTbHdRelationPage(TbHdRelationModel tbHdRelationModel) throws Exception;
//
//	Result countTbHdRelation(TbHdRelationModel tbHdRelationModel) throws Exception;

	Boolean deleteTbHdRelation(String hospitalDepartmentId) throws Exception;
}