package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public List<Resign> queryAllResign(String pno){
		return ser.queryAllResign(pno);
	}
	@GetMapping(value="/queryAllPeo")
	public List<Staff> queryAllPeo(){
		return ser.queryAllPeo();
	}
	@PostMapping(value="/addResign")
	public String addResign(@RequestBody Resign quit) {
		if(ser.addResign(quit)>0) {
			return "1";
		}else {
			return "2";
		}
	}
	@PutMapping
	public String goBackResign(@RequestBody Resign demon) {
		if(ser.goBackResign(demon)>0) {
			return "1";
		}else {
			return "2";
		}
	}
	@PostMapping("/deleResign")
	public String deleResign(@RequestBody Resign demon) {
		if(ser.deleResign(demon)>0) {
			return "1";
		}else {
			return "2";
		}
	}
	
	@PostMapping(value="/queryBypno")
	public Staff queryBypno(String pno){
		return ser.queryBypno(pno);
	}
}
