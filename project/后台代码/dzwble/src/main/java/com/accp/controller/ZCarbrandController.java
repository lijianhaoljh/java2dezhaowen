package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Carbrand;
import com.accp.domain.Motorcycle;
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
		
		@ResponseBody
		@PostMapping
		public List<Motorcycle> findMotorcycle(Integer cbno){
			return zCarbrandService.findMotorcycle(cbno);
		}
		
		@GetMapping(value = "/query")
		public List<Motorcycle> findMotorcyleTwo(Integer cbno,String cbnos){
			return zCarbrandService.findMotorcyleTwo(cbno,cbnos);
		}
}
