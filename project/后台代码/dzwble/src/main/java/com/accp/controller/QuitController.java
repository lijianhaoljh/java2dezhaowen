package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.People;
import com.accp.domain.Resign;
import com.accp.domain.Staff;
import com.accp.service.QuitService;

@RestController
@RequestMapping("/quit")
public class QuitController {

	@Autowired
	QuitService ser;
	
	@GetMapping(value="/queryAllResign")
	public List<Resign> queryAllResign(){
		return ser.queryAllResign();
	}
	@GetMapping(value="/queryAllPeo")
	public List<Staff> queryAllPeo(){
		return ser.queryAllPeo();
	}
}
