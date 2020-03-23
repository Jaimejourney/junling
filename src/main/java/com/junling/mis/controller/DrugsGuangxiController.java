package com.junling.mis.controller;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.drugsGuangdongEntity;
import com.junling.mis.model.drugsGuangxiEntity;
import com.junling.mis.service.DrugsGuangdongService;
import com.junling.mis.service.DrugsGuangxiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/DrugsGuangxi")
public class DrugsGuangxiController {
    @Autowired
    private DrugsGuangxiService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addDrugsGuangxi(@RequestBody drugsGuangxiEntity drugsGuangxiEntity) throws Exception {
        if(service.addDrugsGuangxi(drugsGuangxiEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
