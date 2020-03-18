package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.ReworkReason;
import com.accp.domain.ReworkReasonExample;
import com.accp.mapper.ReworkReasonMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class ReworkReasonService {
	
	@Autowired
	ReworkReasonMapper reworkReasonMapper;
	
	/**
	 * 分页查询返工
	 */
	public PageInfo<ReworkReason> findReworkReasonPage(Integer pageSize,Integer pageNum,String rname){
		Page<ReworkReason> page = PageHelper.startPage(pageNum, pageSize);
		ReworkReasonExample example=new ReworkReasonExample();
		example.createCriteria().andRnameLike("%"+rname+"%");
		reworkReasonMapper.selectByExample(example);
		return page.toPageInfo();
	}
	/**
	 * 添加返工
	 */
	public Integer addReworkReason(ReworkReason r) {
		return reworkReasonMapper.insert(r);
	}
	/**
	 * 删除返工
	 */
	public Integer delReworkReason(Integer rid) {
		return reworkReasonMapper.deleteByPrimaryKey(rid);
	}
	/**
	 * 修改返工
	 */
	public Integer upReworkReason(ReworkReason r) {
		return reworkReasonMapper.updateByPrimaryKey(r);
	}
}
