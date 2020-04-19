package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.OrganizationInfoMapper;
import com.junling.mis.model.primary.OrganizationInfo;
import com.junling.mis.service.primary.OrganizationInfoService;
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
	private OrganizationInfoMapper organizationInfoMapper;

	@Override
	public Boolean addOrganizationInfo(OrganizationInfo organizationInfoModel) throws Exception {
		return organizationInfoMapper.insert(organizationInfoModel) > 0;
	}

	@Override
	public Boolean updateOrganizationInfo(OrganizationInfo organizationInfo) throws Exception {
		return organizationInfoMapper.updateByPrimaryKey(organizationInfo) > 0;
	}

	@Override
	public OrganizationInfo findDetailOrganizationInfo(String organizationId) throws Exception {
		return organizationInfoMapper.selectByPrimaryKey(organizationId);
	}

	@Override
	public Boolean deleteOrganizationInfo(String organizationId) throws Exception {
		return organizationInfoMapper.deleteByPrimaryKey(organizationId) > 0;
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