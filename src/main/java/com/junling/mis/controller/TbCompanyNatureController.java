package com.junling.mis.controller;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.tbClaimStatusEntity;
import com.junling.mis.model.tbCompanyNatureEntity;
import com.junling.mis.service.TbClaimStatusService;
import com.junling.mis.service.TbCompanyNatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/tbCompanyNature")
public class TbCompanyNatureController {

    @Autowired
    private TbCompanyNatureService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addTbCompanyNature(@RequestBody tbCompanyNatureEntity tbCompanyNatureEntity) throws Exception {
        if(service.addTbCompanyNature(tbCompanyNatureEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateTbCompanyNature(@RequestBody tbCompanyNatureEntity tbCompanyNatureEntity) throws Exception {
        if(service.updateTbCompanyNature(tbCompanyNatureEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{tbCompanyCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<tbCompanyNatureEntity> searchTbCompanyNature(@PathVariable("tbCompanyCode") String tbCompanyCode) throws Exception {
        tbCompanyNatureEntity tbCompanyNatureEntity = service.findDetailTbCompanyNature(tbCompanyCode);
        MakeResult<tbCompanyNatureEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(tbCompanyNatureEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(tbCompanyNatureEntity);
    }

    @RequestMapping(value = "/delete/{tbCompanyCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delTbCompanyNature(@PathVariable("tbCompanyCode") String tbCompanyCode) throws Exception {
        if(service.deleteTbCompanyNature(tbCompanyCode)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
