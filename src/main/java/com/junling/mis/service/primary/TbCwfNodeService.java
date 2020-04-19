package com.junling.mis.service.primary;

import com.junling.mis.model.primary.TbCwfNode;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbCwfNodeService {

	Boolean addTbCwfNode(TbCwfNode tbCwfNode) throws Exception;

	Boolean updateTbCwfNode(TbCwfNode tbCwfNode) throws Exception;

	TbCwfNode findDetailTbCwfNode(String cwfNode) throws Exception;
	
//	Result listTbCwfNode(TbCwfNodeModel tbCwfNodeModel) throws Exception;
//
//    Result listTbCwfNodePage(TbCwfNodeModel tbCwfNodeModel) throws Exception;
//
//	Result countTbCwfNode(TbCwfNodeModel tbCwfNodeModel) throws Exception;
//
	Boolean deleteTbCwfNode(String cwfNode) throws Exception;
}