package com.accp.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Vip;
import com.accp.domain.VipExample;
import com.accp.mapper.VipMapper;

@Service
@Transactional
public class VipService {
	
	@Autowired
	VipMapper vipMapper;
	
	/*
	 * 查询会员
	 */
	public List<Vip> findVips(String condition,String startTime,String endTime){
		List<Vip> list= vipMapper.findVips(condition, startTime, endTime);
	    return list;
	}
	
	/*
	 * 新增会员
	 */
	public Integer insertVip(Vip v) {
		return vipMapper.insert(v);
	}
	
	/*
	 * 修改会员信息
	 */
	public Integer updateVip(Vip v) {
		return vipMapper.updateByPrimaryKey(v);
	}
	
	/*
	 * 删除会员
	 */
	public Integer deleteVip(String vno) {
		return vipMapper.deleteByPrimaryKey(vno);
	}
	
	/*
	 * 积分清零
	 */
	public Integer cleanPoint(Vip v) {
		v.setCurrentjifen(0);
		return vipMapper.updateByPrimaryKey(v);
	}
	
	/*
	 * 会员充值
	 */
	public Integer czVip(Vip vno) {
		return vipMapper.updateByPrimaryKey(vno);
	}
}
