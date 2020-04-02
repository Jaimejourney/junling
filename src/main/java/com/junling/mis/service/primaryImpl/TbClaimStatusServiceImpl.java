package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.tbClaimStatus;
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
	private com.junling.mis.mapper.primary.tbClaimStatusMapper tbClaimStatusMapper;

	@Override
	public Boolean addTbClaimStatus(tbClaimStatus tbClaimStatus) throws Exception {
		return tbClaimStatusMapper.insert(tbClaimStatus)>0;
	}

	@Override
	public Boolean updateTbClaimStatus(tbClaimStatus tbClaimStatus) throws Exception {
		return tbClaimStatusMapper.updateByPrimaryKey(tbClaimStatus)>0;
	}

	@Override
	public tbClaimStatus findDetailTbClaimStatus(String statusCode) throws Exception {
		return tbClaimStatusMapper.selectByPrimaryKey(statusCode);
	}

	@Override
	public Boolean deleteTbClaimStatus(String statusCode) throws Exception {
		return tbClaimStatusMapper.deleteByPrimaryKey(statusCode)>0;
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