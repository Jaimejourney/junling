package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.tbImageType;
import com.junling.mis.service.primary.TbImageTypeService;
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
	private com.junling.mis.mapper.primary.tbImageTypeMapper tbImageTypeMapper;

	@Override
	public Boolean addTbImageType(tbImageType tbImageType) throws Exception {
		return tbImageTypeMapper.insert(tbImageType)>0;
	}

	@Override
	public Boolean updateTbImageType(tbImageType tbImageType) throws Exception {
		return tbImageTypeMapper.updateByPrimaryKey(tbImageType)>0;
	}

	@Override
	public tbImageType findDetailTbImageType(String docTypeCode) throws Exception {
		return tbImageTypeMapper.selectByPrimaryKey(docTypeCode);
	}

	@Override
	public Boolean deleteTbImageType(String docTypeCode) throws Exception {
		return tbImageTypeMapper.deleteByPrimaryKey(docTypeCode)>0;
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