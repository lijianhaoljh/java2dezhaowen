package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.GoodsCategory;
import com.accp.mapper.GoodsCategoryMapper;

@Service
@Transactional
public class GoodsCategoryService {
	@Autowired
	GoodsCategoryMapper goodsCategoryMapper;
	
	public List<GoodsCategory> findGoodsCategorys(){
		return goodsCategoryMapper.findGoodsCategorys(0);
	}
}
