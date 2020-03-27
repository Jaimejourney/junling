package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.productInfoEntity;
import com.junling.mis.service.primary.ProductInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("productInfoService")
public class ProductInfoServiceImpl implements ProductInfoService {

	private final static Logger LOG = LoggerFactory.getLogger(ProductInfoServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.primary.productInfoEntityMapper productInfoEntityMapper;

	@Override
	public Boolean addProductInfo(productInfoEntity productInfoEntity) throws Exception {
		return productInfoEntityMapper.insert(productInfoEntity)>0;
	}

	@Override
	public Boolean updateProductInfo(productInfoEntity productInfoEntity) throws Exception {
		return productInfoEntityMapper.updateByPrimaryKey(productInfoEntity) >0;
	}

	@Override
	public productInfoEntity findDetailProductInfo(String productId) throws Exception {
		return productInfoEntityMapper.selectByPrimaryKey(productId);
	}

	@Override
	public Boolean deleteProductInfo(String productId) throws Exception {
		return productInfoEntityMapper.deleteByPrimaryKey(productId)>0;
	}

//	@Override
//	public Result addProductInfo(ProductInfoModel productInfoModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateProductInfo(ProductInfoModel productInfoModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailProductInfo(ProductInfoModel productInfoModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listProductInfo(ProductInfoModel productInfoModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listProductInfoPage(ProductInfoModel productInfoModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countProductInfo(ProductInfoModel productInfoModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteProductInfo(ProductInfoModel productInfoModel) throws Exception{
//		return null;
//	}

}