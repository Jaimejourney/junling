package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.ProductDutyMapper;
import com.junling.mis.model.primary.ProductDuty;
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
	private ProductDutyMapper productDutyMapper;

	@Override
	public Boolean addProductDuty(ProductDuty productDuty) throws Exception {
		return productDutyMapper.insert(productDuty)>0;
	}

	@Override
	public Boolean updateProductDuty(ProductDuty productDuty) throws Exception {
		return productDutyMapper.updateByPrimaryKey(productDuty)>0;
	}

	@Override
	public ProductDuty findDetailProductDuty(String productDutyId) throws Exception {
		return productDutyMapper.selectByPrimaryKey(productDutyId);
	}

	@Override
	public Boolean deleteProductDuty(String productDutyId) throws Exception {
		return productDutyMapper.deleteByPrimaryKey(productDutyId)>0;
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