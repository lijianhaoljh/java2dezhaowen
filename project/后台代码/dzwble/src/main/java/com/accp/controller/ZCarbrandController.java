package com.accp.controller;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Carbrand;
import com.accp.domain.Maintenance;
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
		
		@GetMapping(value = "query")
		public List<Motorcycle> findMotorcyleTwo(String cbnos){
			return zCarbrandService.findMotorcyleTwo(cbnos);
		}
		
		@PostMapping(value = "dele")
		public int datele(Integer cbno) {	
			return zCarbrandService.datele(cbno);
		}
		
		@PostMapping(value = "add")
		public int add(@RequestBody Carbrand car) {
			return zCarbrandService.add(car);
		}
		
		@GetMapping(value = "UpdaID")
		public Carbrand UpdaID(Integer cbnoid) {
			return zCarbrandService.UpdaID(cbnoid);
		}
		
		@PutMapping(value = "upda")
		public int upda(@RequestBody Carbrand car) {
			return zCarbrandService.upda(car);
		}
		
		@PostMapping(value = "deletwo")
		public int deletetwo(Integer moid){
			return zCarbrandService.deletetwo(moid);
		}
		
		@PostMapping(value = "addtwo")
		public int addtwo(@RequestBody Motorcycle cbbr) {
			return zCarbrandService.addtwo(cbbr);
		}
		
		
		@GetMapping(value = "updaQuery")
		public Motorcycle MotoByid(Integer moid) {
			return zCarbrandService.MotoByid(moid);
		}
		
		@PutMapping(value = "updaTwo")
		public int updaTwo(@RequestBody Motorcycle cbbr) {
			return zCarbrandService.updaTwo(cbbr);
		}
		
		@GetMapping(value = "fdj")
		public List<Maintenance> fdjquery() {
			return zCarbrandService.fdjquery();
		}
		
		
}
