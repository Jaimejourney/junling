package com.junling.mis.controller;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.drugsHubeiChineseEntity;
import com.junling.mis.model.drugsHubeiEntity;
import com.junling.mis.service.DrugsHubeiChineseService;
import com.junling.mis.service.DrugsHubeiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/DrugsHubeiChinese")
public class DrugsHubeiChineseController {
    @Autowired
    private DrugsHubeiChineseService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addDrugsHubeiChinese(@RequestBody drugsHubeiChineseEntity drugsHubeiChineseEntity) throws Exception {
        if(service.addDrugsHubeiChinese(drugsHubeiChineseEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
