package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Cardata;
import com.accp.mapper.CardataMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class CardataService {
	
	@Autowired
	CardataMapper cardataMapper;
	
	public PageInfo<Cardata> findCardata(Integer pageNum,Integer pageSize,String cdlicense){
		Page<Cardata> page=PageHelper.startPage(pageNum, pageSize);
		cardataMapper.findCardata(cdlicense);
		return page.toPageInfo();
	}
	
}
