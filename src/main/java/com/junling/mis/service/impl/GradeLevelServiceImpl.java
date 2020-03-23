package com.junling.mis.service.impl;

import com.junling.mis.mapper.gradeLevelEntityMapper;
import com.junling.mis.model.gradeLevelEntity;
import com.junling.mis.service.GradeLevelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("gradeLevelService")
public class GradeLevelServiceImpl implements GradeLevelService {

	private final static Logger LOG = LoggerFactory.getLogger(GradeLevelServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.gradeLevelEntityMapper gradeLevelEntityMapper;


	@Override
	public Boolean addGradeLevel(gradeLevelEntity gradeLevelEntity) throws Exception {
		return gradeLevelEntityMapper.insert(gradeLevelEntity) > 0;
	}

	@Override
	public Boolean updateGradeLevel(gradeLevelEntity gradeLevelEntity) throws Exception {
		return gradeLevelEntityMapper.updateByPrimaryKey(gradeLevelEntity) > 0;
	}

	@Override
	public gradeLevelEntity findDetailGradeLevel(String gradeLevelId) throws Exception {
		return gradeLevelEntityMapper.selectByPrimaryKey(gradeLevelId);
	}

	@Override
	public Boolean deleteGradeLevel(String gradeLevelId) throws Exception {
		return gradeLevelEntityMapper.deleteByPrimaryKey(gradeLevelId) > 0;
	}
}