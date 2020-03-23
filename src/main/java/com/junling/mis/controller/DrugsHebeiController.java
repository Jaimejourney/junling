package com.junling.mis.controller;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.drugsHainanEntity;
import com.junling.mis.model.drugsHebeiEntity;
import com.junling.mis.service.DrugsHainanService;
import com.junling.mis.service.DrugsHebeiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/DrugsHebei")
public class DrugsHebeiController {
    @Autowired
    private DrugsHebeiService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addDrugsHebei(@RequestBody drugsHebeiEntity drugsHebeiEntity) throws Exception {
        if(service.addDrugsHebei(drugsHebeiEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
