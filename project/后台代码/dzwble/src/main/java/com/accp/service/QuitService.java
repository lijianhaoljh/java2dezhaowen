package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.People;
import com.accp.domain.Resign;
import com.accp.domain.Staff;
import com.accp.mapper.PeopleMapper;
import com.accp.mapper.ResignMapper;
import com.accp.mapper.StaffMapper;

@Service
@Transactional
public class QuitService {
	
	@Autowired
	ResignMapper remapper;
	@Autowired
	StaffMapper pmapper;
	public List<Resign> queryAllResign(){
		return remapper.queryAllResign();
	}
	
	public List<Staff> queryAllPeo(){
		return pmapper.queryPeople();
	}
}
