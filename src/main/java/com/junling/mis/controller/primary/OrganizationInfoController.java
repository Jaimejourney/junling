package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.OrganizationInfo;
import com.junling.mis.service.primary.OrganizationInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/organizationInfo")
public class OrganizationInfoController {

    @Autowired
    private OrganizationInfoService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addOrganizationInfo(@RequestBody OrganizationInfo organizationInfo) throws Exception {
        if(service.addOrganizationInfo(organizationInfo)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateOrganizationInfo(@RequestBody OrganizationInfo organizationInfo) throws Exception {
        if(service.updateOrganizationInfo(organizationInfo)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{organizationId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<OrganizationInfo> searchOrganizationInfo(@PathVariable("organizationId") String organizationId) throws Exception {
        OrganizationInfo organizationInfo = service.findDetailOrganizationInfo(organizationId);
        MakeResult<OrganizationInfo> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(organizationInfo == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(organizationInfo);
    }

    @RequestMapping(value = "/delete/{organizationId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delOrganizationInfo(@PathVariable("organizationId") String organizationId) throws Exception {
        if(service.deleteOrganizationInfo(organizationId)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
