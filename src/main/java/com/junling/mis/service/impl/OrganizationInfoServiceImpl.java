package com.junling.mis.service.impl;

import com.junling.mis.mapper.organizagionInfoEntityMapper;
import com.junling.mis.model.organizationInfoEntity;
import com.junling.mis.service.OrganizationInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("organizationInfoService")
public class OrganizationInfoServiceImpl implements OrganizationInfoService {

	private final static Logger LOG = LoggerFactory.getLogger(OrganizationInfoServiceImpl.class);

	@Resource
	private organizagionInfoEntityMapper organizationInfoEntityMapper;

	@Override
	public Boolean addOrganizationInfo(organizationInfoEntity organizationInfoModel) throws Exception {
		return organizationInfoEntityMapper.insert(organizationInfoModel) > 0;
	}

	@Override
	public Boolean updateOrganizationInfo(organizationInfoEntity organizationInfoEntity) throws Exception {
		return organizationInfoEntityMapper.updateByPrimaryKey(organizationInfoEntity) > 0;
	}

	@Override
	public organizationInfoEntity findDetailOrganizationInfo(String organizationId) throws Exception {
		return organizationInfoEntityMapper.selectByPrimaryKey(organizationId);
	}

	@Override
	public Boolean deleteOrganizationInfo(String organizationId) throws Exception {
		return organizationInfoEntityMapper.deleteByPrimaryKey(organizationId) > 0;
	}

//	@Override
//	public Result addOrganizationInfo(OrganizationInfoModel organizationInfoModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateOrganizationInfo(OrganizationInfoModel organizationInfoModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailOrganizationInfo(OrganizationInfoModel organizationInfoModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listOrganizationInfo(OrganizationInfoModel organizationInfoModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listOrganizationInfoPage(OrganizationInfoModel organizationInfoModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countOrganizationInfo(OrganizationInfoModel organizationInfoModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteOrganizationInfo(OrganizationInfoModel organizationInfoModel) throws Exception{
//		return null;
//	}

}