package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.GoodsCategory;
import com.accp.service.GoodsCategoryService;

@RestController
@RequestMapping("/category")
public class GoodsCategoryController {
	@Autowired
	GoodsCategoryService goodsCategoryService;
	
	@GetMapping("/findGoodsCategorys")
	public List<GoodsCategory> findGoodsCategorys(){
		return goodsCategoryService.findGoodsCategorys();
	}
}
