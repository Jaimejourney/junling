package com.junling.mis.controller;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.drugsHubeiEntity;
import com.junling.mis.model.drugsHunanEntity;
import com.junling.mis.service.DrugsHubeiService;
import com.junling.mis.service.DrugsHunanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/DrugsHunan")
public class DrugsHunanController {
    @Autowired
    private DrugsHunanService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addDrugsHunan(@RequestBody drugsHunanEntity drugsHunanEntity) throws Exception {
        if(service.addDrugsHunan(drugsHunanEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
