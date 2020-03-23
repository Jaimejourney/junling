package com.junling.mis.controller;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.tbBankEntity;
import com.junling.mis.model.tbClaimResultEntity;
import com.junling.mis.service.TbBankService;
import com.junling.mis.service.TbClaimResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/tbClaimResult")
public class TbClaimResultController {

    @Autowired
    private TbClaimResultService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addTbClaimResult(@RequestBody tbClaimResultEntity tbClaimResultEntity) throws Exception {
        if(service.addTbClaimResult(tbClaimResultEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateTbClaimResult(@RequestBody tbClaimResultEntity tbClaimResultEntity) throws Exception {
        if(service.updateTbClaimResult(tbClaimResultEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{resultCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<tbClaimResultEntity> searchTbClaimResult(@PathVariable("resultCode") String resultCode) throws Exception {
        tbClaimResultEntity tbClaimResultEntity = service.findDetailTbClaimResult(resultCode);
        MakeResult<tbClaimResultEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(tbClaimResultEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(tbClaimResultEntity);
    }

    @RequestMapping(value = "/delete/{resultCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delTbClaimResult(@PathVariable("resultCode") String resultCode) throws Exception {
        if(service.deleteTbClaimResult(resultCode)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
