package com.junling.mis.controller.primary;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.importedMedicineCopyEntity;
import com.junling.mis.service.primary.ImportedMedicineCopyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/ImportedMedicineCopy")
public class ImportedMedicineCopyController {
    @Autowired
    private ImportedMedicineCopyService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addImportedMedicineCopy(@RequestBody importedMedicineCopyEntity importedMedicineCopyEntity) throws Exception {
        if(service.addImportedMedicineCopy(importedMedicineCopyEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
