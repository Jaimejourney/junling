package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.TbReportTypeMapper;
import com.junling.mis.model.primary.TbReportType;
import com.junling.mis.service.primary.TbReportTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("tbReportTypeService")
public class TbReportTypeServiceImpl implements TbReportTypeService {

	private final static Logger LOG = LoggerFactory.getLogger(TbReportTypeServiceImpl.class);

	@Resource
	private TbReportTypeMapper tbReportTypeMapper;

	@Override
	public Boolean addTbReportType(TbReportType tbReportType) throws Exception {
		return tbReportTypeMapper.insert(tbReportType)>0;
	}

	@Override
	public Boolean updateTbReportType(TbReportType tbReportType) throws Exception {
		return tbReportTypeMapper.updateByPrimaryKey(tbReportType)>0;
	}

	@Override
	public TbReportType findDetailTbReportType(String reportTypeCode) throws Exception {
		return tbReportTypeMapper.selectByPrimaryKey(reportTypeCode);
	}

	@Override
	public Boolean deleteTbReportType(String reportTypeCode) throws Exception {
		return tbReportTypeMapper.deleteByPrimaryKey(reportTypeCode)>0;
	}

//	@Override
//	public Result addTbReportType(TbReportTypeModel tbReportTypeModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateTbReportType(TbReportTypeModel tbReportTypeModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailTbReportType(TbReportTypeModel tbReportTypeModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbReportType(TbReportTypeModel tbReportTypeModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbReportTypePage(TbReportTypeModel tbReportTypeModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countTbReportType(TbReportTypeModel tbReportTypeModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteTbReportType(TbReportTypeModel tbReportTypeModel) throws Exception{
//		return null;
//	}

}