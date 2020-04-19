package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.TbClaimResult;
import com.junling.mis.service.primary.TbClaimResultService;
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
    public MakeResult addTbClaimResult(@RequestBody TbClaimResult tbClaimResult) throws Exception {
        if(service.addTbClaimResult(tbClaimResult)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateTbClaimResult(@RequestBody TbClaimResult tbClaimResult) throws Exception {
        if(service.updateTbClaimResult(tbClaimResult)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{resultCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<TbClaimResult> searchTbClaimResult(@PathVariable("resultCode") String resultCode) throws Exception {
        TbClaimResult tbClaimResult = service.findDetailTbClaimResult(resultCode);
        MakeResult<TbClaimResult> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(tbClaimResult == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(tbClaimResult);
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
