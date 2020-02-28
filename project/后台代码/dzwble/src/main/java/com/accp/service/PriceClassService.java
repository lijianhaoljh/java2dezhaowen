package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.PriceClass;
import com.accp.mapper.PriceClassMapper;

@Service
@Transactional
public class PriceClassService {

	@Autowired
	PriceClassMapper priceClassMapper;
	
	public List<PriceClass> findPriceClass(){
		return priceClassMapper.selectByExample(null);
	}
}
