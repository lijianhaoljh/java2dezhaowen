package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Cardata;
import com.accp.domain.Carkeep;
import com.accp.domain.Customer;
import com.accp.domain.Staff;
import com.accp.service.DayService;

@RestController
@RequestMapping("/day")
public class DayController {

	@Autowired
	DayService ser;
	
	@GetMapping("/querytodaybirthcus")
	public List<Customer> querytodaybirthcus(){
		return ser.querytodaybirthcus();
	}

	@GetMapping("/queryvipwillnone")
	public List<Customer> queryvipwillnone(){
		return ser.queryvipwillnone();
	}

	@GetMapping("/querylicensewillexpire")
	public List<Cardata> querylicensewillexpire(){
		return ser.querylicensewillexpire();
	}

	@GetMapping("/queryinsurexpirecar")
	public List<Cardata> queryinsurexpirecar(){
		return ser.queryinsurexpirecar();
	}

	@GetMapping("/querycheckcar")
	public List<Cardata> querycheckcar(){
		return ser.querycheckcar();
	}

	@GetMapping("/querymisscus")
	public List<Customer> querymisscus(){
		return ser.querymisscus();
	}
	
	@GetMapping("/querytodatbirthdriver")
	public List<Cardata> querytodatbirthdriver(){
		return ser.querytodatbirthdriver();
	}

	@GetMapping("/querykeepcar")
	public List<Carkeep> querykeepcar(){
		return ser.querykeepcar();
	}

	@GetMapping("/querytodaybirthstaf")
	public List<Staff> querytodaybirthstaf(){
		return ser.querytodaybirthstaf();
	}

	@GetMapping("/queryoverstaf")
	public List<Staff> queryoverstaf(){
		return ser.queryoverstaf();
	}
}
