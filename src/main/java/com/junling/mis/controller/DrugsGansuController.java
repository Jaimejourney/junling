package com.junling.mis.controller;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.drugsFujianEntity;
import com.junling.mis.model.drugsGansuEntity;
import com.junling.mis.service.DrugsFujianService;
import com.junling.mis.service.DrugsGansuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/DrugsGansu")
public class DrugsGansuController {
    @Autowired
    private DrugsGansuService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addDrugsGansu(@RequestBody drugsGansuEntity drugsGansuEntity) throws Exception {
        if(service.addDrugsGansu(drugsGansuEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
