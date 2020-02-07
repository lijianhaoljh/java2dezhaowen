package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Cardata;
import com.accp.domain.Customer;
import com.accp.domain.Insurance;
import com.accp.domain.Mechanism;
import com.accp.domain.MechanismExample;
import com.accp.mapper.CardataMapper;
import com.accp.mapper.CustomerMapper;
import com.accp.mapper.InsuranceMapper;
import com.accp.mapper.MechanismMapper;

@Service
@Transactional
public class CustomerAndCarService {
	
	@Autowired
	CustomerMapper cusmapper;
	@Autowired
	CardataMapper cardamapper;
	@Autowired
	InsuranceMapper insurmapper;
	@Autowired
	MechanismMapper msmapper;
	
	//查询全部客户
	public List<Customer> queryAll(String cname){
		return cusmapper.queryCusAll(cname);
	}
	//根据客户编号查询拥有汽车
	public List<Cardata> queryCarBycno(String cno){
		return cardamapper.queryCarBycno(cno);
	}
	//查询保险公司
	public List<Insurance> queryInsurance(){
		return insurmapper.selectByExample(null);
	}
	//添加客户
	public int addCus(Customer cus) {
		return cusmapper.insert(cus);
	}
	//查询组织机构父级ID为1的
	public List<Mechanism> queryParentideq1(){
		MechanismExample ex = new MechanismExample();
		ex.createCriteria().andParentidEqualTo(1);
		return msmapper.selectByExample(ex);
	}
	//查询组织机构父级ID不为1和0的
	public List<Mechanism> queryParentidnot1(){
		MechanismExample ex = new MechanismExample();
		ex.createCriteria().andParentidNotEqualTo(1).andParentidNotEqualTo(0);
		return msmapper.selectByExample(ex);
	}
	
}
