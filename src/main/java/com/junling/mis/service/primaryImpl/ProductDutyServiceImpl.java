package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.productDutyEntity;
import com.junling.mis.model.primary.productDutyEntityKey;
import com.junling.mis.service.primary.ProductDutyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("productDutyService")
public class ProductDutyServiceImpl implements ProductDutyService {

	private final static Logger LOG = LoggerFactory.getLogger(ProductDutyServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.primary.productDutyEntityMapper productDutyEntityMapper;

	@Override
	public Boolean addProductDuty(productDutyEntity productDutyEntity) throws Exception {
		return productDutyEntityMapper.insert(productDutyEntity)>0;
	}

	@Override
	public Boolean updateProductDuty(productDutyEntity productDutyEntity) throws Exception {
		return productDutyEntityMapper.updateByPrimaryKey(productDutyEntity)>0;
	}

	@Override
	public productDutyEntity findDetailProductDuty(productDutyEntityKey key) throws Exception {
		return productDutyEntityMapper.selectByPrimaryKey(key);
	}

	@Override
	public Boolean deleteProductDuty(productDutyEntityKey key) throws Exception {
		return productDutyEntityMapper.deleteByPrimaryKey(key)>0;
	}


//	@Override
//	public Result addProductDuty(ProductDutyModel productDutyModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateProductDuty(ProductDutyModel productDutyModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailProductDuty(ProductDutyModel productDutyModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listProductDuty(ProductDutyModel productDutyModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listProductDutyPage(ProductDutyModel productDutyModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countProductDuty(ProductDutyModel productDutyModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteProductDuty(ProductDutyModel productDutyModel) throws Exception{
//		return null;
//	}

}