package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Customer;
import com.accp.domain.CustomerExample;
import com.accp.domain.Viplevel;
import com.accp.mapper.CustomerMapper;
import com.accp.mapper.VipMapper;
import com.accp.mapper.ViplevelMapper;
import com.accp.domain.CustomerExample.Criteria;
import com.accp.domain.Vip;
import com.accp.domain.VipExample;

@Service
@Transactional
public class VipLevelService {
	
	@Autowired
	ViplevelMapper vipLevelMapper;
	@Autowired
	CustomerMapper customerMapper;
	@Autowired
	VipMapper vipMapper;
	
	/**
	 * 查询全部会员等级
	 */
	public List<Viplevel> findViplevels(){
		return vipLevelMapper.selectByExample(null);
	}
	/**
	 * 根据客户名称编号或手机号查询客户
	 */
	public List<Customer> findByCno(String condition) {
		CustomerExample example=new CustomerExample();
		Criteria criteria=example.createCriteria();
		criteria.andCnoLike("%"+condition+"%");
		example.or().andCphoneLike("%"+condition+"%");
		example.or().andCnameLike("%"+condition+"%");
		return customerMapper.selectByExample(example);
	}
	/**
	 * 生成新编号
	 * @return
	 */
	public Vip newCno() {
		VipExample example=new VipExample();
		example.setOrderByClause("vno desc");
		List<Vip> list= vipMapper.selectByExample(example);
		if(list!=null&&list.size()>0) {
			return list.get(0);
		}
		return null;
	}
	
	/**
	 * 查询该客户是否为会员
	 */
	public Integer findByCnoIsVip(String cno) {
		VipExample example=new VipExample();
		example.createCriteria().andCnoEqualTo(cno);
		Integer count=vipMapper.countByExample(example);
		return count;
	}
}
