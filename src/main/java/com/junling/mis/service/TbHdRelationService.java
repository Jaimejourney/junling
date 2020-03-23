package com.junling.mis.service;

import com.junling.mis.model.tbHdRelationEntity;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbHdRelationService {

	Boolean addTbHdRelation(tbHdRelationEntity tbHdRelationEntity) throws Exception;

	Boolean updateTbHdRelation(tbHdRelationEntity tbHdRelationEntity) throws Exception;

	tbHdRelationEntity findDetailTbHdRelation(String hospitalDepartmentId) throws Exception;

//	Result listTbHdRelation(TbHdRelationModel tbHdRelationModel) throws Exception;
//
//    Result listTbHdRelationPage(TbHdRelationModel tbHdRelationModel) throws Exception;
//
//	Result countTbHdRelation(TbHdRelationModel tbHdRelationModel) throws Exception;

	Boolean deleteTbHdRelation(String hospitalDepartmentId) throws Exception;
}