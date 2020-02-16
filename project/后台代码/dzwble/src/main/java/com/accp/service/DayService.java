package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Cardata;
import com.accp.domain.Carkeep;
import com.accp.domain.Customer;
import com.accp.domain.Staff;
import com.accp.mapper.CardataMapper;
import com.accp.mapper.CarkeepMapper;
import com.accp.mapper.CustomerMapper;
import com.accp.mapper.StaffMapper;

@Service
@Transactional
public class DayService {

	@Autowired
	CustomerMapper cmapper;
	@Autowired
	CardataMapper camapper;
	@Autowired
	CarkeepMapper ckmapper;
	@Autowired
	StaffMapper smapper;
	
	public List<Customer> querytodaybirthcus(){
		return cmapper.querytodaybirthcus();
	}

	public List<Customer> queryvipwillnone(){
		return cmapper.queryvipwillnone();
	}

	public List<Cardata> querylicensewillexpire(){
		return camapper.querylicensewillexpire();
	}

	public List<Cardata> queryinsurexpirecar(){
		return camapper.queryinsurexpirecar();
	}

	public List<Cardata> querycheckcar(){
		return camapper.querycheckcar();
	}

	public List<Customer> querymisscus(){
		return cmapper.querymisscus();
	}
	
	public List<Cardata> querytodatbirthdriver(){
		return camapper.querytodatbirthdriver();
	}

	public List<Carkeep> querykeepcar(){
		return ckmapper.querykeepcar();
	}

	public List<Staff> querytodaybirthstaf(){
		return smapper.querytodaybirthstaf();
	}

	public List<Staff> queryoverstaf(){
		return smapper.queryoverstaf();
	}
}
