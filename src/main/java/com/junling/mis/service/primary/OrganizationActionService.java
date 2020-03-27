package com.junling.mis.service.primary;

import com.junling.mis.model.primary.organizationActionEntity;




/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface OrganizationActionService {

	Boolean addOrganizationAction(organizationActionEntity organizationActionEntity) throws Exception;

	Boolean updateOrganizationAction(organizationActionEntity organizationActionEntity) throws Exception;

	organizationActionEntity findDetailOrganizationAction(String organizationActionId) throws Exception;
	
//	Result listOrganizationAction(OrganizationActionModel organizationActionModel) throws Exception;
//
//    Result listOrganizationActionPage(OrganizationActionModel organizationActionModel) throws Exception;
//
//	Result countOrganizationAction(OrganizationActionModel organizationActionModel) throws Exception;
	
	Boolean deleteOrganizationAction(String organizationActionId) throws Exception;
}