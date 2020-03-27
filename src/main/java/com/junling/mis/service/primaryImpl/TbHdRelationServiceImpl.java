package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.tbHdRelationEntity;
import com.junling.mis.service.primary.TbHdRelationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("tbHdRelationService")
public class TbHdRelationServiceImpl implements TbHdRelationService {

	private final static Logger LOG = LoggerFactory.getLogger(TbHdRelationServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.primary.tbHdRelationEntityMapper tbHdRelationEntityMapper;

	@Override
	public Boolean addTbHdRelation(tbHdRelationEntity tbHdRelationEntity) throws Exception {
		return tbHdRelationEntityMapper.insert(tbHdRelationEntity)>0;
	}

	@Override
	public Boolean updateTbHdRelation(tbHdRelationEntity tbHdRelationEntity) throws Exception {
		return tbHdRelationEntityMapper.updateByPrimaryKey(tbHdRelationEntity)>0;
	}

	@Override
	public tbHdRelationEntity findDetailTbHdRelation(String hospitalDepartmentId) throws Exception {
		return tbHdRelationEntityMapper.selectByPrimaryKey(hospitalDepartmentId);
	}

	@Override
	public Boolean deleteTbHdRelation(String hospitalDepartmentId) throws Exception {
		return tbHdRelationEntityMapper.deleteByPrimaryKey(hospitalDepartmentId)>0;
	}
//
//	@Override
//	public Result addTbHdRelation(TbHdRelationModel tbHdRelationModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateTbHdRelation(TbHdRelationModel tbHdRelationModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailTbHdRelation(TbHdRelationModel tbHdRelationModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbHdRelation(TbHdRelationModel tbHdRelationModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbHdRelationPage(TbHdRelationModel tbHdRelationModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countTbHdRelation(TbHdRelationModel tbHdRelationModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteTbHdRelation(TbHdRelationModel tbHdRelationModel) throws Exception{
//		return null;
//	}

}