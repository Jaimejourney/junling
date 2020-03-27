package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.tbClaimStatusEntity;
import com.junling.mis.service.primary.TbClaimStatusService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("tbClaimStatusService")
public class TbClaimStatusServiceImpl implements TbClaimStatusService {

	private final static Logger LOG = LoggerFactory.getLogger(TbClaimStatusServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.primary.tbClaimStatusEntityMapper tbClaimStatusEntityMapper;

	@Override
	public Boolean addTbClaimStatus(tbClaimStatusEntity tbClaimStatusEntity) throws Exception {
		return tbClaimStatusEntityMapper.insert(tbClaimStatusEntity)>0;
	}

	@Override
	public Boolean updateTbClaimStatus(tbClaimStatusEntity tbClaimStatusEntity) throws Exception {
		return tbClaimStatusEntityMapper.updateByPrimaryKey(tbClaimStatusEntity)>0;
	}

	@Override
	public tbClaimStatusEntity findDetailTbClaimStatus(String statusCode) throws Exception {
		return tbClaimStatusEntityMapper.selectByPrimaryKey(statusCode);
	}

	@Override
	public Boolean deleteTbClaimStatus(String statusCode) throws Exception {
		return tbClaimStatusEntityMapper.deleteByPrimaryKey(statusCode)>0;
	}

//	@Override
//	public Result addTbClaimStatus(TbClaimStatusModel tbClaimStatusModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateTbClaimStatus(TbClaimStatusModel tbClaimStatusModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailTbClaimStatus(TbClaimStatusModel tbClaimStatusModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbClaimStatus(TbClaimStatusModel tbClaimStatusModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbClaimStatusPage(TbClaimStatusModel tbClaimStatusModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countTbClaimStatus(TbClaimStatusModel tbClaimStatusModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteTbClaimStatus(TbClaimStatusModel tbClaimStatusModel) throws Exception{
//		return null;
//	}

}