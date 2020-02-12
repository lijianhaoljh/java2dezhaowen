package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Level;
import com.accp.mapper.LevelMapper;

@Service
@Transactional
public class MechanicService {

	@Autowired
	LevelMapper lmapper;
	
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
	
}
