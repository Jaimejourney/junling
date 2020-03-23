package com.junling.mis.service.impl;

import com.junling.mis.mapper.customerInfoEntityMapper;
import com.junling.mis.model.customerInfoEntity;
import com.junling.mis.service.CustomerInfoService;
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
	private customerInfoEntityMapper customerInfoEntityMapper;


	@Override
	public Boolean addCustomerInfo(customerInfoEntity customerInfoEntity) throws Exception {
		return customerInfoEntityMapper.insert(customerInfoEntity) > 0;
	}

	@Override
	public Boolean updateCustomerInfo(customerInfoEntity customerInfoEntity) throws Exception {
		return customerInfoEntityMapper.updateByPrimaryKey(customerInfoEntity) > 0;
	}

	@Override
	public customerInfoEntity findDetailCustomerInfo(String customerNo) throws Exception {
		return customerInfoEntityMapper.selectByPrimaryKey(customerNo);
	}

	@Override
	public Boolean deleteCustomerInfo(String customerNo) throws Exception {
		return customerInfoEntityMapper.deleteByPrimaryKey(customerNo) > 0;
	}
}