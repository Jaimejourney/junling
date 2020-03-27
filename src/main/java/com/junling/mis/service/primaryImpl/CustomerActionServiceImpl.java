package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.customerActionEntityMapper;
import com.junling.mis.model.primary.customerActionEntity;
import com.junling.mis.service.primary.CustomerActionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("customerActionService")
public class CustomerActionServiceImpl implements CustomerActionService {

	private final static Logger LOG = LoggerFactory.getLogger(CustomerActionServiceImpl.class);

	@Resource
	private customerActionEntityMapper customerActionEntityMapper;


	@Override
	public Boolean addCustomerAction(customerActionEntity customerActionEntity) throws Exception {
		return customerActionEntityMapper.insert(customerActionEntity) > 0;
	}

	@Override
	public Boolean updateCustomerAction(customerActionEntity customerActionEntity) throws Exception {
		return customerActionEntityMapper.updateByPrimaryKey(customerActionEntity) > 0;
	}

	@Override
	public customerActionEntity findDetailCustomerAction(String customerActionId) throws Exception {
		return customerActionEntityMapper.selectByPrimaryKey(customerActionId);
	}

	@Override
	public Boolean deleteCustomerAction(String customerActionId) throws Exception {
		return customerActionEntityMapper.deleteByPrimaryKey(customerActionId) > 0;
	}
}