package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.importedMedicineEntity;
import com.junling.mis.service.primary.ImportedMedicineService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("importedMedicineService")
public class ImportedMedicineServiceImpl implements ImportedMedicineService {

	private final static Logger LOG = LoggerFactory.getLogger(ImportedMedicineServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.primary.importedMedicineEntityMapper importedMedicineEntityMapper;

	@Override
	public Boolean addImportedMedicine(importedMedicineEntity importedMedicineEntity) throws Exception {
		return importedMedicineEntityMapper.insert(importedMedicineEntity) > 0;
	}

//	@Override
//	public Result addImportedMedicine(ImportedMedicineModel importedMedicineModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateImportedMedicine(ImportedMedicineModel importedMedicineModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailImportedMedicine(ImportedMedicineModel importedMedicineModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listImportedMedicine(ImportedMedicineModel importedMedicineModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listImportedMedicinePage(ImportedMedicineModel importedMedicineModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countImportedMedicine(ImportedMedicineModel importedMedicineModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteImportedMedicine(ImportedMedicineModel importedMedicineModel) throws Exception{
//		return null;
//	}

}