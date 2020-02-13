package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.LevelProducers;
import com.accp.domain.Linkman;
import com.accp.domain.Manufacturer;
import com.accp.domain.PaymentMethod;
import com.accp.domain.PlaceOrigin;
import com.accp.mapper.LevelProducersMapper;
import com.accp.mapper.LinkmanMapper;
import com.accp.mapper.ManufacturerMapper;
import com.accp.mapper.PaymentMethodMapper;
import com.accp.mapper.PlaceOriginMapper;

@Service
@Transactional
public class ZManufacturerService {
			@Autowired
			PlaceOriginMapper zpace; //产地
			
			@Autowired
			ManufacturerMapper zman; //供货
			
			@Autowired
			PaymentMethodMapper payme; //付款方式
			
			@Autowired
			LevelProducersMapper leve;  //产商等级
			
			@Autowired
			LinkmanMapper link;			//联系人
			
			/**
			 * 树形
			 * @return
			 */
			public List<PlaceOrigin> query(){
				return zpace.selectByExample(null);
			}
			
			/**
			 * 渲染table
			 * @return
			 */
			public List<Manufacturer> queryFind(){
				return zman.queryFind();
			}
			
			/**
			 * 根产地查询右侧
			 */
			public List<Manufacturer> queryFindTwo(Integer pid){
				List<Manufacturer> list= zman.queryFindTwo(pid);
				if(list!=null&&list.size()>0) {
					return list;
				}
				return null;
			}
			
			/**
			 * 模糊查询
			 */
			public List<Manufacturer> queryFindname(String name){
				List<Manufacturer> list= zman.queryFindname(name);
				if(list!=null&&list.size()>0) {
					return list;
				}
				return null;
			}
			
			/**
			 * 查询厂商联系人
			 */
			public List<Manufacturer> queryFindmfid(Integer mfid){
				List<Manufacturer> list= zman.queryFindmfid(mfid);
				if(list!=null&&list.size()>0) {
					return list;
				}
				return null;
			}
			
			/**
			 * 付款方式
			 */
			public List<PaymentMethod> fkquery(){
				return payme.selectByExample(null);
			}
			
			/**
			 * 产商等级
			 */
			public List<LevelProducers> levequery(){
				return leve.selectByExample(null);
			}
			
			/**
			 * 新增
			 */
			public int add(Manufacturer maun) {
				return zman.insert(maun);
			}
			
			/**
			 * 查询对象
			 */
			public Manufacturer updaid(Integer mfid) {
				return zman.selectByPrimaryKey(mfid);
			}
			/**
			 * 修改
			 */
			public int upda(Manufacturer maun) {
				return zman.updateByPrimaryKey(maun);
			}
			
			/**
			 * 新增联系人
			 */
			public int addtwo(Linkman maun) {
				return link.insert(maun);
			}
			
			/**
			 * 删除
			 */
			public int deteletwo(Integer linkno) {
				return link.deleteByPrimaryKey(linkno);
			}
			
			/**
			 * 查询联系人id
			 */
			public Linkman queryFindid(Integer linkno) {
				return link.selectByPrimaryKey(linkno);
			}
			
			/**
			 * 修改联系人
			 */
			public int updatwo(Linkman maun) {
				return link.updateByPrimaryKey(maun);
			}
			
}
