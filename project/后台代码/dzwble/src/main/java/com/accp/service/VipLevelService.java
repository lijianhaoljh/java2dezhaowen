package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Customer;
import com.accp.domain.CustomerExample;
import com.accp.domain.Viplevel;
import com.accp.mapper.CustomerMapper;
import com.accp.mapper.ViplevelMapper;
import com.accp.domain.CustomerExample.Criteria;

@Service
@Transactional
public class VipLevelService {
	
	@Autowired
	ViplevelMapper vipLevelMapper;
	@Autowired
	CustomerMapper customerMapper;
	
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
	public Customer newCno() {
		CustomerExample example=new CustomerExample();
		example.setOrderByClause("cno desc");
		List<Customer> list= customerMapper.selectByExample(example);
		if(list!=null&&list.size()>0) {
			return list.get(0);
		}
		return null;
	}
	
}
