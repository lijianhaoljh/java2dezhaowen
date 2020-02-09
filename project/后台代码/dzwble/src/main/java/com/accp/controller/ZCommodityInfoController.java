package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.CommodityInfo;
import com.accp.service.ZCommodityInfoService;

@RestController
@RequestMapping("/CommodityInfoRest")
public class ZCommodityInfoController {
			@Autowired
			ZCommodityInfoService zCommodityInfoService;
			
			@GetMapping
			public List<CommodityInfo> DataQuery(){
				return zCommodityInfoService.DataQuery();
			}
			
			@GetMapping(value = "FindQuery")
			public List<CommodityInfo> DataQueryFind(String cbno){
				return zCommodityInfoService.DataQueryFind(cbno);
			}
			
			
}
