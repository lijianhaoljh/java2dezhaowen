package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.LevelProducers;
import com.accp.domain.Linkman;
import com.accp.domain.Manufacturer;
import com.accp.domain.PaymentMethod;
import com.accp.domain.PlaceOrigin;
import com.accp.service.ZManufacturerService;

@RestController
@RequestMapping("/PlaceOriginRest")
public class ZPlaceOriginController {
	
		@Autowired
		ZManufacturerService zm;
	
		@GetMapping
		public List<PlaceOrigin> query(){
			return zm.query();
		}
		
		@GetMapping(value = "queryFind")
		public List<Manufacturer> queryFind(){
			return zm.queryFind();
		}
		
		@GetMapping(value = "queryFindTwo")
		public List<Manufacturer> queryFindTwo(Integer pid){
			return zm.queryFindTwo(pid);
		}
		
		@GetMapping(value = "queryFindname")
		public List<Manufacturer> queryFindname(String name){
			return zm.queryFindname(name);
		}
		
		@GetMapping(value = "queryFindmfid")
		public List<Manufacturer> queryFindmfid(Integer mfid){
			return zm.queryFindmfid(mfid);
		}
		
		@GetMapping(value = "fkquery")
		public List<PaymentMethod> fkquery(){
			return zm.fkquery();
		}
		
		@GetMapping(value = "levequery")
		public List<LevelProducers> levequery(){
			return zm.levequery();
		}
		
		@PostMapping(value = "add")
		public int add(@RequestBody Manufacturer maun) {
			return zm.add(maun);
		}
		
		@GetMapping(value = "updaid")
		public Manufacturer updaid(Integer mfid) {
			return zm.updaid(mfid);
		}
		
		@PutMapping(value = "upda")
		public int upda(@RequestBody Manufacturer maun) {
			return zm.upda(maun);
		}
		
		@PostMapping(value = "addtwo")
		public int addtwo(@RequestBody Linkman maun) {
			return zm.addtwo(maun);
		}
		
		@PostMapping(value = "deletetwo")
		public int deteletwo(Integer linkno) {
			return zm.deteletwo(linkno);
		}
		
		@GetMapping(value = "queryFindid")
		public Linkman queryFindid(Integer linkno) {
			return zm.queryFindid(linkno);
		}
		
		@PutMapping(value = "updatwo")
		public int updatwo(Linkman maun) {
			return zm.updatwo(maun);
		}
}
