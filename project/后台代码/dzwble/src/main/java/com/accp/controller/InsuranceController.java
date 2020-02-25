package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Insurance;
import com.accp.service.InsuranceService;

@RestController
@RequestMapping("/insurance")
public class InsuranceController {
	@Autowired
	InsuranceService insuranceService;
	
	@GetMapping("/findInsurances")
	public List<Insurance> findInsurances(){
		return insuranceService.findInsurances();
	}
	
}
