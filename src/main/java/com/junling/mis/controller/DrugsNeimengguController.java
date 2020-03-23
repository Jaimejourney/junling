package com.junling.mis.controller;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.drugsLiaoningEntity;
import com.junling.mis.model.drugsNeimengguEntity;
import com.junling.mis.service.DrugsLiaoningService;
import com.junling.mis.service.DrugsNeimengguService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/DrugsNeimenggu")
public class DrugsNeimengguController {
    @Autowired
    private DrugsNeimengguService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addDrugsNeimenggu(@RequestBody drugsNeimengguEntity drugsNeimengguEntity) throws Exception {
        if(service.addDrugsNeimenggu(drugsNeimengguEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
