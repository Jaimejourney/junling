package com.junling.mis.service.primary;

import com.junling.mis.model.primary.OrganizationInfo;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface OrganizationInfoService {

	Boolean addOrganizationInfo(OrganizationInfo organizationInfoModel) throws Exception;

	Boolean updateOrganizationInfo(OrganizationInfo organizationInfo) throws Exception;

	OrganizationInfo findDetailOrganizationInfo(String organizationId) throws Exception;
	
//	Result listOrganizationInfo(OrganizationInfoModel organizationInfoModel) throws Exception;
//
//    Result listOrganizationInfoPage(OrganizationInfoModel organizationInfoModel) throws Exception;
//
//	Result countOrganizationInfo(OrganizationInfoModel organizationInfoModel) throws Exception;
	
	Boolean deleteOrganizationInfo(String organizationId) throws Exception;
}