package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.ProductInfoMapper;
import com.junling.mis.model.primary.ProductInfo;
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
	private ProductInfoMapper productInfoMapper;

	@Override
	public Boolean addProductInfo(ProductInfo productInfo) throws Exception {
		return productInfoMapper.insert(productInfo)>0;
	}

	@Override
	public Boolean updateProductInfo(ProductInfo productInfo) throws Exception {
		return productInfoMapper.updateByPrimaryKey(productInfo) >0;
	}

	@Override
	public ProductInfo findDetailProductInfo(String productId) throws Exception {
		return productInfoMapper.selectByPrimaryKey(productId);
	}

	@Override
	public Boolean deleteProductInfo(String productId) throws Exception {
		return productInfoMapper.deleteByPrimaryKey(productId)>0;
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