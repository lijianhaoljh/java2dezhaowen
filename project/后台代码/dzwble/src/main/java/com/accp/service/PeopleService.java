package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.People;
import com.accp.mapper.PeopleMapper;

@Service
@Transactional
public class PeopleService {
	@Autowired
	PeopleMapper peopleMapper;
	
	public List<People> findPeople(){
		return peopleMapper.selectByExample(null);
	}
}
