package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Permission;
import com.accp.mapper.PermissionMapper;

@Service
@Transactional
public class PermissionService {
	@Autowired
	PermissionMapper permissionMapper;
	
	/**
	 * 根据用户编号获取所有权限内容,并且迭代递归成树形结构
	 * @param uid 用户编号
	 * @return
	 */
	public List<Permission> findPerm(String pno){
		List<Permission> lists = permissionMapper.findPerm(pno);
		Permission parentPerms = new Permission();
		parentPerms.setId(0);
		each(parentPerms, lists);
		return parentPerms.getChildren();
	}
	
	/**
	 * 根据用户编号获取所有权限内容
	 * @param uid 用户编号
	 * @return
	 */
	public List<Permission> findByUid(String pno){
		List<Permission> lists = permissionMapper.findPerm(pno);
		return lists;
	}
	
	public Permission findById(Integer pid) {
		return permissionMapper.selectByPrimaryKey(pid);
	}
	
	/**
	 * 递归将权限变成树形结构
	 * @param parentPerms 上层对象
	 * @param perms 需要遍历的权限
	 */
	public void each(Permission parentPerms,List<Permission> perms){
		for(Permission p : perms) {
			if(p.getParentid() == parentPerms.getId()) {
				Permission newPerms = new Permission();
				newPerms.setId(p.getId());
				newPerms.setCatalog(p.getCatalog());
				newPerms.setCename(p.getCename());
				newPerms.setName(p.getName());
				newPerms.setParentid(p.getParentid());
				newPerms.setPath(p.getPath());
				parentPerms.getChildren().add(newPerms);
				each(newPerms,perms);
			}
		}
	}
	
	/**
	 * 查询全部权限内容并迭代为树状
	 */
	public List<Permission> findAllPermission(){
		List<Permission> lists=permissionMapper.selectByExample(null);
		Permission parentPerms = new Permission();
		parentPerms.setId(0);
		each(parentPerms, lists);
		return parentPerms.getChildren();
	}
	
	/**
	 * 查询角色的权限
	 */
	public List<Permission> findRolePerms(Integer rid){
		return permissionMapper.findRolePerms(rid);
	}
}
