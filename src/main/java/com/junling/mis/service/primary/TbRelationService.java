package com.junling.mis.service.primary;

import com.junling.mis.model.primary.tbRelationEntity;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbRelationService {

	Boolean addTbRelation(tbRelationEntity tbRelationEntity) throws Exception;

	Boolean updateTbRelation(tbRelationEntity tbRelationEntity) throws Exception;

	tbRelationEntity findDetailTbRelation(String relationCode) throws Exception;
	
//	Result listTbRelation(TbRelationModel tbRelationModel) throws Exception;
//
//    Result listTbRelationPage(TbRelationModel tbRelationModel) throws Exception;
//
//	Result countTbRelation(TbRelationModel tbRelationModel) throws Exception;
//
	Boolean deleteTbRelation(String relationCode) throws Exception;
}