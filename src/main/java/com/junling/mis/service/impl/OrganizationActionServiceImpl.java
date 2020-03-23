package com.junling.mis.service.impl;

import com.junling.mis.mapper.organizationActionEntityMapper;
import com.junling.mis.model.organizationActionEntity;
import com.junling.mis.service.OrganizationActionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("organizationActionService")
public class OrganizationActionServiceImpl implements OrganizationActionService {

	private final static Logger LOG = LoggerFactory.getLogger(OrganizationActionServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.organizationActionEntityMapper organizationActionEntityMapper;

	@Override
	public Boolean addOrganizationAction(organizationActionEntity organizationActionEntity) throws Exception {
		return organizationActionEntityMapper.insert(organizationActionEntity) > 0;
	}

	@Override
	public Boolean updateOrganizationAction(organizationActionEntity organizationActionEntity) throws Exception {
		return organizationActionEntityMapper.updateByPrimaryKey(organizationActionEntity) > 0;
	}

	@Override
	public organizationActionEntity findDetailOrganizationAction(String organizationActionId) throws Exception {
		return organizationActionEntityMapper.selectByPrimaryKey(organizationActionId);
	}

	@Override
	public Boolean deleteOrganizationAction(String organizationActionId) throws Exception {
		return organizationActionEntityMapper.deleteByPrimaryKey(organizationActionId) > 0;
	}

//	@Override
//	public Result addOrganizationAction(OrganizationActionModel organizationActionModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateOrganizationAction(OrganizationActionModel organizationActionModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailOrganizationAction(OrganizationActionModel organizationActionModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listOrganizationAction(OrganizationActionModel organizationActionModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listOrganizationActionPage(OrganizationActionModel organizationActionModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countOrganizationAction(OrganizationActionModel organizationActionModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteOrganizationAction(OrganizationActionModel organizationActionModel) throws Exception{
//		return null;
//	}

}