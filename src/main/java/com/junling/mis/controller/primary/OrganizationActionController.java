package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.organizationAction;
import com.junling.mis.service.primary.OrganizationActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/organizationAction")
public class OrganizationActionController {

    @Autowired
    private OrganizationActionService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addOrganizationAction(@RequestBody organizationAction organizationAction) throws Exception {
        if(service.addOrganizationAction(organizationAction)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateOrganizationAction(@RequestBody organizationAction organizationAction) throws Exception {
        if(service.updateOrganizationAction(organizationAction)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{organizationActionId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<organizationAction> searchOrganizationAction(@PathVariable("organizationActionId") String organizationActionId) throws Exception {
        organizationAction organizationAction = service.findDetailOrganizationAction(organizationActionId);
        MakeResult<organizationAction> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(organizationAction == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(organizationAction);
    }

    @RequestMapping(value = "/delete/{organizationActionId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delOrganizationAction(@PathVariable("organizationActionId") String organizationActionId) throws Exception {
        if(service.deleteOrganizationAction(organizationActionId)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
