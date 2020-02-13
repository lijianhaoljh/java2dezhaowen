package com.accp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Job;
import com.accp.mapper.JobMapper;
import com.accp.service.PostService;

@RestController
@RequestMapping("/post")
public class PostController {
	
	@Autowired
	PostService ser;
	
	@PostMapping(value="/addJob")
	public String addJob(@RequestBody Job job) {
		if(ser.addJob(job)>0) {
			return "1";
		}
		return "0";
	}
	
	@PutMapping
	public String updateJob(@RequestBody Job job) {
		if(ser.updateJob(job)>0) {
			return "1";
		}
		return "0";
	}
	
	@PostMapping(value="/deleJob")
	public String deleJob(Integer jid) {
		if(ser.deleJob(jid)>0) {
			return "1";
		}
		return "0";
	}
	
}
