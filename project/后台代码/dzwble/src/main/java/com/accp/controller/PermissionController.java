package com.accp.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.People;
import com.accp.domain.Permission;
import com.accp.service.PermissionService;

@RestController
@RequestMapping("/perms")
public class PermissionController {
	@Autowired
	PermissionService permissionService;
	
	@GetMapping("/findPerm")
	public List<Permission> findPerm(HttpSession sessions){
		People user = (People)sessions.getAttribute("user");
		List<Permission> lists = permissionService.findPerm(user.getPno());
		return lists;
	}
	
	@GetMapping("/findPerms")
	public List<Permission> findPermssions(HttpSession sessions){
		People user = (People)sessions.getAttribute("user");
		return permissionService.findByUid(user.getPno());
	}
	
	@GetMapping("/findAllPermission")
	public List<Permission> findAllPermission(){
		return permissionService.findAllPermission();
	}
	
	@GetMapping("/findRolePerms")
	public List<Permission> findRolePerms(Integer rid){
		return permissionService.findRolePerms(rid);
	}
}
