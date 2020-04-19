package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.TbIndustrys;
import com.junling.mis.service.primary.TbIndustrysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/tbIndustryType")
public class TbIndustryController {

    @Autowired
    private TbIndustrysService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addTbIndustry(@RequestBody TbIndustrys tbIndustrys) throws Exception {
        if(service.addTbIndustrys(tbIndustrys)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateTbIndustry(@RequestBody TbIndustrys tbIndustrys) throws Exception {
        if(service.updateTbIndustrys(tbIndustrys)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{industryTypeCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<TbIndustrys> searchTbIndustry(@PathVariable("industryTypeCode") String industryTypeCode) throws Exception {
        TbIndustrys tbIndustrys = service.findDetailTbIndustrys(industryTypeCode);
        MakeResult<TbIndustrys> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(tbIndustrys == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(tbIndustrys);
    }

    @RequestMapping(value = "/delete/{industryTypeCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delTbIndustry(@PathVariable("industryTypeCode") String industryTypeCode) throws Exception {
        if(service.deleteTbIndustrys(industryTypeCode)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
