package com.junling.mis.controller.primary;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.clauseInfo;
import com.junling.mis.service.primary.ClauseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/clauseInfo")
public class ClauseInfoController {

    @Autowired
    private ClauseInfoService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addClauseInfo(@RequestBody clauseInfo clauseInfo) throws Exception {
        if(service.addClauseInfo(clauseInfo)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateClauseInfo(@RequestBody clauseInfo clauseInfo) throws Exception {
        if(service.updateClauseInfo(clauseInfo)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{clauseId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<clauseInfo> searchClauseInfo(@PathVariable("clauseId") String clauseId) throws Exception {
        clauseInfo clauseInfo = service.findDetailClauseInfo(clauseId);
        MakeResult<clauseInfo> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(clauseInfo == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(clauseInfo);
    }

    @RequestMapping(value = "/delete/{clauseId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delClauseInfo(@PathVariable("clauseId") String clauseId) throws Exception {
        if(service.deleteClauseInfo(clauseId)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
