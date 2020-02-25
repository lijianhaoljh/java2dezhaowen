package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.BusinessTypes;
import com.accp.service.BusinessTypesService;

@RestController
@RequestMapping("/bt")
public class BusinessTypesController {
	@Autowired
	BusinessTypesService businessTypesService;
	
	@GetMapping("/findBusiness")
	public List<BusinessTypes> findBusiness(){
		return businessTypesService.findBusiness();
	}
	
}
