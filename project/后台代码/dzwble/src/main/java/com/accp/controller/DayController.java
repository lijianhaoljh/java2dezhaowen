package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Customer;
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
}
