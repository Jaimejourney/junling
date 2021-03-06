package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.GradeLevelMapper;
import com.junling.mis.model.primary.GradeLevel;
import com.junling.mis.service.primary.GradeLevelService;
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
	private GradeLevelMapper gradeLevelMapper;


	@Override
	public Boolean addGradeLevel(GradeLevel gradeLevel) throws Exception {
		return gradeLevelMapper.insert(gradeLevel) > 0;
	}

	@Override
	public Boolean updateGradeLevel(GradeLevel gradeLevel) throws Exception {
		return gradeLevelMapper.updateByPrimaryKey(gradeLevel) > 0;
	}

	@Override
	public GradeLevel findDetailGradeLevel(String gradeLevelId) throws Exception {
		return gradeLevelMapper.selectByPrimaryKey(gradeLevelId);
	}

	@Override
	public Boolean deleteGradeLevel(String gradeLevelId) throws Exception {
		return gradeLevelMapper.deleteByPrimaryKey(gradeLevelId) > 0;
	}
}