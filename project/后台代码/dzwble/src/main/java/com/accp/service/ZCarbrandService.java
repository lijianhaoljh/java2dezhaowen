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
				if (condition.trim() != null && !"".equals(condition.trim()))
				{
					//不为空
					if(condition.trim().matches("^[0-9]*$")) {
						//数字根据编号查
						example.or().andCbnoEqualTo(Integer.valueOf(condition.trim()));
					}else {
						//非数字查名称或首字母
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
				List<Motorcycle> list=motorcycleMapper.findMotorcyle(cbno);
				if(list!=null&&list.size()>0) {
					return list;
				}
				return null;
			}
			
			/**
			 * 根据条件查询车型
			 */
			public List<Motorcycle> findMotorcyleTwo(Integer cbno,String cbnos){
				List<Motorcycle> list=motorcycleMapper.findMotorcyleTwo(cbno, cbnos);
				if(list!=null&&list.size()>0) {
					return list;
				}
				return null;
			}
			
			/**
			 * 根据品牌id删除车品牌
			 */
			public int datele(Integer cbno) {		
				return carbrandMapper.deleteByPrimaryKey(cbno);			
			}
			
			/**
			 * 新增车型
			 * @param car
			 * @return
			 */
			public int add(Carbrand car) {
				return carbrandMapper.insert(car);
			}
			
			/**
			 * 根据id查询车型
			 */
			public Carbrand UpdaID(Integer cbnoid) {
				System.out.println("22");
				return carbrandMapper.selectByPrimaryKey(cbnoid);
			}
			
			/**
			 * 修改车型
			 */
			public int upda(Carbrand car) {
				return carbrandMapper.updateByPrimaryKey(car);
			}
}
