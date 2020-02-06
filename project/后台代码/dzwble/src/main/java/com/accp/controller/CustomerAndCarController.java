package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Carbelong;
import com.accp.domain.Carbrand;
import com.accp.domain.Cardata;
import com.accp.domain.CardataExample;
import com.accp.domain.Customer;
import com.accp.domain.CustomerType;
import com.accp.domain.Fuel;
import com.accp.domain.Insurance;
import com.accp.domain.Maintenance;
import com.accp.domain.Mechanism;
import com.accp.domain.MechanismExample;
import com.accp.domain.Motorcycle;
import com.accp.domain.MotorcycleExample;
import com.accp.domain.PriceType;
import com.accp.domain.Staff;
import com.accp.service.CustomerAndCarService;

@Controller
@RequestMapping("/cus")
public class CustomerAndCarController {
	
	@Autowired
	CustomerAndCarService ser;
	
	@ResponseBody
	@RequestMapping("/queryCusAll")
	public List<Customer> queryAll(String cname){
		return ser.queryAll(cname);
	}
	
	@ResponseBody
	@RequestMapping("/queryCarBycno")
	public List<Cardata> queryCarBycno(String cno){
		return ser.queryCarBycno(cno);
	}
	
	@ResponseBody
	@RequestMapping("/queryInsurance")
	public List<Insurance> queryInsurance(){
		return ser.queryInsurance();
	}
	
	@ResponseBody
	@RequestMapping("/addCus")
	public String addCus(@RequestBody Customer cus) {
		int count = ser.addCus(cus);
		if(count>0) {
			return "1";
		}else {
			return "0";
		}
	}
	
	//查询组织机构父级ID为1的
	@ResponseBody
	@RequestMapping("/queryParentideq1")
	public List<Mechanism> queryParentideq1(){
		return ser.queryParentideq1();
	}
	//查询组织机构父级ID不为1和0的
	@ResponseBody
	@RequestMapping("/queryParentidnot1")
	public List<Mechanism> queryParentidnot1(Integer parentid){
		return ser.queryParentidnot1(parentid);
	}
	
	//根据组织机构编号查询职工
	@ResponseBody
	@RequestMapping("/queryPeopleByMid")
	public List<Staff> queryPeopleByMid(Integer mid){
		return ser.queryPeopleByMid(mid);
	}
	
	//查询价格类型
	@ResponseBody
	@RequestMapping("/queryPriceType")
	public List<PriceType> queryPriceType(){
		return ser.queryPriceType();
	}
	
	//查询客户分类
		@ResponseBody
		@RequestMapping("/queryOneToMore")
		public List<CustomerType> queryOneToMore(){
			return ser.queryOneToMore();
		}
	//根据主键删除客户信息以及他拥有的车辆信息
	@ResponseBody
	@RequestMapping("/deleteCusAndCarByCno")
	public String deleteCusAndCarByCno(String cno) {
		if(ser.deleteCusAndCarByCno(cno)>0) {
			return "1";
		}else {
			return "0";
		}
	}
	//根据客户编号修改客户信息
	@ResponseBody
	@RequestMapping("/updateCusByCno")
	public String updateCusByCno(@RequestBody Customer cus) {
		if(ser.updateCusByCno(cus)>0) {
			return "1";
		}else {
			return "0";
		}
	}
	//根据客户编号添加相关车辆
		@ResponseBody
		@RequestMapping("/addcarBycno")
		public String addcarBycno(@RequestBody Cardata car) {
			if(ser.addcarBycno(car)>0) {
				return "1";
			}else {
				return "0";
			}
		}
		
		//查询所有车辆品牌
		@ResponseBody
		@RequestMapping("/queryCarbrand")
		public List<Carbrand> queryCarbrand(){
			return ser.queryCarbrand();
		}
		//根据车辆品牌查询车辆型号
		@ResponseBody
		@RequestMapping("/querymotoBycbno")
		public List<Motorcycle> querymotoBycbno(Integer cbno){
			return ser.querymotoBycbno(cbno);
		}
		
		//查询车辆归属
		@ResponseBody
		@RequestMapping("/queryAllcarbelong")
		public List<Carbelong> queryAllcarbelong(){
			return ser.queryAllcarbelong();
		}
		
		//查询发动机品牌
		@ResponseBody
		@RequestMapping("/queryAllMaintenance")
		public List<Maintenance> queryAllMaintenance(){
			return ser.queryAllMaintenance();
		}
		//查询燃油类别
		@ResponseBody
		@RequestMapping("/queryAllFuel")
		public List<Fuel> queryAllFuel(){
			return ser.queryAllFuel();
		}
		
		//根据客户编号添加相关车辆
				@ResponseBody
				@RequestMapping("/updateCarBylicen")
				public String updateCarBylicen(@RequestBody Cardata car) {
					if(ser.updateCarBylicen(car)>0) {
						return "1";
					}else {
						return "0";
					}
				}
				//根据主键删除客户信息以及他拥有的车辆信息
				@ResponseBody
				@RequestMapping("/deleteCarBylicen")
				public String deleteCarBylicen(String licen) {
					if(ser.deleteCarBylicen(licen)>0) {
						return "1";
					}else {
						return "0";
					}
				}
				//增加客户和车辆
				@ResponseBody
				@RequestMapping("/addCusandCar")
				public String addCusandCar(@RequestBody Customer cus) {
					cus.getCars().get(0).setCno(cus.getCno());
					System.out.println(cus.getCars().get(0).getCno());
					int c = ser.addcarBycno(cus.getCars().get(0));
					if(c>0) {
						int a = ser.addCus(cus);
						return "1";
					}else {
						return "0";
					}
				}
				//增加客户类别
				@ResponseBody
				@RequestMapping("/addCustype")
				public String addCustype(@RequestBody CustomerType ctype) {
					int c = ser.addCustype(ctype);
					if(c>0) {
						return "1";
					}else {
						return "0";
					}
				}
				//修改客户类别
				@ResponseBody
				@RequestMapping("/updateCustype")
				public String updateCustype(@RequestBody CustomerType ctype) {
					int c = ser.updateCustype(ctype);
					if(c>0) {
						return "1";
					}else {
						return "0";
					}
				}
				//修改客户类别
				@ResponseBody
				@RequestMapping("/deleteCustype")
				public String deleteCustype(String ctno) {
					int c = ser.deleteCustype(ctno);
					if(c>0) {
						return "1";
					}else {
						return "0";
					}
				}
		
}
