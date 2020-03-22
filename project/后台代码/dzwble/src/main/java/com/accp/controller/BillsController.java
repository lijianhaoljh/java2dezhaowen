package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Bills;
import com.accp.domain.BusinessTypes;
import com.accp.domain.Customer;
import com.accp.domain.People;
import com.accp.service.BillsService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/bills")
public class BillsController {

	@Autowired
	BillsService billsService;
	
	//查询全部单据
	@GetMapping("/findBills")
	public PageInfo<Bills> findBills(Integer pageNum,Integer pageSize){
		return billsService.findBills(pageNum,pageSize);
	}
	
	//查询维修历史
	@GetMapping("/findByCdlicenseOne")
	public PageInfo<Bills> findByCdlicenseOne(Integer pageNum,Integer pageSize,String cdlicense){
		return billsService.findByCdlicenseOne(pageNum, pageSize, cdlicense);
	}
		
	//查训维修项目
	@GetMapping("/findByCdlicenseTwo")
	public PageInfo<Bills> findByCdlicenseTwo(Integer pageNum,Integer pageSize,String cdlicense){
		return billsService.findByCdlicenseTwo(pageNum, pageSize, cdlicense);
	}
		
	//查询领料情况
	@GetMapping("/findByCdlicenseThree")
	public PageInfo<Bills> findByCdlicenseThree(Integer pageNum,Integer pageSize,String cdlicense){
		return billsService.findByCdlicenseThree(pageNum, pageSize, cdlicense);
	}
	
	//生成新单据号
	@GetMapping("/findNewBid")
	public String findNewBid(){
		return billsService.findNewBid();
	}
	
	//查询车辆是否存在未竣工
	@GetMapping("/findIsCardata")
	public String findIsCardata(String cdlicense) {
		return billsService.findCardata(cdlicense).toString();
	}
	
	//查询竣工单据
	@GetMapping("/findCompletions")
	public List<Bills> findCompletions(String startTime,String endTime,String bid,Integer bstate){
		return billsService.findCompletions(startTime, endTime, bid, bstate);
	}
	//查询全部服务顾问
		@GetMapping("/findPnos")
		public List<People> findPnos(){
			return billsService.findPnos();
		}
		//查询客户
		@GetMapping("/findCnos")
		public List<Customer> findCnos(){
			return billsService.findCnos();
		}
		//查询业务类型
		@GetMapping("/findBts")
		public List<BusinessTypes> findbts(){
			return billsService.findbts();
		}
	
		//保存单据
		@PostMapping("/saveBills/{state}")
		public String saveBills(@RequestBody Bills bills,@PathVariable("state")Integer state) {
			billsService.saveBills(bills,state);
			return "000";
		}
		//打开单据
		@GetMapping("/openBills")
		public Bills openBills(String bid) {
			return billsService.openBills(bid);
		}
		//验证是否存在单据
		@PostMapping("/verifyBill")
		public String verifyBill(String bid) {
			int count=billsService.verifyBill(bid);
			if(count>0) {
				return "result:"+count;
			}else {
				return "result:0";
			}
		}
		//接车完
		@PostMapping("/pickcarOverBill")
		public String pickcarOverBill(@RequestBody Bills bills){
			billsService.pickcarOverBill(bills);
			return "000";
		}
		//竣工
		
		@PostMapping("/completed")
		public String completed(@RequestBody Bills bills){
			billsService.completed(bills);
			return "000";
		}
		//竣工回滚
		
}
