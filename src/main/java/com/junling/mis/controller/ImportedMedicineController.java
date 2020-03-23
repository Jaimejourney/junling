package com.junling.mis.controller;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.importedMedicineCopyEntity;
import com.junling.mis.model.importedMedicineEntity;
import com.junling.mis.service.ImportedMedicineCopyService;
import com.junling.mis.service.ImportedMedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/ImportedMedicine")
public class ImportedMedicineController {
    @Autowired
    private ImportedMedicineService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addImportedMedicine(@RequestBody importedMedicineEntity importedMedicineEntity) throws Exception {
        if(service.addImportedMedicine(importedMedicineEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
