package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.TbGender;
import com.junling.mis.service.primary.TbGenderService;
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
    public MakeResult addTbGender(@RequestBody TbGender tbGender) throws Exception {
        if(service.addTbGender(tbGender)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateTbGender(@RequestBody TbGender tbGender) throws Exception {
        if(service.updateTbGender(tbGender)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{genderCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<TbGender> searchTbGender(@PathVariable("genderCode") String genderCode) throws Exception {
        TbGender tbGender = service.findDetailTbGender(genderCode);
        MakeResult<TbGender> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(tbGender == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(tbGender);
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
