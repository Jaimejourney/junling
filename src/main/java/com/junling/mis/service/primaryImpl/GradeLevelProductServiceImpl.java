package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.gradeLevelProduct;
import com.junling.mis.service.primary.GradeLevelProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("gradeLevelProductService")
public class GradeLevelProductServiceImpl implements GradeLevelProductService {

	private final static Logger LOG = LoggerFactory.getLogger(GradeLevelProductServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.primary.gradeLevelProductMapper gradeLevelProductMapper;

	@Override
	public Boolean addGradeLevelProduct(gradeLevelProduct gradeLevelProduct) throws Exception {
		return gradeLevelProductMapper.insert(gradeLevelProduct) > 0;
	}

	@Override
	public Boolean updateGradeLevelProduct(gradeLevelProduct gradeLevelProduct) throws Exception {
		return gradeLevelProductMapper.updateByPrimaryKey(gradeLevelProduct) > 0;
	}

	@Override
	public gradeLevelProduct findDetailGradeLevelProduct(String gradeLevelProductId) throws Exception {
		return gradeLevelProductMapper.selectByPrimaryKey(gradeLevelProductId);
	}

	@Override
	public Boolean deleteGradeLevelProduct(String gradeLevelProductId) throws Exception {
		return gradeLevelProductMapper.deleteByPrimaryKey(gradeLevelProductId) > 0;
	}

//	@Override
//	public Result addGradeLevelProduct(GradeLevelProductModel gradeLevelProductModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateGradeLevelProduct(GradeLevelProductModel gradeLevelProductModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailGradeLevelProduct(GradeLevelProductModel gradeLevelProductModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listGradeLevelProduct(GradeLevelProductModel gradeLevelProductModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listGradeLevelProductPage(GradeLevelProductModel gradeLevelProductModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countGradeLevelProduct(GradeLevelProductModel gradeLevelProductModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteGradeLevelProduct(GradeLevelProductModel gradeLevelProductModel) throws Exception{
//		return null;
//	}

}