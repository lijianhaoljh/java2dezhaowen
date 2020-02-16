package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Team;
import com.accp.mapper.TeamMapper;

@Service
@Transactional
public class TeamService {

	@Autowired
	TeamMapper teamMapper;
	
	public List<Team> findTeam(){
		return teamMapper.findTeam(0);
	}
}
