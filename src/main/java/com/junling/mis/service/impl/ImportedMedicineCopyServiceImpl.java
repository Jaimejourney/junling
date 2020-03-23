package com.junling.mis.service.impl;

import com.junling.mis.mapper.importedMedicineCopyEntityMapper;
import com.junling.mis.model.importedMedicineCopyEntity;
import com.junling.mis.service.ImportedMedicineCopyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("importedMedicineCopyService")
public class ImportedMedicineCopyServiceImpl implements ImportedMedicineCopyService {

	private final static Logger LOG = LoggerFactory.getLogger(ImportedMedicineCopyServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.importedMedicineCopyEntityMapper importedMedicineCopyEntityMapper;


	@Override
	public Boolean addImportedMedicineCopy(importedMedicineCopyEntity importedMedicineCopyEntity) throws Exception {
		return importedMedicineCopyEntityMapper.insert(importedMedicineCopyEntity) > 0;
	}
}