package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.tbClaimResult;
import com.junling.mis.service.primary.TbClaimResultService;
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
	private com.junling.mis.mapper.primary.tbClaimResultMapper tbClaimResultMapper;

	@Override
	public Boolean addTbClaimResult(tbClaimResult tbClaimResult) throws Exception {
		return tbClaimResultMapper.insert(tbClaimResult)>0;
	}

	@Override
	public Boolean updateTbClaimResult(tbClaimResult tbClaimResult) throws Exception {
		return tbClaimResultMapper.updateByPrimaryKey(tbClaimResult)>0;
	}

	@Override
	public tbClaimResult findDetailTbClaimResult(String resultCode) throws Exception {
		return tbClaimResultMapper.selectByPrimaryKey(resultCode);
	}

	@Override
	public Boolean deleteTbClaimResult(String resultCode) throws Exception {
		return tbClaimResultMapper.deleteByPrimaryKey(resultCode)>0;
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