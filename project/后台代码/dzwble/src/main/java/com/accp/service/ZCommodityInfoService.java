package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.CommodityBrand;
import com.accp.domain.CommodityInfo;
import com.accp.domain.CommodityUnit;
import com.accp.domain.CountryOrigin;
import com.accp.domain.GoodsCategory;
import com.accp.domain.GradeCommodity;
import com.accp.domain.IncomeType;
import com.accp.domain.Manufacturer;
import com.accp.domain.PlaceOrigin;
import com.accp.mapper.CommodityBrandMapper;
import com.accp.mapper.CommodityInfoMapper;
import com.accp.mapper.CommodityUnitMapper;
import com.accp.mapper.CountryOriginMapper;
import com.accp.mapper.GoodsCategoryMapper;
import com.accp.mapper.GradeCommodityMapper;
import com.accp.mapper.IncomeTypeMapper;
import com.accp.mapper.ManufacturerMapper;
import com.accp.mapper.PlaceOriginMapper;

@Service
@Transactional
public class ZCommodityInfoService {
			@Autowired
			CommodityInfoMapper zCommodityInfoMapper;
			
			@Autowired
			CommodityBrandMapper zcompp;   //商品品牌表
			@Autowired
			CommodityUnitMapper zcomdw;    //商品单位
			@Autowired
			GoodsCategoryMapper gooddalei; //商品大类
			@Autowired
			IncomeTypeMapper Income;      //收入类型
			@Autowired
			CountryOriginMapper count;    //原厂副厂
			@Autowired
			GradeCommodityMapper grade;  //商品等级
			@Autowired
			PlaceOriginMapper place;     //商品产地表
			@Autowired
			ManufacturerMapper manuf;    //厂商地址
			
			public List<CommodityBrand> query(){
				return zcompp.selectByExample(null);
			}
			public List<CommodityUnit> querya(){
				return zcomdw.selectByExample(null);
			}
			public List<GoodsCategory> queryab(){
				return gooddalei.selectByExample(null);
			}
			public List<IncomeType> queryac(){
				return Income.selectByExample(null);
			}
			public List<CountryOrigin> queryad(){
				return count.selectByExample(null);
			}
			public List<GradeCommodity> querye(){
				return grade.selectByExample(null);
			}
			public List<PlaceOrigin> queryef(){
				return place.selectByExample(null);
			}
			public List<Manufacturer> queryeg(){
				return manuf.selectByExample(null);
			}
			
			
			
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
