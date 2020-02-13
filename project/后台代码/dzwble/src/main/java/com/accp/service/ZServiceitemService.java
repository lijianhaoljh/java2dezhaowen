package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.IncomeType;
import com.accp.domain.Maintenance;
import com.accp.domain.ServiceItem;
import com.accp.mapper.IncomeTypeMapper;
import com.accp.mapper.MaintenanceMapper;
import com.accp.mapper.ServiceItemMapper;

@Service
@Transactional
public class ZServiceitemService {
			@Autowired
			ServiceItemMapper zServiceItemMapper;
			@Autowired
			MaintenanceMapper zMaintenanceMapper;
			@Autowired
			IncomeTypeMapper Income;
			
			/**
			 * 树形
			 * @return
			 */
			public List<Maintenance> query(){
				return zMaintenanceMapper.selectByExample(null);
			}
			
			/**
			 * 渲染数据
			 * @return
			 */
			public List<ServiceItem> querytwo(){
				return zServiceItemMapper.querytwo();
			}
			
			/**
			 * 模糊查询
			 */
			public List<ServiceItem> queryname(String name){
				List<ServiceItem> list= zServiceItemMapper.queryname(name);
				if(list!=null&&list.size()>0) {
					return list;
				}
				return null;
			}
			
			/**
			 *根据id 查询左侧
			 */
			public List<ServiceItem> queryid(Integer mid){
				List<ServiceItem> list = zServiceItemMapper.queryid(mid);
				if(list!=null&&list.size()>0) {
					return list;
				}
				return null;
			}		
			
			/**
			 * 删除
			 */
			public int delete(Integer mid) {
				return zServiceItemMapper.deleteByPrimaryKey(mid);
			}
			
			/**
			 * 收入种类下拉
			 * @return
			 */
			public List<IncomeType> queryac(){
				return Income.selectByExample(null);
			}
			
			/**
			 * 类别下拉
			 * @return
			 */
			public List<Maintenance> quertm(){
				return zMaintenanceMapper.selectByExample(null);
			}
			
			
			/**
			 * 查询对象
			 * @param sidno
			 * @return
			 */
			public ServiceItem addaid(Integer sidno){
				return zServiceItemMapper.selectByPrimaryKey(sidno);
			}
			
			/**
			 * 新增
			 * @param sitem
			 * @return
			 */
			public int addtwo(ServiceItem sitem) {
				return zServiceItemMapper.insert(sitem);
			}
			
			/**
			 * 修改
			 */
			public int updatwo(ServiceItem sitem) {
				return zServiceItemMapper.updateByPrimaryKey(sitem);
			}
			
			
}
