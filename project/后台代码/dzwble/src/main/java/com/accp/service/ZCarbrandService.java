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

@Service
@Transactional
public class ZCarbrandService {
			@Autowired
			CarbrandMapper carbrandMapper;
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
			
			/*
			 * 查询车型
			 */
			public List<Motorcycle> findMotorcycle(Integer cbno){
				List<Motorcycle> list=maintenanceMapper.findMotorcyle(cbno);
				if(list!=null&&list.size()>0) {
					return list;
				}
				return null;
			}
}
