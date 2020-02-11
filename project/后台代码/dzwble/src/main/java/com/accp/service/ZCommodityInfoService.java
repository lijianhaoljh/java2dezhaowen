package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.CommodityInfo;
import com.accp.mapper.CommodityInfoMapper;

@Service
@Transactional
public class ZCommodityInfoService {
			@Autowired
			CommodityInfoMapper zCommodityInfoMapper;
			
			/**
			 * 连表查询Table
			 * @return
			 */
			public List<CommodityInfo> DataQuery(){
				 return zCommodityInfoMapper.DataQuery();
			}
			
			/**
			 * 多条件chax 
			 */
			public List<CommodityInfo> DataQueryFind(String cbno){
				return zCommodityInfoMapper.DataQueryFind(cbno);
			}
			
}
