package com.junling.mis.controller;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.drugsGuizhouEntity;
import com.junling.mis.model.drugsHainanEntity;
import com.junling.mis.service.DrugsGuizhouService;
import com.junling.mis.service.DrugsHainanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/DrugsHainan")
public class DrugsHainanController {
    @Autowired
    private DrugsHainanService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addDrugsHainan(@RequestBody drugsHainanEntity drugsHainanEntity) throws Exception {
        if(service.addDrugsHainan(drugsHainanEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
