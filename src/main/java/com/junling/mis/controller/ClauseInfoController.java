package com.junling.mis.controller;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.clauseInfoEntity;
import com.junling.mis.service.ClauseInfoService;
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
    public MakeResult addClauseInfo(@RequestBody clauseInfoEntity clauseInfoEntity) throws Exception {
        if(service.addClauseInfo(clauseInfoEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateClauseInfo(@RequestBody clauseInfoEntity clauseInfoEntity) throws Exception {
        if(service.updateClauseInfo(clauseInfoEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{clauseId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<clauseInfoEntity> searchClauseInfo(@PathVariable("clauseId") String clauseId) throws Exception {
        clauseInfoEntity clauseInfoEntity = service.findDetailClauseInfo(clauseId);
        MakeResult<clauseInfoEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(clauseInfoEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(clauseInfoEntity);
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
