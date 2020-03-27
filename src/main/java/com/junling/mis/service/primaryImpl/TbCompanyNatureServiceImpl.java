package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.tbCompanyNatureEntity;
import com.junling.mis.service.primary.TbCompanyNatureService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("tbCompanyNatureService")
public class TbCompanyNatureServiceImpl implements TbCompanyNatureService {

	private final static Logger LOG = LoggerFactory.getLogger(TbCompanyNatureServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.primary.tbCompanyNatureEntityMapper tbCompanyNatureEntityMapper;

	@Override
	public Boolean addTbCompanyNature(tbCompanyNatureEntity tbCompanyNatureEntity) throws Exception {
		return tbCompanyNatureEntityMapper.insert(tbCompanyNatureEntity)>0;
	}

	@Override
	public Boolean updateTbCompanyNature(tbCompanyNatureEntity tbCompanyNatureEntity) throws Exception {
		return tbCompanyNatureEntityMapper.updateByPrimaryKey(tbCompanyNatureEntity)>0;
	}

	@Override
	public tbCompanyNatureEntity findDetailTbCompanyNature(String tbCompanyCode) throws Exception {
		return tbCompanyNatureEntityMapper.selectByPrimaryKey(tbCompanyCode);
	}

	@Override
	public Boolean deleteTbCompanyNature(String tbCompanyCode) throws Exception {
		return tbCompanyNatureEntityMapper.deleteByPrimaryKey(tbCompanyCode)>0;
	}

//	@Override
//	public Result addTbCompanyNature(TbCompanyNatureModel tbCompanyNatureModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateTbCompanyNature(TbCompanyNatureModel tbCompanyNatureModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailTbCompanyNature(TbCompanyNatureModel tbCompanyNatureModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbCompanyNature(TbCompanyNatureModel tbCompanyNatureModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbCompanyNaturePage(TbCompanyNatureModel tbCompanyNatureModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countTbCompanyNature(TbCompanyNatureModel tbCompanyNatureModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteTbCompanyNature(TbCompanyNatureModel tbCompanyNatureModel) throws Exception{
//		return null;
//	}

}