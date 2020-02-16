package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.People;
import com.accp.service.PeopleService;

@RestController
@RequestMapping("/people")
public class PeopleCotroller {
	@Autowired
	PeopleService peopleService;
	
	@GetMapping("/findPeople")
	public List<People> findPeople(){
		return peopleService.findPeople();
	}
	
}
