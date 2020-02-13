package com.accp.controller;

import java.util.Date;
import java.util.List;

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
	
	@PostMapping("/insertVip")
	public String insertVip(@RequestBody Vip v) {
		Integer count=vipService.insertVip(v);
		return "result:"+count;
	}
	@DeleteMapping("/deleteVip/{vno}")
	public String deleteVip(@PathVariable("vno")String vno) {
		return "result"+vipService.deleteVip(vno);
	}
	
	@PutMapping("/cleanPoint")
	public String cleanPoint(@RequestBody Vip v) {
		return "result:"+vipService.cleanPoint(v);
	}
	
	@PutMapping("/czVip")
	public String czVip(@RequestBody Vip v) {
		return "result:"+vipService.updateVip(v);
	}
	
	@PutMapping("/updateVip")
	public String updateVip(@RequestBody Vip v) {
		return "result:"+vipService.updateVip(v);
	}
}
