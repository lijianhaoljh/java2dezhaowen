package com.accp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Cardata;
import com.accp.service.CardataService;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/cardata")
public class CardataController {
	
	@Autowired
	CardataService cardataService;
	
	@GetMapping("/findCardata")
	public PageInfo<Cardata> findCardata(Integer pageNum,Integer pageSize,String cdlicense){
		return cardataService.findCardata(pageNum, pageSize, cdlicense);
	}
	
	//查询当前车辆是否正在维修或救援中
	
}






