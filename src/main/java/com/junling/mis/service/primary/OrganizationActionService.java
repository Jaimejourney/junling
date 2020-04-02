package com.junling.mis.service.primary;

import com.junling.mis.model.primary.organizationAction;




/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface OrganizationActionService {

	Boolean addOrganizationAction(organizationAction organizationAction) throws Exception;

	Boolean updateOrganizationAction(organizationAction organizationAction) throws Exception;

	organizationAction findDetailOrganizationAction(String organizationActionId) throws Exception;
	
//	Result listOrganizationAction(OrganizationActionModel organizationActionModel) throws Exception;
//
//    Result listOrganizationActionPage(OrganizationActionModel organizationActionModel) throws Exception;
//
//	Result countOrganizationAction(OrganizationActionModel organizationActionModel) throws Exception;
	
	Boolean deleteOrganizationAction(String organizationActionId) throws Exception;
}