package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.tbReportTypeEntity;
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
	private com.junling.mis.mapper.primary.tbReportTypeEntityMapper tbReportTypeEntityMapper;

	@Override
	public Boolean addTbReportType(tbReportTypeEntity tbReportTypeEntity) throws Exception {
		return tbReportTypeEntityMapper.insert(tbReportTypeEntity)>0;
	}

	@Override
	public Boolean updateTbReportType(tbReportTypeEntity tbReportTypeEntity) throws Exception {
		return tbReportTypeEntityMapper.updateByPrimaryKey(tbReportTypeEntity)>0;
	}

	@Override
	public tbReportTypeEntity findDetailTbReportType(String reportTypeCode) throws Exception {
		return tbReportTypeEntityMapper.selectByPrimaryKey(reportTypeCode);
	}

	@Override
	public Boolean deleteTbReportType(String reportTypeCode) throws Exception {
		return tbReportTypeEntityMapper.deleteByPrimaryKey(reportTypeCode)>0;
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