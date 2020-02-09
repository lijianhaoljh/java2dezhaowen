package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Role;
import com.accp.service.RoleService;

@RestController
@RequestMapping("role")
public class RoleController {
	
	@Autowired
	RoleService roleService;
	
	@GetMapping("/findRole")
	@ResponseBody
	public List<Role> findRole(String condition){
		return roleService.findRole(condition);
	}
	
	@PostMapping("/addRole")
	public String addRole(Role r) {
		Integer count=roleService.addRole(r);
		return "result:"+count;
	}
	
	@PutMapping("/updateRole")
	public String updateRole(@RequestBody Role r) {
		Integer count=roleService.updateRole(r);
		return "result:"+count;
	}
	
	@DeleteMapping("/deleteRole/{rid}")
	public String deleteRole(@PathVariable("rid")Integer rid) {
		Integer count=roleService.deleteRole(rid);
		return "result:"+count;
	}
	
	@GetMapping("/findByRid")
	@ResponseBody
	public Role findByRid(Integer rid) {
		return roleService.findByRid(rid);
	}
	
}
