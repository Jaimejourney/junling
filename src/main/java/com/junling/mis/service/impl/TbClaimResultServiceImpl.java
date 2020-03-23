package com.junling.mis.service.impl;

import com.junling.mis.mapper.tbClaimResultEntityMapper;
import com.junling.mis.model.tbClaimResultEntity;
import com.junling.mis.service.TbClaimResultService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("tbClaimResultService")
public class TbClaimResultServiceImpl implements TbClaimResultService {

	private final static Logger LOG = LoggerFactory.getLogger(TbClaimResultServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.tbClaimResultEntityMapper tbClaimResultEntityMapper;

	@Override
	public Boolean addTbClaimResult(tbClaimResultEntity tbClaimResultEntity) throws Exception {
		return tbClaimResultEntityMapper.insert(tbClaimResultEntity)>0;
	}

	@Override
	public Boolean updateTbClaimResult(tbClaimResultEntity tbClaimResultEntity) throws Exception {
		return tbClaimResultEntityMapper.updateByPrimaryKey(tbClaimResultEntity)>0;
	}

	@Override
	public tbClaimResultEntity findDetailTbClaimResult(String resultCode) throws Exception {
		return tbClaimResultEntityMapper.selectByPrimaryKey(resultCode);
	}

	@Override
	public Boolean deleteTbClaimResult(String resultCode) throws Exception {
		return tbClaimResultEntityMapper.deleteByPrimaryKey(resultCode)>0;
	}
//
//	@Override
//	public Result addTbClaimResult(TbClaimResultModel tbClaimResultModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateTbClaimResult(TbClaimResultModel tbClaimResultModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailTbClaimResult(TbClaimResultModel tbClaimResultModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbClaimResult(TbClaimResultModel tbClaimResultModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbClaimResultPage(TbClaimResultModel tbClaimResultModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countTbClaimResult(TbClaimResultModel tbClaimResultModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteTbClaimResult(TbClaimResultModel tbClaimResultModel) throws Exception{
//		return null;
//	}

}