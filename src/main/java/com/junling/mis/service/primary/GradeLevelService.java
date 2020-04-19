package com.junling.mis.service.primary;

import com.junling.mis.model.primary.GradeLevel;


/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface GradeLevelService {

	Boolean addGradeLevel(GradeLevel gradeLevel) throws Exception;

	Boolean updateGradeLevel(GradeLevel gradeLevel) throws Exception;

	GradeLevel findDetailGradeLevel(String gradeLevelId) throws Exception;
	
//	Result listGradeLevel(GradeLevelModel gradeLevelModel) throws Exception;
//
//    Result listGradeLevelPage(GradeLevelModel gradeLevelModel) throws Exception;
//
//	Result countGradeLevel(GradeLevelModel gradeLevelModel) throws Exception;
	
	Boolean deleteGradeLevel(String gradeLevelId) throws Exception;
}