package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.customerActionMapper;
import com.junling.mis.model.primary.customerAction;
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
	private customerActionMapper customerActionMapper;


	@Override
	public Boolean addCustomerAction(customerAction customerAction) throws Exception {
		return customerActionMapper.insert(customerAction) > 0;
	}

	@Override
	public Boolean updateCustomerAction(customerAction customerAction) throws Exception {
		return customerActionMapper.updateByPrimaryKey(customerAction) > 0;
	}

	@Override
	public customerAction findDetailCustomerAction(String customerActionId) throws Exception {
		return customerActionMapper.selectByPrimaryKey(customerActionId);
	}

	@Override
	public Boolean deleteCustomerAction(String customerActionId) throws Exception {
		return customerActionMapper.deleteByPrimaryKey(customerActionId) > 0;
	}
}