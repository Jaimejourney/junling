package com.junling.mis.controller;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.drugsNingxiaChineseEntity;
import com.junling.mis.model.drugsNingxiaEntity;
import com.junling.mis.service.DrugsNingxiaChineseService;
import com.junling.mis.service.DrugsNingxiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/DrugsNingxiaChinese")
public class DrugsNingxiaChineseController {
    @Autowired
    private DrugsNingxiaChineseService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addDrugsNingxiaChinese(@RequestBody drugsNingxiaChineseEntity drugsNingxiaChineseEntity) throws Exception {
        if(service.addDrugsNingxiaChinese(drugsNingxiaChineseEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
