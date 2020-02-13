package com.accp.controller;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Customer;
import com.accp.domain.Vip;
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
	
	@GetMapping("/newVno")
	public String newCno() {
		String cno="";
		Vip c=vipLevelService.newCno();
		Integer no=null;
		if(c!=null) {
			no=Integer.valueOf(c.getVno().substring(6))+1;
		}
		
		Calendar cal = Calendar.getInstance();
		Integer year=cal.get(cal.YEAR);
		
		if(c==null) {
			//当天没有则编号为年月日+001
			cno="dzwvip"+"001";
		}else {
			if(no.toString().length()==1) {
				//0~9
				cno="dzwvip"+"00"+no.toString();
			}else if(no.toString().length()==2){
				//10~99
				cno="dzwvip"+"0"+no.toString();
			}else if(no.toString().length()>2) {
				//大于等于100
				cno="dzwvip"+no.toString();
			}
		}
		return cno;
	}
	
	@GetMapping("/findByCnoIsVip")
	public String findByCnoIsVip(String cno) {
		Integer count=vipLevelService.findByCnoIsVip(cno);
		return "result:"+count;
	}
	
}
