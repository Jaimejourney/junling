package com.junling.mis.controller;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.drugsHebeiEntity;
import com.junling.mis.model.drugsHeilongjiangEntity;
import com.junling.mis.service.DrugsHebeiService;
import com.junling.mis.service.DrugsHeilongjiangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/DrugsHeilongjiang")
public class DrugsHeilongjiangController {
    @Autowired
    private DrugsHeilongjiangService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addDrugsHeilongjiang(@RequestBody drugsHeilongjiangEntity drugsHeilongjiangEntity) throws Exception {
        if(service.addDrugsHeilongjiang(drugsHeilongjiangEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
