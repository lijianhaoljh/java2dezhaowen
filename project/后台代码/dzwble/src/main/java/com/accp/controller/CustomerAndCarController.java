package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Cardata;
import com.accp.domain.Customer;
import com.accp.domain.Insurance;
import com.accp.domain.Mechanism;
import com.accp.domain.MechanismExample;
import com.accp.service.CustomerAndCarService;

@Controller
@RequestMapping("/cus")
public class CustomerAndCarController {
	
	@Autowired
	CustomerAndCarService ser;
	
	@ResponseBody
	@RequestMapping("/queryCusAll")
	public List<Customer> queryAll(String cname){
		return ser.queryAll(cname);
	}
	
	@ResponseBody
	@RequestMapping("/queryCarBycno")
	public List<Cardata> queryCarBycno(String cno){
		return ser.queryCarBycno(cno);
	}
	
	@ResponseBody
	@RequestMapping("/queryInsurance")
	public List<Insurance> queryInsurance(){
		return ser.queryInsurance();
	}
	
	@ResponseBody
	@RequestMapping("/addCus")
	public String addCus(Customer cus) {
		int count = ser.addCus(cus);
		if(count>0) {
			return "1";
		}else {
			return "0";
		}
	}
	
	//查询组织机构父级ID为1的
	@ResponseBody
	@RequestMapping("/queryParentideq1")
	public List<Mechanism> queryParentideq1(){
		return ser.queryParentideq1();
	}
	//查询组织机构父级ID不为1和0的
	@ResponseBody
	@RequestMapping("/queryParentidnot1")
	public List<Mechanism> queryParentidnot1(){
		return ser.queryParentidnot1();
	}
	
}
