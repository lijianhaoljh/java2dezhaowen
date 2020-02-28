package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.CommodityInfo;
import com.accp.domain.CommodityInfoExample;
import com.accp.mapper.CommodityInfoMapper;

@Service
@Transactional
public class CommodityInfoService {
	@Autowired
	CommodityInfoMapper commodityInfoMapper;
	
	public List<CommodityInfo> findCommodityInfo(Integer gid){
		return commodityInfoMapper.findCommodityInfo(gid);
	}
}
