package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Level;
import com.accp.service.MechanicService;

@RestController
@RequestMapping("/mechanic")
public class MechanicController {
	
	@Autowired
	MechanicService ser;
	
	@GetMapping(value="/queryAllLevel")
	public List<Level> queryAllLevel(){
		return ser.queryAllLevel();
	}
	
	@PostMapping(value="/addLevel")
	public String addLevel(@RequestBody Level level) {
		if(ser.addLevel(level)>0) {
			return "1";
		}else {
			return "0";
		}
	}
	
	@PutMapping(value="/updateLevel")
	public String updateLevel(@RequestBody Level level) {
		if(ser.updateLevel(level)>0) {
			return "1";
		}else {
			return "0";
		}
	}
	@PostMapping(value="/deleteLevel")
	public String deleteLevel(Integer lid) {
		if(ser.deleteLevel(lid)>0) {
			return "1";
		}else {
			return "0";
		}
	}
	
}
