package com.junling.mis.service.impl;

import com.junling.mis.mapper.tbCwfNodeEntityMapper;
import com.junling.mis.model.tbCwfNodeEntity;
import com.junling.mis.service.TbCwfNodeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("tbCwfNodeService")
public class TbCwfNodeServiceImpl implements TbCwfNodeService {

	private final static Logger LOG = LoggerFactory.getLogger(TbCwfNodeServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.tbCwfNodeEntityMapper tbCwfNodeEntityMapper;

	@Override
	public Boolean addTbCwfNode(tbCwfNodeEntity tbCwfNodeEntity) throws Exception {
		return tbCwfNodeEntityMapper.insert(tbCwfNodeEntity) > 0;
	}

	@Override
	public Boolean updateTbCwfNode(tbCwfNodeEntity tbCwfNodeEntity) throws Exception {
		return tbCwfNodeEntityMapper.updateByPrimaryKey(tbCwfNodeEntity) > 0;
	}

	@Override
	public tbCwfNodeEntity findDetailTbCwfNode(String cwfNode) throws Exception {
		return tbCwfNodeEntityMapper.selectByPrimaryKey(cwfNode);
	}

	@Override
	public Boolean deleteTbCwfNode(String cwfNode) throws Exception {
		return tbCwfNodeEntityMapper.deleteByPrimaryKey(cwfNode)>0;
	}

//	@Override
//	public Result addTbCwfNode(TbCwfNodeModel tbCwfNodeModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateTbCwfNode(TbCwfNodeModel tbCwfNodeModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailTbCwfNode(TbCwfNodeModel tbCwfNodeModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbCwfNode(TbCwfNodeModel tbCwfNodeModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbCwfNodePage(TbCwfNodeModel tbCwfNodeModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countTbCwfNode(TbCwfNodeModel tbCwfNodeModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteTbCwfNode(TbCwfNodeModel tbCwfNodeModel) throws Exception{
//		return null;
//	}

}