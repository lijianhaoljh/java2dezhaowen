package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Carbrand;
import com.accp.service.test;

@RestController
@RequestMapping("/test")
public class testController {
	@Autowired
	test test;
	
	@RequestMapping("/find")
	public List<Carbrand> findLikeCarbrand(String condition){
		return test.findLikeCarbrand(condition);
	}
}
