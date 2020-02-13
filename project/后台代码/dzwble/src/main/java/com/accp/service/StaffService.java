package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Job;
import com.accp.domain.Mechanism;
import com.accp.domain.MechanismExample;
import com.accp.domain.People;
import com.accp.domain.PeopleRoles;
import com.accp.domain.Role;
import com.accp.domain.Staff;
import com.accp.mapper.JobMapper;
import com.accp.mapper.MechanismMapper;
import com.accp.mapper.PeopleMapper;
import com.accp.mapper.PeopleRolesMapper;
import com.accp.mapper.RoleMapper;
import com.accp.mapper.StaffMapper;

@Service
@Transactional
public class StaffService {
	
	@Autowired
	MechanismMapper mmmapper;
	@Autowired
	StaffMapper stamapper;
	@Autowired
	JobMapper jmapper;
	@Autowired
	PeopleMapper pmapper;
	@Autowired
	PeopleRolesMapper prmapper;
	@Autowired
	RoleMapper rmapper;
	
	public List<Mechanism> queryAll(){
		return mmmapper.selectByExample(null);
	}
	
	//根据组织机构编号查询职工
		public List<Staff> queryPeopleByParentid(String pno,Integer parentid){
			return stamapper.queryPeopleByParentid(pno,parentid);
		}
		
		//查询机构
		public List<Mechanism> queryMechanByparentid(Integer parentid){
			MechanismExample ex = new MechanismExample();
			ex.createCriteria().andParentidEqualTo(parentid);
			return mmmapper.selectByExample(ex);
		}
		
		
		//查询所有职工
		public List<People> queryAllStaff(){
			return pmapper.selectByExample(null);
		}
		//查询所有岗位
		public List<Job> queryAllJob(){
			return jmapper.selectByExample(null);
		}
		//添加职工
		public int addStaff(Staff staf) {
			People peo = staf.getPeople();
			peo.setDimission(0);
			int a = pmapper.insert(peo);
			if(a>0) {
				PeopleRoles pr = new PeopleRoles();
				pr.setPno(staf.getPno());
				pr.setRid(2);
				int aa = prmapper.insert(pr);
				int b = stamapper.insert(staf);
				return b;
			}
			return 0;
		}
		//修改职工
		public int updateStaff(Staff staf) {
			People peo = staf.getPeople();
			int a = pmapper.updateByPrimaryKey(peo);
			if(a>0) {
				int b = stamapper.updateByPrimaryKey(staf);
				return b;
			}
			return 0;
		}
		//删除职工
		public int deleteStaff(Staff staf) {
			int a = pmapper.deleteByPrimaryKey(staf.getPno());
			int b = stamapper.deleteByPrimaryKey(staf.getSid());
			return b;
		}
		//置空职工密码
		public int updateStaffPwd(Staff staf) {
			People peo = staf.getPeople();
			peo.setSpassword("");
			int a = pmapper.updateByPrimaryKey(peo);
			return a;
		}
		//添加部门
		public int addMech(Mechanism addMechanism) {
			return mmmapper.insert(addMechanism);
		}
		//修改部门
		public int upMech(Mechanism addMechanism) {
			return mmmapper.updateByPrimaryKey(addMechanism);
		}
		//删除部门以及部门下的员工
		public int deleMech(Integer mid) {
			return mmmapper.deleteByPrimaryKey(mid);
		}
		//查询所有角色
		public List<Role> queryAllRole(){
			return rmapper.selectByExample(null);
		}
		
		//查询所有在职员工和技工
		public List<People> queryunion(String pno){
			return pmapper.queryunion(pno);
		}
	
}
