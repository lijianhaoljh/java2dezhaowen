package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.IncomeType;
import com.accp.domain.Maintenance;
import com.accp.domain.ServiceItem;
import com.accp.service.ZServiceitemService;

@RestController
@RequestMapping("/ServiceItemRest")
public class ZServiceItemController {
			@Autowired
			ZServiceitemService zservice;
			
			@GetMapping
			public List<Maintenance> query(){
				return zservice.query();
			}
			
			@GetMapping(value = "querytwo")
			public List<ServiceItem> querytwo(){
				return zservice.querytwo();
			}
			
			@GetMapping(value = "queryname")
			public List<ServiceItem> queryname(String name){
				return zservice.queryname(name);
			}
			
			@GetMapping(value = "queryid")
			public List<ServiceItem> queryid(Integer mid){
				return zservice.queryid(mid);
			}
			
			@PostMapping(value = "deleteid")
			public int delete(Integer mid) {
				return zservice.delete(mid);
			}
			
			@GetMapping(value = "queryac")
			public List<IncomeType> queryac(){
				return zservice.queryac();
			}
			
			@GetMapping(value = "addaid")
			public Maintenance addaid(Integer mid){
				return zservice.addaid(mid);
			}
}
