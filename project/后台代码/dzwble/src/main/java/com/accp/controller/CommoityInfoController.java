package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.CommodityInfo;
import com.accp.service.CommodityInfoService;

@RestController
@RequestMapping("/commodityInfo")
public class CommoityInfoController {
	@Autowired
	CommodityInfoService commodityInfoService;
	
	@GetMapping("/findCommodityInfo")
	public List<CommodityInfo> findCommodityInfo(Integer gid){
		return commodityInfoService.findCommodityInfo(gid);
	}
}
