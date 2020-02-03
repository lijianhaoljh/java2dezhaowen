package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Carbrand;
import com.accp.domain.CarbrandExample;
import com.accp.domain.CarbrandExample.Criteria;
import com.accp.domain.Motorcycle;
import com.accp.mapper.CarbrandMapper;
import com.accp.mapper.MaintenanceMapper;
import com.accp.mapper.MotorcycleMapper;

@Service
@Transactional
public class ZCarbrandService {
			@Autowired
			CarbrandMapper carbrandMapper;
			@Autowired
			MotorcycleMapper motorcycleMapper;
			@Autowired
			MaintenanceMapper maintenanceMapper;
			
			/*
			 * 
			 * 模糊查询
			 */
			public List<Carbrand> query(String condition){
				CarbrandExample example =new CarbrandExample();
				Criteria criteria=example.createCriteria();
				if (condition != null && !"".equals(condition.trim()))
				{
					//不为空
					if(condition.matches("^[0-9]*$")) {
						//数字根据编号查
						example.or().andCbnoEqualTo(Integer.valueOf(condition.trim()));
					}else {
						//非数字根据编号查或是名称或首字母
						example.or().andCbnameLike("%"+condition.trim()+"%");
						example.or().andCbfirstLike("%"+condition.trim()+"%");
					}
				}
				return carbrandMapper.selectByExample(example);
			}
			
			/**
			 * 根据车型品牌查询信息
			 * @param cbno
			 * @return
			 */
			public List<Motorcycle> findQuery(int cbno){
				
				return null;
			}
}
