package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.tbRelationEntity;
import com.junling.mis.service.primary.TbRelationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("tbRelationService")
public class TbRelationServiceImpl implements TbRelationService {

	private final static Logger LOG = LoggerFactory.getLogger(TbRelationServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.primary.tbRelationEntityMapper tbRelationEntityMapper;

	@Override
	public Boolean addTbRelation(tbRelationEntity tbRelationEntity) throws Exception {
		return tbRelationEntityMapper.insert(tbRelationEntity)>0;
	}

	@Override
	public Boolean updateTbRelation(tbRelationEntity tbRelationEntity) throws Exception {
		return tbRelationEntityMapper.updateByPrimaryKey(tbRelationEntity)>0;
	}

	@Override
	public tbRelationEntity findDetailTbRelation(String relationCode) throws Exception {
		return tbRelationEntityMapper.selectByPrimaryKey(relationCode);
	}

	@Override
	public Boolean deleteTbRelation(String relationCode) throws Exception {
		return tbRelationEntityMapper.deleteByPrimaryKey(relationCode)>0;
	}

//	@Override
//	public Result addTbRelation(TbRelationModel tbRelationModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateTbRelation(TbRelationModel tbRelationModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailTbRelation(TbRelationModel tbRelationModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbRelation(TbRelationModel tbRelationModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbRelationPage(TbRelationModel tbRelationModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countTbRelation(TbRelationModel tbRelationModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteTbRelation(TbRelationModel tbRelationModel) throws Exception{
//		return null;
//	}

}