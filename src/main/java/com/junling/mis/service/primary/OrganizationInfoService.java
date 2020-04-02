package com.junling.mis.service.primary;

import com.junling.mis.model.primary.organizationInfo;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface OrganizationInfoService {

	Boolean addOrganizationInfo(organizationInfo organizationInfoModel) throws Exception;

	Boolean updateOrganizationInfo(organizationInfo organizationInfo) throws Exception;

	organizationInfo findDetailOrganizationInfo(String organizationId) throws Exception;
	
//	Result listOrganizationInfo(OrganizationInfoModel organizationInfoModel) throws Exception;
//
//    Result listOrganizationInfoPage(OrganizationInfoModel organizationInfoModel) throws Exception;
//
//	Result countOrganizationInfo(OrganizationInfoModel organizationInfoModel) throws Exception;
	
	Boolean deleteOrganizationInfo(String organizationId) throws Exception;
}