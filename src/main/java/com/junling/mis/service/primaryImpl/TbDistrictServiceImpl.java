package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.tbDistrictEntity;
import com.junling.mis.service.primary.TbDistrictService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("tbDistrictService")
public class TbDistrictServiceImpl implements TbDistrictService {

	private final static Logger LOG = LoggerFactory.getLogger(TbDistrictServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.primary.tbDistrictEntityMapper tbDistrictEntityMapper;

	@Override
	public Boolean addTbDistrict(tbDistrictEntity tbDistrictEntity) throws Exception {
		return tbDistrictEntityMapper.insert(tbDistrictEntity)>0;
	}


//	@Override
//	public Result addTbDistrict(TbDistrictModel tbDistrictModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateTbDistrict(TbDistrictModel tbDistrictModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailTbDistrict(TbDistrictModel tbDistrictModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbDistrict(TbDistrictModel tbDistrictModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbDistrictPage(TbDistrictModel tbDistrictModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countTbDistrict(TbDistrictModel tbDistrictModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteTbDistrict(TbDistrictModel tbDistrictModel) throws Exception{
//		return null;
//	}

}