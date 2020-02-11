package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.People;
import com.accp.domain.PeopleExample;
import com.accp.mapper.PeopleMapper;

@Service
@Transactional
public class LoginService {
	@Autowired
	PeopleMapper peopleMapper;
	
	public People findByUsers(People users) {
		PeopleExample ex = new PeopleExample();
		ex.createCriteria().andPnoEqualTo(users.getPno()).andSpasswordEqualTo(users.getSpassword());
		List<People> list = peopleMapper.selectByExample(ex);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	
}
