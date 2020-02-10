package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Job;
import com.accp.mapper.JobMapper;

@Service
@Transactional
public class PostService {

	@Autowired
	JobMapper jmapper;
	
	public int addJob(Job job) {
		return jmapper.insert(job);
	}
	
	public int updateJob(Job job) {
		return jmapper.updateByPrimaryKey(job);
	}
	public int deleJob(Integer jid) {
		return jmapper.deleteByPrimaryKey(jid);
	}
	
}
