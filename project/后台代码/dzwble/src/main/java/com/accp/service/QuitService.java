package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.People;
import com.accp.domain.Resign;
import com.accp.domain.Staff;
import com.accp.domain.StaffExample;
import com.accp.mapper.PeopleMapper;
import com.accp.mapper.ResignMapper;
import com.accp.mapper.StaffMapper;

@Service
@Transactional
public class QuitService {
	
	@Autowired
	ResignMapper remapper;
	@Autowired
	StaffMapper smapper;
	@Autowired
	PeopleMapper pmapper;
	
	public List<Resign> queryAllResign(String pno){
		return remapper.queryAllResign(pno);
	}
	
	public List<Staff> queryAllPeo(){
		return smapper.queryPeople();
	}
	//添加离职
	public int addResign(Resign quit) {
		People peo = pmapper.selectByPrimaryKey(quit.getSno());
		peo.setDimission(1);
		int a = pmapper.updateByPrimaryKey(peo);
		int c = remapper.insert(quit);
		return c;
	}
	//回滚离职
	public int goBackResign(Resign quit) {
		People peo = pmapper.selectByPrimaryKey(quit.getSno());
		peo.setDimission(0);
		int a = pmapper.updateByPrimaryKey(peo);
		int c = remapper.deleteByPrimaryKey(quit.getRid());
		return c;
	}
	//删除离职
	public int deleResign(Resign demon) {
		int a = pmapper.deleteByPrimaryKey(demon.getSno());
		StaffExample ex = new StaffExample();
		ex.createCriteria().andPnoEqualTo(demon.getSno());
		int s = smapper.deleteByExample(ex);
		return remapper.deleteByPrimaryKey(demon.getRid());
	}
	
	//根据员工编号查询离职人员详细信息
			public Staff queryBypno(String pno){
				return smapper.queryBypno(pno);
			}
}
