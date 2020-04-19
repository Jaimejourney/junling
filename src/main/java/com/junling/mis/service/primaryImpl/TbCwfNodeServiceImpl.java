package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.TbCwfNodeMapper;
import com.junling.mis.model.primary.TbCwfNode;
import com.junling.mis.service.primary.TbCwfNodeService;
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
	private TbCwfNodeMapper tbCwfNodeMapper;

	@Override
	public Boolean addTbCwfNode(TbCwfNode tbCwfNode) throws Exception {
		return tbCwfNodeMapper.insert(tbCwfNode) > 0;
	}

	@Override
	public Boolean updateTbCwfNode(TbCwfNode tbCwfNode) throws Exception {
		return tbCwfNodeMapper.updateByPrimaryKey(tbCwfNode) > 0;
	}

	@Override
	public TbCwfNode findDetailTbCwfNode(String cwfNode) throws Exception {
		return tbCwfNodeMapper.selectByPrimaryKey(cwfNode);
	}

	@Override
	public Boolean deleteTbCwfNode(String cwfNode) throws Exception {
		return tbCwfNodeMapper.deleteByPrimaryKey(cwfNode)>0;
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