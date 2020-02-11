package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Permission;
import com.accp.service.RolesPermsService;

@RestController
@RequestMapping("/rolesPerms")
public class RolesPermsController {
	
	@Autowired
	RolesPermsService rolesPermsService;
	
	@PostMapping("/insertRolesPerms/{id}")
	public String insertRolesPerms(@PathVariable("id")Integer rid,@RequestBody List<Permission> list) {
		Integer count= rolesPermsService.insertRolesPerms(rid, list);
		return "result:"+count;
	}
	
}
