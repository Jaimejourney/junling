package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.RejectCauseMapper;
import com.junling.mis.model.primary.RejectCause;
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
	private RejectCauseMapper rejectCauseMapper;

	@Override
	public Boolean addRejectCause(RejectCause rejectCause) throws Exception {
		return rejectCauseMapper.insert(rejectCause)>0;
	}

	@Override
	public Boolean updateRejectCause(RejectCause rejectCause) throws Exception {
		return rejectCauseMapper.updateByPrimaryKey(rejectCause)>0;
	}

	@Override
	public RejectCause findDetailRejectCause(String rejectCauseCode) throws Exception {
		return rejectCauseMapper.selectByPrimaryKey(rejectCauseCode);
	}

	@Override
	public Boolean deleteRejectCause(String rejectCauseCode) throws Exception {
		return rejectCauseMapper.deleteByPrimaryKey(rejectCauseCode)>0;
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