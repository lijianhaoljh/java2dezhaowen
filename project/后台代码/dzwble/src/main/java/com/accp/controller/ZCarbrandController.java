package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Carbrand;
import com.accp.service.ZCarbrandService;

@RestController
@RequestMapping("/CarbrandRest")
public class ZCarbrandController {

		@Autowired
		ZCarbrandService zCarbrandService;
		
		@GetMapping
		public List<Carbrand> query(String condition){
			return zCarbrandService.query(condition);
		}
}
