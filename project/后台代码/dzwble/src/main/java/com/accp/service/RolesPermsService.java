package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Permission;
import com.accp.domain.RolesPerms;
import com.accp.domain.RolesPermsExample;
import com.accp.mapper.RolesPermsMapper;

@Service
@Transactional
public class RolesPermsService {

	@Autowired
	RolesPermsMapper rolesPermsMapper;
	
	public Integer insertRolesPerms(Integer rid,List<Permission> list) {
		RolesPermsExample example=new RolesPermsExample();
		example.createCriteria().andRidEqualTo(rid);
		rolesPermsMapper.deleteByExample(example);
		Integer count=null;
		for(Permission rp:list) {
			RolesPerms r=new RolesPerms();
			r.setRid(rid);
			r.setPid(rp.getId());
			count=rolesPermsMapper.insert(r);
		}
		return count;
	}
	
}
