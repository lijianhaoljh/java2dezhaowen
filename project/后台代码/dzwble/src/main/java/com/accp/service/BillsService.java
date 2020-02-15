package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Bills;
import com.accp.mapper.BillsMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class BillsService {

	@Autowired
	BillsMapper billsMapper;
	
	public PageInfo<Bills> findBills(Integer pageNum,Integer pageSize){
		Page<Bills> page=PageHelper.startPage(pageNum, pageSize);
		billsMapper.findBills();
		return page.toPageInfo();
	}

}
