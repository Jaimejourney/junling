package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.policyGradeLevelEntity;
import com.junling.mis.service.primary.PolicyGradeLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/policyGradeLevel")
public class PolicyGradeLevelController {

    @Autowired
    private PolicyGradeLevelService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addPolicyGradeLevel(@RequestBody policyGradeLevelEntity policyGradeLevelEntity) throws Exception {
        if(service.addPolicyGradeLevel(policyGradeLevelEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updatePolicyGradeLevel(@RequestBody policyGradeLevelEntity policyGradeLevelEntity) throws Exception {
        if(service.updatePolicyGradeLevel(policyGradeLevelEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{policyGradeLevelId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<policyGradeLevelEntity> searchPolicyGradeLevel(@PathVariable("policyGradeLevelId") String policyGradeLevelId) throws Exception {
        policyGradeLevelEntity policyGradeLevelEntity = service.findDetailPolicyGradeLevel(policyGradeLevelId);
        MakeResult<policyGradeLevelEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(policyGradeLevelEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(policyGradeLevelEntity);
    }

    @RequestMapping(value = "/delete/{policyGradeLevelId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delPolicyGradeLevel(@PathVariable("policyGradeLevelId") String policyGradeLevelId) throws Exception {
        if(service.deletePolicyGradeLevel(policyGradeLevelId)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
