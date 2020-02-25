package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Insurance;
import com.accp.mapper.InsuranceMapper;

@Service
@Transactional
public class InsuranceService {
	@Autowired
	InsuranceMapper insuranceMapper;
	
	/**
	 * 查询保险公司
	 */
	public List<Insurance> findInsurances(){
		return insuranceMapper.selectByExample(null);
	}
}
