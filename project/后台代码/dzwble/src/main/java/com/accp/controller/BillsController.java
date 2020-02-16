package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Bills;
import com.accp.service.BillsService;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/bills")
public class BillsController {

	@Autowired
	BillsService billsService;
	
	@GetMapping("/findBills")
	public PageInfo<Bills> findBills(Integer pageNum,Integer pageSize){
		return billsService.findBills(pageNum,pageSize);
	}
	
}
