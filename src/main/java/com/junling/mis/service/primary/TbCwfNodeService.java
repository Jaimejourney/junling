package com.junling.mis.service.primary;

import com.junling.mis.model.primary.tbCwfNode;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbCwfNodeService {

	Boolean addTbCwfNode(tbCwfNode tbCwfNode) throws Exception;

	Boolean updateTbCwfNode(tbCwfNode tbCwfNode) throws Exception;

	tbCwfNode findDetailTbCwfNode(String cwfNode) throws Exception;
	
//	Result listTbCwfNode(TbCwfNodeModel tbCwfNodeModel) throws Exception;
//
//    Result listTbCwfNodePage(TbCwfNodeModel tbCwfNodeModel) throws Exception;
//
//	Result countTbCwfNode(TbCwfNodeModel tbCwfNodeModel) throws Exception;
//
	Boolean deleteTbCwfNode(String cwfNode) throws Exception;
}