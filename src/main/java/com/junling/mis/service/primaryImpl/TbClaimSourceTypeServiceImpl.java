package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.TbClaimSourceTypeMapper;
import com.junling.mis.model.primary.TbClaimSourceType;
import com.junling.mis.service.primary.TbClaimSourceTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("tbClaimSourceTypeService")
public class TbClaimSourceTypeServiceImpl implements TbClaimSourceTypeService {

	private final static Logger LOG = LoggerFactory.getLogger(TbClaimSourceTypeServiceImpl.class);

	@Resource
	private TbClaimSourceTypeMapper tbClaimSourceTypeMapper;

	@Override
	public Boolean addTbClaimSourceType(TbClaimSourceType tbClaimSourceType) throws Exception {
		return tbClaimSourceTypeMapper.insert(tbClaimSourceType)>0;
	}

	@Override
	public Boolean updateTbClaimSourceType(TbClaimSourceType tbClaimSourceType) throws Exception {
		return tbClaimSourceTypeMapper.updateByPrimaryKey(tbClaimSourceType)>0;
	}

	@Override
	public TbClaimSourceType findDetailTbClaimSourceType(String statusCode) throws Exception {
		return tbClaimSourceTypeMapper.selectByPrimaryKey(statusCode);
	}

	@Override
	public Boolean deleteTbClaimSourceType(String statusCode) throws Exception {
		return tbClaimSourceTypeMapper.deleteByPrimaryKey(statusCode)>0;
	}

//	@Override
//	public Result addTbClaimSourceType(TbClaimSourceTypeModel tbClaimSourceTypeModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateTbClaimSourceType(TbClaimSourceTypeModel tbClaimSourceTypeModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailTbClaimSourceType(TbClaimSourceTypeModel tbClaimSourceTypeModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbClaimSourceType(TbClaimSourceTypeModel tbClaimSourceTypeModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbClaimSourceTypePage(TbClaimSourceTypeModel tbClaimSourceTypeModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countTbClaimSourceType(TbClaimSourceTypeModel tbClaimSourceTypeModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteTbClaimSourceType(TbClaimSourceTypeModel tbClaimSourceTypeModel) throws Exception{
//		return null;
//	}

}