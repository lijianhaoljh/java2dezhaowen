package com.accp.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Vip;
import com.accp.service.VipService;

@RestController
@RequestMapping("/vip")
public class VipController {

	@Autowired
	VipService vipService;
	
	@GetMapping("/findVips")
	@ResponseBody
	public List<Vip> findVips(String condition,String startTime,String endTime){
		System.out.println(condition+">>"+startTime+">>>"+endTime);
		return vipService.findVips(condition, startTime, endTime);
	}
	
	
	
}
