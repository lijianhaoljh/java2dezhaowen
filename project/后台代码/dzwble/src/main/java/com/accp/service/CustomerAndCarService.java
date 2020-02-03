package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Customer;
import com.accp.mapper.CardataMapper;
import com.accp.mapper.CustomerMapper;

@Service
@Transactional
public class CustomerAndCarService {
	
	@Autowired
	CustomerMapper cusmapper;
	@Autowired
	CardataMapper cardamapper;
	
	public List<Customer> queryAll(){
		return cusmapper.selectByExample(null);
	}
	
}
