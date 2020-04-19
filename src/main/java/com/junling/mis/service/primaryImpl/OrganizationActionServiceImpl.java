package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.OrganizationActionMapper;
import com.junling.mis.model.primary.OrganizationAction;
import com.junling.mis.service.primary.OrganizationActionService;
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
	private OrganizationActionMapper organizationActionMapper;

	@Override
	public Boolean addOrganizationAction(OrganizationAction organizationAction) throws Exception {
		return organizationActionMapper.insert(organizationAction) > 0;
	}

	@Override
	public Boolean updateOrganizationAction(OrganizationAction organizationAction) throws Exception {
		return organizationActionMapper.updateByPrimaryKey(organizationAction) > 0;
	}

	@Override
	public OrganizationAction findDetailOrganizationAction(String organizationActionId) throws Exception {
		return organizationActionMapper.selectByPrimaryKey(organizationActionId);
	}

	@Override
	public Boolean deleteOrganizationAction(String organizationActionId) throws Exception {
		return organizationActionMapper.deleteByPrimaryKey(organizationActionId) > 0;
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