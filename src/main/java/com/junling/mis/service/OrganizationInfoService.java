package com.junling.mis.service;

import com.junling.mis.model.organizationInfoEntity;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface OrganizationInfoService {

	Boolean addOrganizationInfo(organizationInfoEntity organizationInfoModel) throws Exception;

	Boolean updateOrganizationInfo(organizationInfoEntity organizationInfoEntity) throws Exception;

	organizationInfoEntity findDetailOrganizationInfo(String organizationId) throws Exception;
	
//	Result listOrganizationInfo(OrganizationInfoModel organizationInfoModel) throws Exception;
//
//    Result listOrganizationInfoPage(OrganizationInfoModel organizationInfoModel) throws Exception;
//
//	Result countOrganizationInfo(OrganizationInfoModel organizationInfoModel) throws Exception;
	
	Boolean deleteOrganizationInfo(String organizationId) throws Exception;
}