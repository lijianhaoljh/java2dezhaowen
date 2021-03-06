package com.accp.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.CommodityBrand;
import com.accp.domain.CommodityInfo;
import com.accp.domain.CommodityUnit;
import com.accp.domain.CountryOrigin;
import com.accp.domain.GoodsCategory;
import com.accp.domain.GradeCommodity;
import com.accp.domain.IncomeType;
import com.accp.domain.Manufacturer;
import com.accp.domain.PlaceOrigin;
import com.accp.service.ZCommodityInfoService;

@RestController
@RequestMapping("/CommodityInfoRest")
public class ZCommodityInfoController {
			@Autowired
			ZCommodityInfoService zCommodityInfoService;
			
			@GetMapping(value = "query")
			public List<CommodityBrand> query(){
				return zCommodityInfoService.query();
			}
			@GetMapping(value = "querya")
			public List<CommodityUnit> querya(){
				return zCommodityInfoService.querya();
			}
			@GetMapping(value = "queryab")
			public List<GoodsCategory> queryab(){
				return zCommodityInfoService.queryab();
			}
			@GetMapping(value = "queryac")
			public List<IncomeType> queryac(){
				return zCommodityInfoService.queryac();
			}
			@GetMapping(value = "queryad")
			public List<CountryOrigin> queryad(){
				return zCommodityInfoService.queryad();
			}
			@GetMapping(value = "querye")
			public List<GradeCommodity> querye(){
				return zCommodityInfoService.querye();
			}
			@GetMapping(value = "queryef")
			public List<PlaceOrigin> queryef(){
				return zCommodityInfoService.queryef();
			}
			@GetMapping(value = "queryeg")
			public List<Manufacturer> queryeg(){
				return zCommodityInfoService.queryeg();
			}
			
			
			
			@GetMapping
			public List<CommodityInfo> DataQuery(){
				return zCommodityInfoService.DataQuery();
			}
			
			@GetMapping(value = "FindQuery")
			public List<CommodityInfo> DataQueryFind(String cbno){
				return zCommodityInfoService.DataQueryFind(cbno);
			}
			
			
			@PostMapping(value = "addCommd")
			public int addCommd(@RequestBody CommodityInfo comc) {
				return zCommodityInfoService.addCommd(comc);
			}
			
			@PostMapping(value = "deleteid")
			public int deleteByid(Integer cno) {
				return zCommodityInfoService.deleteByid(cno);
			}
			
			@GetMapping(value = "QueryByid")
			public CommodityInfo QueryByid(Integer cno) {
				return zCommodityInfoService.QueryByid(cno);
			}
			
			@PutMapping(value = "updaCommd")
			public int updaCommd(@RequestBody CommodityInfo comc) {
				return zCommodityInfoService.updaCommd(comc);
			}		
}
