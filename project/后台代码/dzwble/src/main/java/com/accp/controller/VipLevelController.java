package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Customer;
import com.accp.domain.Viplevel;
import com.accp.service.VipLevelService;

@RestController
@RequestMapping("/vipLevel")
public class VipLevelController {

	@Autowired
	VipLevelService vipLevelService;
	
	@GetMapping("/findViplevels")
	public List<Viplevel> findViplevels(){
		return vipLevelService.findViplevels();
	}
	
	@GetMapping("/findByCno")
	public List<Customer> findByCno(String condition) {
		return vipLevelService.findByCno(condition);
	}
	
}
