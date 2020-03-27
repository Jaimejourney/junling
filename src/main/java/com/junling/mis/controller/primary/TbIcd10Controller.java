package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.tbIcd10Entity;
import com.junling.mis.service.primary.TbIcd10Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/tbIcd10")
public class TbIcd10Controller {

    @Autowired
    private TbIcd10Service service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addTbIcd10(@RequestBody tbIcd10Entity tbIcd10Entity) throws Exception {
        if(service.addTbIcd10(tbIcd10Entity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateTbIcd10(@RequestBody tbIcd10Entity tbIcd10Entity) throws Exception {
        if(service.updateTbIcd10(tbIcd10Entity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{icd}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<tbIcd10Entity> searchTbIcd10(@PathVariable("icd") String icd) throws Exception {
        tbIcd10Entity tbIcd10Entity = service.findDetailTbIcd10(icd);
        MakeResult<tbIcd10Entity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(tbIcd10Entity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(tbIcd10Entity);
    }

    @RequestMapping(value = "/delete/{icd}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delTbIcd10(@PathVariable("icd") String icd) throws Exception {
        if(service.deleteTbIcd10(icd)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
