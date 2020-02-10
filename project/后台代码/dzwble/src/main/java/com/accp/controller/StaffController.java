package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Job;
import com.accp.domain.Mechanism;
import com.accp.domain.MechanismExample;
import com.accp.domain.People;
import com.accp.domain.Staff;
import com.accp.service.StaffService;

@RestController
@RequestMapping("/staff")
public class StaffController {

	@Autowired
	StaffService ser;
	
	@GetMapping(value="/queryAllMechanism")
	public List<Mechanism> queryAllMechanism(){
		return ser.queryAll();
	}
	
	//根据组织机构编号查询职工
	@GetMapping(value="/queryPeopleByParentid")
	public List<Staff> queryPeopleByParentid(Integer parentid){
		System.out.println("大小："+ser.queryPeopleByParentid(parentid).size());
		return ser.queryPeopleByParentid(parentid);
	}
	//查询机构
	@GetMapping(value="/queryMechanByparentid")
	public List<Mechanism> queryMechanByparentid(Integer parentid){
		return ser.queryMechanByparentid(parentid);
	}
	//查询所有职工
	@GetMapping(value="/queryAllStaff")
	public List<People> queryAllStaff(){
		return ser.queryAllStaff();
	}
	//查询所有岗位
	@GetMapping(value="queryAllJob")
	public List<Job> queryAllJob(){
		return ser.queryAllJob();
	}
	//添加职工
	@PostMapping(value="/addStaff")
	public String addStaff(@RequestBody Staff staf) {
		if(ser.addStaff(staf)>0) {
			return "1";
		}
	   return "0";
	}
	@PutMapping(value="/updateStaff")
	public String updateStaff(@RequestBody Staff staf) {
		if(ser.updateStaff(staf)>0) {
			return "1";
		}
	   return "0";
	}
	@PostMapping(value="/deleteStaff")
	public String deleteStaff(@RequestBody Staff staf) {
		if(ser.deleteStaff(staf)>0) {
			return "1";
		}
	   return "0";
	}
	
	@PostMapping(value="/updateStaffPwd")
	public String updateStaffPwd(@RequestBody Staff staf) {
		if(ser.updateStaffPwd(staf)>0) {
			return "1";
		}else {
			return "0";
		}
	}
}
