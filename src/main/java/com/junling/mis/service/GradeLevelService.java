package com.junling.mis.service;

import com.junling.mis.model.gradeLevelEntity;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface GradeLevelService {

	Boolean addGradeLevel(gradeLevelEntity gradeLevelEntity) throws Exception;

	Boolean updateGradeLevel(gradeLevelEntity gradeLevelEntity) throws Exception;

	gradeLevelEntity findDetailGradeLevel(String gradeLevelId) throws Exception;
	
//	Result listGradeLevel(GradeLevelModel gradeLevelModel) throws Exception;
//
//    Result listGradeLevelPage(GradeLevelModel gradeLevelModel) throws Exception;
//
//	Result countGradeLevel(GradeLevelModel gradeLevelModel) throws Exception;
	
	Boolean deleteGradeLevel(String gradeLevelId) throws Exception;
}