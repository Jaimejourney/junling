package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.policyHealthNote;
import com.junling.mis.service.primary.PolicyHealthNoteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("policyHealthNoteService")
public class PolicyHealthNoteServiceImpl implements PolicyHealthNoteService {

	private final static Logger LOG = LoggerFactory.getLogger(PolicyHealthNoteServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.primary.policyHealthNoteMapper policyHealthNoteMapper;

	@Override
	public Boolean addPolicyHealthNote(policyHealthNote policyHealthNote) throws Exception {
		return policyHealthNoteMapper.insert(policyHealthNote)>0;
	}

	@Override
	public Boolean updatePolicyHealthNote(policyHealthNote policyHealthNote) throws Exception {
		return policyHealthNoteMapper.updateByPrimaryKey(policyHealthNote)>0;
	}

	@Override
	public policyHealthNote findDetailPolicyHealthNote(String healthNoteId) throws Exception {
		return policyHealthNoteMapper.selectByPrimaryKey(healthNoteId);
	}

	@Override
	public Boolean deletePolicyHealthNote(String healthNoteId) throws Exception {
		return policyHealthNoteMapper.deleteByPrimaryKey(healthNoteId)>0;
	}

//	@Override
//	public Result addPolicyHealthNote(PolicyHealthNoteModel policyHealthNoteModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updatePolicyHealthNote(PolicyHealthNoteModel policyHealthNoteModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailPolicyHealthNote(PolicyHealthNoteModel policyHealthNoteModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listPolicyHealthNote(PolicyHealthNoteModel policyHealthNoteModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listPolicyHealthNotePage(PolicyHealthNoteModel policyHealthNoteModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countPolicyHealthNote(PolicyHealthNoteModel policyHealthNoteModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deletePolicyHealthNote(PolicyHealthNoteModel policyHealthNoteModel) throws Exception{
//		return null;
//	}

}