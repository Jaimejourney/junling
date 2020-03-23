package com.junling.mis.controller;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.tbImageTypeEntity;
import com.junling.mis.model.tbIndustrysEntity;
import com.junling.mis.service.TbImageTypeService;
import com.junling.mis.service.TbIndustrysService;
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
    public MakeResult addTbIndustry(@RequestBody tbIndustrysEntity tbIndustrysEntity) throws Exception {
        if(service.addTbIndustrys(tbIndustrysEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateTbIndustry(@RequestBody tbIndustrysEntity tbIndustrysEntity) throws Exception {
        if(service.updateTbIndustrys(tbIndustrysEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{industryTypeCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<tbIndustrysEntity> searchTbIndustry(@PathVariable("industryTypeCode") String industryTypeCode) throws Exception {
        tbIndustrysEntity tbIndustrysEntity = service.findDetailTbIndustrys(industryTypeCode);
        MakeResult<tbIndustrysEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(tbIndustrysEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(tbIndustrysEntity);
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
