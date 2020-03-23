package com.junling.mis.controller;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.tbEducationEntity;
import com.junling.mis.model.tbGenderEntity;
import com.junling.mis.service.TbEducationService;
import com.junling.mis.service.TbGenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/tbGender")
public class TbGenderController {

    @Autowired
    private TbGenderService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addTbGender(@RequestBody tbGenderEntity tbGenderEntity) throws Exception {
        if(service.addTbGender(tbGenderEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateTbGender(@RequestBody tbGenderEntity tbGenderEntity) throws Exception {
        if(service.updateTbGender(tbGenderEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{genderCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<tbGenderEntity> searchTbGender(@PathVariable("genderCode") String genderCode) throws Exception {
        tbGenderEntity tbGenderEntity = service.findDetailTbGender(genderCode);
        MakeResult<tbGenderEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(tbGenderEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(tbGenderEntity);
    }

    @RequestMapping(value = "/delete/{genderCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delTbGender(@PathVariable("genderCode") String genderCode) throws Exception {
        if(service.deleteTbGender(genderCode)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
