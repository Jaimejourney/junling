package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.TbCompanyNature;
import com.junling.mis.service.primary.TbCompanyNatureService;
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
    public MakeResult addTbCompanyNature(@RequestBody TbCompanyNature tbCompanyNature) throws Exception {
        if(service.addTbCompanyNature(tbCompanyNature)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateTbCompanyNature(@RequestBody TbCompanyNature tbCompanyNature) throws Exception {
        if(service.updateTbCompanyNature(tbCompanyNature)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{tbCompanyCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<TbCompanyNature> searchTbCompanyNature(@PathVariable("tbCompanyCode") String tbCompanyCode) throws Exception {
        TbCompanyNature tbCompanyNature = service.findDetailTbCompanyNature(tbCompanyCode);
        MakeResult<TbCompanyNature> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(tbCompanyNature == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(tbCompanyNature);
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
