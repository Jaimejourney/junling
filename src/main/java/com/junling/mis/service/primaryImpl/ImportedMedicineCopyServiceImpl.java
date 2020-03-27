package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.importedMedicineCopyEntity;
import com.junling.mis.service.primary.ImportedMedicineCopyService;
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
	private com.junling.mis.mapper.primary.importedMedicineCopyEntityMapper importedMedicineCopyEntityMapper;


	@Override
	public Boolean addImportedMedicineCopy(importedMedicineCopyEntity importedMedicineCopyEntity) throws Exception {
		return importedMedicineCopyEntityMapper.insert(importedMedicineCopyEntity) > 0;
	}
}