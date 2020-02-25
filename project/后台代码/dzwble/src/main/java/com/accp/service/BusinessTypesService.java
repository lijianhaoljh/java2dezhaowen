package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.BusinessTypes;
import com.accp.mapper.BusinessTypesMapper;

@Service
@Transactional
public class BusinessTypesService {
	@Autowired
	BusinessTypesMapper businessTypesMapper;
	
	//查询所有业务类型
	public List<BusinessTypes> findBusiness(){
		return businessTypesMapper.selectByExample(null);
	}
}
