package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.TbRelationMapper;
import com.junling.mis.model.primary.TbRelation;
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
	private TbRelationMapper tbRelationMapper;

	@Override
	public Boolean addTbRelation(TbRelation tbRelation) throws Exception {
		return tbRelationMapper.insert(tbRelation)>0;
	}

	@Override
	public Boolean updateTbRelation(TbRelation tbRelation) throws Exception {
		return tbRelationMapper.updateByPrimaryKey(tbRelation)>0;
	}

	@Override
	public TbRelation findDetailTbRelation(String relationCode) throws Exception {
		return tbRelationMapper.selectByPrimaryKey(relationCode);
	}

	@Override
	public Boolean deleteTbRelation(String relationCode) throws Exception {
		return tbRelationMapper.deleteByPrimaryKey(relationCode)>0;
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