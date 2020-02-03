package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Customer;
import com.accp.service.CustomerAndCarService;

@Controller
@RequestMapping("/cus")
public class CustomerAndCarController {
	
	@Autowired
	CustomerAndCarService ser;
	
	@ResponseBody
	@RequestMapping("/queryCusAll")
	public List<Customer> queryAll(){
		return ser.queryAll();
	}
	
}
