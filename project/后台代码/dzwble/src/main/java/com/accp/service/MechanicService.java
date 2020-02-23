package com.accp.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Car;
import com.accp.domain.Level;
import com.accp.domain.Mechanic;
import com.accp.domain.MechanicExample;
import com.accp.domain.People;
import com.accp.domain.Resign;
import com.accp.domain.Sendcar;
import com.accp.domain.Team;
import com.accp.domain.TeamExample;
import com.accp.domain.Work;
import com.accp.domain.WorkExample;
import com.accp.mapper.CarMapper;
import com.accp.mapper.LevelMapper;
import com.accp.mapper.MechanicMapper;
import com.accp.mapper.PeopleMapper;
import com.accp.mapper.ResignMapper;
import com.accp.mapper.SendcarMapper;
import com.accp.mapper.TeamMapper;
import com.accp.mapper.WorkMapper;

@Service
@Transactional
public class MechanicService {

	@Autowired
	LevelMapper lmapper;
	@Autowired
	CarMapper cmapper;
	@Autowired
	TeamMapper tmapper;
	@Autowired
	SendcarMapper smapper;
	@Autowired
	MechanicMapper mmapper;
	@Autowired
	PeopleMapper pmapper;
	@Autowired
	WorkMapper wmapper;
	@Autowired
	ResignMapper remapper;
	
	//查询所有技工星级
	public List<Level> queryAllLevel(){
		return lmapper.selectByExample(null);
	}
	//添加星级
	public int addLevel(Level level) {
		return lmapper.insert(level);
	}
	//修改星级
	public int updateLevel(Level level) {
		return lmapper.updateByPrimaryKey(level);
	}
	//删除星级
	public int deleteLevel(Integer lid) {
		return lmapper.deleteByPrimaryKey(lid);
	}
	//查询所有外勤车辆
	public List<Car> queryAlloutcar(){
		return cmapper.queryAlloutcar();
	}
	//添加外勤车辆
	public int addOutcar(Car car) {
		car.setState(0);
		return cmapper.insert(car);
	}
	//修改外勤车辆
	public int updateOutcar(Car car) {
		return cmapper.updateByPrimaryKey(car);
	}
	//删除外勤车辆
	public int deleteOutcar(String cno) {
		return cmapper.deleteByPrimaryKey(cno);
	}
	//查询所有班组
	public List<Team> queryAllTeam(){
		return tmapper.selectByExample(null);
	}
	
	
	//查询借车记录
	public List<Sendcar> querySendcar(){
		return smapper.selectByExample(null);
	}
	
	//新增借车记录
	public int addSendcar(Sendcar send) {
		Car car = cmapper.selectByPrimaryKey(send.getCno());
		car.setState(1);
		int a = cmapper.updateByPrimaryKey(car);
		send.setIssend(0);
		return smapper.insert(send);
	}
	//还车
	public int updateSendcar(Sendcar send) {
		Car car = cmapper.selectByPrimaryKey(send.getCno());
		car.setState(0);
		int a = cmapper.updateByPrimaryKey(car);
		send.setIssend(1);
		Date currentTime = new Date();
		send.setSdate(currentTime);
		return smapper.updateByPrimaryKey(send);
	}
	//删除借还车记录
	public int deleteSendcar(Integer sid) {
		WorkExample ex = new WorkExample();
		ex.createCriteria().andTidEqualTo(sid);
		int a = wmapper.deleteByExample(ex);
		return smapper.deleteByPrimaryKey(sid);
	}
	//查询所有在职技工根据tid
	public List<Mechanic> queryMechanicBytid(String pno,Integer tid){
		return mmapper.queryMechanicBytid(pno,tid);
	}
	//查询所有在职技工根据parentid
	public List<Mechanic> queryMechanicByparentid(String pno,Integer parentid){
		return mmapper.queryMechanicByparentid(pno,parentid);
	}
	//添加技工
	public int addMechanic(Mechanic mechanic) {
		People peo = mechanic.getPeople();
		peo.setDimission(0);
		peo.setSpassword("88888888");
		peo.setPtid(2);
		peo.setRid(2);
		int a = pmapper.insert(peo);
		if(a>0) {
			mechanic.setJid(8);
			mechanic.setRid(2);
			return mmapper.insert(mechanic);
		}else {
			return 0;
		}
	}
	
	//修改技工
		public int updateMechanic(Mechanic mechanic) {
			People peo = mechanic.getPeople();
			int a = pmapper.updateByPrimaryKey(peo);
			if(a>0) {
				MechanicExample ex = new MechanicExample();
				ex.createCriteria().andPnoEqualTo(mechanic.getPno());
				return mmapper.updateByExample(mechanic, ex);
			}else {
				return 0;
			}
		}
		
		//删除技工
		public int deleteMechanic(String pno) {
			People peo = pmapper.selectByPrimaryKey(pno);
			peo.setDimission(1);
			int a = pmapper.updateByPrimaryKey(peo);
			
			if(a>0) {
				Resign re = new Resign();
				re.setSno(pno);
				Date time = new Date();
				re.setRdate(time);
				re.setRreason("强制遣退");
				int b = remapper.insert(re);
			}
			
			return a;
		}
		
		public List<Team> query(){
			return tmapper.selectByExample(null);
		}
		
		//增加班组
		public int add(Team team) {
			Work work = new Work();
			work.setTid(team.getTid());
			Integer hourMoney = Integer.valueOf(team.getRemark1());
			work.setWinmorning(hourMoney);
			if(hourMoney>1) {
				work.setWinnight(0);
				work.setWoutmoning(0);
				work.setWoutnight(1);
			}else {
				work.setWinnight(0);
				work.setWoutmoning(0);
				work.setWoutnight(0);
			}
			Date curenttime = new Date();
			work.setWdate(curenttime);
			int a  = wmapper.insert(work);
			return tmapper.insert(team);
		}
		//修改班组
		public int update(Team team) {
			return tmapper.updateByPrimaryKey(team);
		}
		//删除班组
		public int delete(Integer tid) {
			return tmapper.deleteByPrimaryKey(tid);
		}
		//父级id为0的班组
		public List<Team> queryTeamper(){
			TeamExample ex = new TeamExample();
			ex.createCriteria().andParentidEqualTo(0);
			return tmapper.selectByExample(ex);
		}
		//根据父级id查询班组
		public List<Team> queryTeamson(Integer parentid){
			TeamExample ex = new TeamExample();
			ex.createCriteria().andParentidEqualTo(parentid);
			return tmapper.selectByExample(ex);
		}
		
		//根据父级ID查询班组分工
		public List<Work> queryTeamByParentid(Integer parentid){
			return wmapper.queryTeamByParentid(parentid);
		}
}
