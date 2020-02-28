package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.PriceClass;
import com.accp.service.PriceClassService;

@RestController
@RequestMapping("/priceClass")
public class PriceClassController {

	@Autowired
	PriceClassService priceClassService;
	
	@GetMapping("/findPriceClass")
	public List<PriceClass> findPriceClass(){
		return priceClassService.findPriceClass();
	}
}
