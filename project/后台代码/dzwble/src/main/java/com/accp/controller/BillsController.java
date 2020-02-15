package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Bills;
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
		return billsService.findByCdlicenseOne(pageNum, pageSize, cdlicense);
	}
		
	//查询领料情况
	@GetMapping("/findByCdlicenseThree")
	public PageInfo<Bills> findByCdlicenseThree(Integer pageNum,Integer pageSize,String cdlicense){
		return billsService.findByCdlicenseOne(pageNum, pageSize, cdlicense);
	}
	
}
