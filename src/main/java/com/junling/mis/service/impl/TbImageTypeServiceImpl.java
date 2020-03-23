package com.junling.mis.service.impl;

import com.junling.mis.mapper.tbImageTypeEntityMapper;
import com.junling.mis.model.tbImageTypeEntity;
import com.junling.mis.service.TbImageTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("tbImageTypeService")
public class TbImageTypeServiceImpl implements TbImageTypeService {

	private final static Logger LOG = LoggerFactory.getLogger(TbImageTypeServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.tbImageTypeEntityMapper tbImageTypeEntityMapper;

	@Override
	public Boolean addTbImageType(tbImageTypeEntity tbImageTypeEntity) throws Exception {
		return tbImageTypeEntityMapper.insert(tbImageTypeEntity)>0;
	}

	@Override
	public Boolean updateTbImageType(tbImageTypeEntity tbImageTypeEntity) throws Exception {
		return tbImageTypeEntityMapper.updateByPrimaryKey(tbImageTypeEntity)>0;
	}

	@Override
	public tbImageTypeEntity findDetailTbImageType(String docTypeCode) throws Exception {
		return tbImageTypeEntityMapper.selectByPrimaryKey(docTypeCode);
	}

	@Override
	public Boolean deleteTbImageType(String docTypeCode) throws Exception {
		return tbImageTypeEntityMapper.deleteByPrimaryKey(docTypeCode)>0;
	}

//	@Override
//	public Result addTbImageType(TbImageTypeModel tbImageTypeModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateTbImageType(TbImageTypeModel tbImageTypeModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailTbImageType(TbImageTypeModel tbImageTypeModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbImageType(TbImageTypeModel tbImageTypeModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbImageTypePage(TbImageTypeModel tbImageTypeModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countTbImageType(TbImageTypeModel tbImageTypeModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteTbImageType(TbImageTypeModel tbImageTypeModel) throws Exception{
//		return null;
//	}

}