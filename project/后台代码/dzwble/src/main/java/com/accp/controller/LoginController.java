package com.accp.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.People;
import com.accp.service.LoginService;
import com.fasterxml.jackson.annotation.JsonFormat;

@RestController
public class LoginController {
	
	@Autowired
	LoginService service;

	@PostMapping("/loginin")
	public Map<String, Object> loginin(String pno, String spassword, HttpSession session) {
		People users = new People();
		users.setPno(pno);
		users.setSpassword(spassword);
		users = service.findByUsers(users);
		if (users == null) {
			return null;
		}
		session.setAttribute("user", users);
		Map<String, Object> map = new HashMap<>();
		map.put("user", users);
		map.put("token", session.getId());
		return map;
	}
	
}
