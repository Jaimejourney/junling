package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.PglpsdClaimRateMapper;
import com.junling.mis.model.primary.PglpsdClaimRate;
import com.junling.mis.service.primary.PglProductSubDutyClaimRateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("pglProductSubDutyClaimRateService")
public class PglProductSubDutyClaimRateServiceImpl implements PglProductSubDutyClaimRateService {

	private final static Logger LOG = LoggerFactory.getLogger(PglProductSubDutyClaimRateServiceImpl.class);

	@Resource
	private PglpsdClaimRateMapper pglpsdClaimRateMapper;

	@Override
	public Boolean addPglProductSubDutyClaimRate(PglpsdClaimRate pglpsdClaimRate) throws Exception {
		return pglpsdClaimRateMapper.insert(pglpsdClaimRate) > 0;
	}

	@Override
	public Boolean updatePglProductSubDutyClaimRate(PglpsdClaimRate pglpsdClaimRate) throws Exception {
		return pglpsdClaimRateMapper.updateByPrimaryKey(pglpsdClaimRate) > 0;
	}

	@Override
	public PglpsdClaimRate findDetailPglProductSubDutyClaimRate(String pglpsdClaimRateId) throws Exception {
		return pglpsdClaimRateMapper.selectByPrimaryKey(pglpsdClaimRateId);
	}

	@Override
	public Boolean deletePglProductSubDutyClaimRate(String pglpsdClaimRateId) throws Exception {
		return pglpsdClaimRateMapper.deleteByPrimaryKey(pglpsdClaimRateId)>0;
	}
}