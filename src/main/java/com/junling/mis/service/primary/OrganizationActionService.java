package com.junling.mis.service.primary;

import com.junling.mis.model.primary.OrganizationAction;




/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface OrganizationActionService {

	Boolean addOrganizationAction(OrganizationAction organizationAction) throws Exception;

	Boolean updateOrganizationAction(OrganizationAction organizationAction) throws Exception;

	OrganizationAction findDetailOrganizationAction(String organizationActionId) throws Exception;
	
//	Result listOrganizationAction(OrganizationActionModel organizationActionModel) throws Exception;
//
//    Result listOrganizationActionPage(OrganizationActionModel organizationActionModel) throws Exception;
//
//	Result countOrganizationAction(OrganizationActionModel organizationActionModel) throws Exception;
	
	Boolean deleteOrganizationAction(String organizationActionId) throws Exception;
}