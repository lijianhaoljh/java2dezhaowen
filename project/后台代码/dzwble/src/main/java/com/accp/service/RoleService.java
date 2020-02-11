package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Role;
import com.accp.domain.RoleExample;
import com.accp.mapper.RoleMapper;
import com.accp.domain.RoleExample.Criteria;

@Service
@Transactional
public class RoleService {

	@Autowired
	RoleMapper roleMapper;
	
	public List<Role> findRole(String condition){
		RoleExample example=new RoleExample();
		Criteria c=example.createCriteria();
		if (condition.trim() != null && !"".equals(condition.trim()))
		{
			//不为空
			if(condition.trim().matches("^[0-9]*$")) {
				//数字根据编号查
				c.andRidEqualTo(Integer.parseInt(condition.trim()));
			}else {
				//非数字根据编号查或是名称或首字母
				c.andRnameLike("%"+condition.trim()+"%");
			}
		}
		return roleMapper.selectByExample(example);
	}
	
	public Integer addRole(Role r) {
		return roleMapper.insert(r);
	}
	
	public Integer updateRole(Role r) {
		return roleMapper.updateByPrimaryKey(r);
	}
	
	public Integer deleteRole(Integer rid) {
		return roleMapper.deleteByPrimaryKey(rid);
	}
	
	public Role findByRid(Integer rid) {
		return roleMapper.selectByPrimaryKey(rid);
	}
}
