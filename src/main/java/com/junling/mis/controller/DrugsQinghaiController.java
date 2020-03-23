package com.junling.mis.controller;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.drugsNingxiaEntity;
import com.junling.mis.model.drugsQinghaiEntity;
import com.junling.mis.service.DrugsNingxiaService;
import com.junling.mis.service.DrugsQinghaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/DrugsQinghai")
public class DrugsQinghaiController {
    @Autowired
    private DrugsQinghaiService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addDrugsQinghai(@RequestBody drugsQinghaiEntity drugsQinghaiEntity) throws Exception {
        if(service.addDrugsQinghai(drugsQinghaiEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
