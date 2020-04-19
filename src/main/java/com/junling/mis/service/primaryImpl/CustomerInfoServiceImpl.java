package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.CustomerInfoMapper;
import com.junling.mis.model.primary.CustomerInfo;
import com.junling.mis.service.primary.CustomerInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("customerInfoService")
public class CustomerInfoServiceImpl implements CustomerInfoService {

	private final static Logger LOG = LoggerFactory.getLogger(CustomerInfoServiceImpl.class);

	@Resource
	private CustomerInfoMapper customerInfoMapper;


	@Override
	public Boolean addCustomerInfo(CustomerInfo customerInfo) throws Exception {
		return customerInfoMapper.insert(customerInfo) > 0;
	}

	@Override
	public Boolean updateCustomerInfo(CustomerInfo customerInfo) throws Exception {
		return customerInfoMapper.updateByPrimaryKey(customerInfo) > 0;
	}

	@Override
	public CustomerInfo findDetailCustomerInfo(String customerNo) throws Exception {
		return customerInfoMapper.selectByPrimaryKey(customerNo);
	}

	@Override
	public Boolean deleteCustomerInfo(String customerNo) throws Exception {
		return customerInfoMapper.deleteByPrimaryKey(customerNo) > 0;
	}
}