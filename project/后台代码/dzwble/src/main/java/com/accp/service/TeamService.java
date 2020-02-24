package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Team;
import com.accp.domain.TeamExample;
import com.accp.mapper.TeamMapper;

@Service
@Transactional
public class TeamService {

	@Autowired
	TeamMapper teamMapper;
	
	public List<Team> findTeam(){
		TeamExample example=new TeamExample();
		example.createCriteria().andParentidNotEqualTo(0);
		return teamMapper.selectByExample(example);
	}
}
