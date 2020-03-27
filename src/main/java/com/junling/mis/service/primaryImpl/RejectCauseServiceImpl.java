package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.rejectCauseEntity;
import com.junling.mis.service.primary.RejectCauseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("rejectCauseService")
public class RejectCauseServiceImpl implements RejectCauseService {

	private final static Logger LOG = LoggerFactory.getLogger(RejectCauseServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.primary.rejectCauseEntityMapper rejectCauseEntityMapper;

	@Override
	public Boolean addRejectCause(rejectCauseEntity rejectCauseEntity) throws Exception {
		return rejectCauseEntityMapper.insert(rejectCauseEntity)>0;
	}

	@Override
	public Boolean updateRejectCause(rejectCauseEntity rejectCauseEntity) throws Exception {
		return rejectCauseEntityMapper.updateByPrimaryKey(rejectCauseEntity)>0;
	}

	@Override
	public rejectCauseEntity findDetailRejectCause(String rejectCauseCode) throws Exception {
		return rejectCauseEntityMapper.selectByPrimaryKey(rejectCauseCode);
	}

	@Override
	public Boolean deleteRejectCause(String rejectCauseCode) throws Exception {
		return rejectCauseEntityMapper.deleteByPrimaryKey(rejectCauseCode)>0;
	}

//	@Override
//	public Result addRejectCause(RejectCauseModel rejectCauseModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateRejectCause(RejectCauseModel rejectCauseModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailRejectCause(RejectCauseModel rejectCauseModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listRejectCause(RejectCauseModel rejectCauseModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listRejectCausePage(RejectCauseModel rejectCauseModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countRejectCause(RejectCauseModel rejectCauseModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteRejectCause(RejectCauseModel rejectCauseModel) throws Exception{
//		return null;
//	}

}