package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Car;
import com.accp.domain.Level;
import com.accp.domain.Mechanic;
import com.accp.domain.Sendcar;
import com.accp.domain.Team;
import com.accp.service.MechanicService;

@RestController
@RequestMapping("/mechanic")
public class MechanicController {
	
	@Autowired
	MechanicService ser;
	
	//shshsh
	
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
	
	@GetMapping(value="/queryAlloutcar")
	public List<Car> queryAlloutcar(){
		return ser.queryAlloutcar();
	}
	
	@PostMapping(value="/addOutcar")
	public String addOutcar(@RequestBody Car car) {
		if(ser.addOutcar(car)>0) {
			return "1";
		}else {
			return "0";
		}
	}
	
	@PutMapping(value="/updateOutcar")
	public String updateOutcar(@RequestBody Car car) {
		if(ser.updateOutcar(car)>0) {
			return "1";
		}else {
			return "0";
		}
	}
	@PostMapping(value="/deleteOutcar")
	public String deleteOutcar(String cno) {
		if(ser.deleteOutcar(cno)>0) {
			return "1";
		}else {
			return "0";
		}
	}
	
	@GetMapping(value="/queryAllTeam")
	public List<Team> queryAllTeam(){
		return ser.queryAllTeam();
	}
	
	@GetMapping(value="/querySendcar")
	public List<Sendcar> querySendcar(){
		return ser.querySendcar();
	}
	@PostMapping(value="/addSendcar")
	public String addSendcar(@RequestBody Sendcar send) {
		if(ser.addSendcar(send)>0) {
			return "1";
		}else {
			return "0";
		}
	}
	
	@PutMapping(value="/updateSendcar")
	public String updateSendcar(@RequestBody Sendcar send) {
		if(ser.updateSendcar(send)>0) {
			return "1";
		}else {
			return "0";
		}
	}
	
	@PostMapping(value="/deleteSendcar")
	public String deleteSendcar(Integer sid) {
		if(ser.deleteSendcar(sid)>0) {
			return "1";
		}else {
			return "0";
		}
	}
	
	@PostMapping(value="/queryMechanicBytid")
	public List<Mechanic> queryMechanicBytid(String pno,Integer tid){
		return ser.queryMechanicBytid(pno,tid);
	}

	@PostMapping(value="/queryMechanicByparentid")
	public List<Mechanic> queryMechanicByparentid(String pno,Integer parentid){
		return ser.queryMechanicByparentid(pno,parentid);
	}
	@PostMapping(value="/addMechanic")
	public String addMechanic(@RequestBody Mechanic mechanic) {
		if(ser.addMechanic(mechanic)>0) {
			return "1";
		}else {
			return "0";
		}
	}
	@PutMapping(value="/updateMechanic")
	public String updateMechanic(@RequestBody Mechanic mechanic) {
		if(ser.updateMechanic(mechanic)>0) {
			return "1";
		}else {
			return "0";
		}
	}
	@PostMapping(value="/deleteMechanic")
	public String deleteMechanic(String pno) {
		if(ser.deleteMechanic(pno)>0) {
			return "1";
		}else {
			return "0";
		}
	}
	
	@GetMapping(value="/query")
	public List<Team> query(){
		return ser.query();
	}
	
	@PostMapping(value="/add")
	public String add(@RequestBody Team team) {
		if(ser.add(team)>0) {
			return "1";
		}else {
			return "0";
		}
	}
	
	@PutMapping(value="/update")
	public String update(@RequestBody Team team) {
		if(ser.update(team)>0) {
			return "1";
		}else {
			return "0";
		}
	}
	
	@PostMapping(value="/delete")
	public String delete(Integer tid) {
		if(ser.delete(tid)>0) {
			return "1";
		}else {
			return "0";
		}
	}
	
	@GetMapping(value="/queryTeamper")
	public List<Team> queryTeamper(){
		return ser.queryTeamper();
	}
	
	@PostMapping(value="/queryTeamson")
	public List<Team> queryTeamson(Integer parentid) {
		return ser.queryTeamson(parentid);
	}
	
}
