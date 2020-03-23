package com.junling.mis.controller;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.drugsGansuEntity;
import com.junling.mis.model.drugsGuangdongEntity;
import com.junling.mis.service.DrugsGansuService;
import com.junling.mis.service.DrugsGuangdongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/DrugsGuangdong")
public class DrugsGuangdongController {
    @Autowired
    private DrugsGuangdongService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addDrugsGuangdong(@RequestBody drugsGuangdongEntity drugsGuangdongEntity) throws Exception {
        if(service.addDrugsGuangdong(drugsGuangdongEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
