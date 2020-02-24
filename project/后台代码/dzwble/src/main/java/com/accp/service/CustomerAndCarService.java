package com.accp.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Bills;
import com.accp.domain.Carbelong;
import com.accp.domain.Carbrand;
import com.accp.domain.Cardata;
import com.accp.domain.CardataExample;
import com.accp.domain.Carkeep;
import com.accp.domain.CarkeepExample;
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
import com.accp.mapper.BillsMapper;
import com.accp.mapper.CarbelongMapper;
import com.accp.mapper.CarbrandMapper;
import com.accp.mapper.CardataMapper;
import com.accp.mapper.CarkeepMapper;
import com.accp.mapper.CustomerMapper;
import com.accp.mapper.CustomerTypeMapper;
import com.accp.mapper.FuelMapper;
import com.accp.mapper.InsuranceMapper;
import com.accp.mapper.MaintenanceMapper;
import com.accp.mapper.MechanismMapper;
import com.accp.mapper.MotorcycleMapper;
import com.accp.mapper.PriceTypeMapper;
import com.accp.mapper.StaffMapper;

@Service
@Transactional
public class CustomerAndCarService {
	
	@Autowired
	BillsMapper bmapper;
	@Autowired
	CustomerMapper cusmapper;
	@Autowired
	CardataMapper cardamapper;
	@Autowired
	InsuranceMapper insurmapper;
	@Autowired
	MechanismMapper msmapper;
	@Autowired
	StaffMapper stamapper;
	@Autowired
	PriceTypeMapper ptmapper;
	@Autowired
	CustomerTypeMapper ctmapper;
	@Autowired
	CarbrandMapper cbmapper;
	@Autowired
	MotorcycleMapper momapper;
	@Autowired
	CarbelongMapper carbmapper;
	@Autowired
	MaintenanceMapper maintemapper;
	@Autowired
	FuelMapper fmapper;
	@Autowired
	CarkeepMapper ckmapper;
	
	//查询全部客户模糊查询
	public List<Customer> queryAll(String cname){
		return cusmapper.queryCusAll(cname);
	}
	//查询全部客户
	public List<Customer> queryAll(){
		return cusmapper.selectByExample(null);
	}
	//根据客户编号查询拥有汽车
	public List<Cardata> queryCarBycno(String cno){
		return cardamapper.queryCarBycno(cno);
	}
	//查询所有汽车
	public List<Cardata> queryCars(String cddriver){
		return cardamapper.queryCars(cddriver);
	}
	//查询保险公司
	public List<Insurance> queryInsurance(){
		return insurmapper.selectByExample(null);
	}
	//添加客户
	public int addCus(Customer cus) {
		cus.setRemark3("0");
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = formatter.format(currentTime);
		cus.setCreatdate(dateString);
		return cusmapper.insert(cus);
	}
	//查询组织机构父级ID为1的
	public List<Mechanism> queryParentideq1(){
		MechanismExample ex = new MechanismExample();
		ex.createCriteria().andParentidEqualTo(1);
		return msmapper.selectByExample(ex);
	}
	//根据组织机构父级ID查询机构
	public List<Mechanism> queryParentidnot1(Integer parentid){
		MechanismExample ex = new MechanismExample();
		ex.createCriteria().andParentidEqualTo(parentid);
		return msmapper.selectByExample(ex);
	}
	//根据组织机构编号查询职工
	public List<Staff> queryPeopleByMid(String pno,Integer mid){
		return stamapper.queryPeopleByMid(pno,mid);
	}
	//查询价格类型
	public List<PriceType> queryPriceType(){
		return ptmapper.selectByExample(null);
	}
	//查询客户分类
	public List<CustomerType> queryOneToMore(){
		return ctmapper.queryOneToMore();
	}
	//根据主键删除客户信息以及他拥有的车辆信息
	public int deleteCusAndCarByCno(String cno) {
		
		Customer cus = cusmapper.selectByPrimaryKey(cno);
		cus.setRemark3("1");
		int a = cusmapper.updateByPrimaryKey(cus);
		
		CardataExample ex = new CardataExample();
		ex.createCriteria().andCnoEqualTo(cno);
		List<Cardata> list = cardamapper.selectByExample(ex);
		for(int i = 0; i < list.size(); i++) {
			list.get(i).setRemark1("1");
			int b = cardamapper.updateByPrimaryKey(list.get(i));
		}
		
		return a;
	}
	//根据客户编号修改客户信息
	public int updateCusByCno(Customer cus) {
		return cusmapper.updateByPrimaryKey(cus);
	}
	//根据客户编号添加相关车辆
	public int addcarBycno(Cardata car) {
		car.setRemark1("0");
		return cardamapper.insert(car);
	}
	//查询所有车辆品牌
	public List<Carbrand> queryCarbrand(){
		return cbmapper.selectByExample(null);
	}
	//根据车辆品牌查询车辆型号
	public List<Motorcycle> querymotoBycbno(Integer cbno){
		return momapper.queryByCbno(cbno);
	}
	//查询车辆归属
	public List<Carbelong> queryAllcarbelong(){
		return carbmapper.selectByExample(null);
	}
	//查询发动机品牌
	public List<Maintenance> queryAllMaintenance(){
		return maintemapper.selectByExample(null);
	}
	//查询燃油类别
	public List<Fuel> queryAllFuel(){
		return fmapper.selectByExample(null);
	}
	//根据车牌号修改车辆信息
	public int updateCarBylicen(Cardata car) {
		return cardamapper.updateByPrimaryKey(car);
	}
	//根据车牌号删除车资料
	public int deleteCarBylicen(String licen) {
		return cardamapper.deleteByPrimaryKey(licen);
	}
	//添加客户类别
	public int addCustype(CustomerType ctype) {
		return ctmapper.insert(ctype);
	}
	//修改客户类别
	public int updateCustype(CustomerType ctype) {
		return ctmapper.updateByPrimaryKey(ctype);
	}
	//删除客户类别
	public int deleteCustype(String ctno) {
		return ctmapper.deleteByPrimaryKey(ctno);
	}
	//根据客户编号查新单据号
	public List<Bills> queryBillBycno(String cno){
		return bmapper.queryBillBycno(cno);
	}
	//根据车牌编号查新单据号
		public List<Bills> queryBillBycdlicense(String cdlicense){
			return bmapper.queryBillBycdlicense(cdlicense);
		}
	//根据客户编号查询客户
	public Customer queryCusByCno(String cno) {
		return cusmapper.queryCusByCno(cno);
	}
	//根据车牌删除
	public int deleCar(String cdlicense) {
		Cardata car = cardamapper.selectByPrimaryKey(cdlicense);
		car.setRemark1("1");
		return cardamapper.updateByPrimaryKey(car);
	}
	//根据车牌查询保养记录
	public List<Carkeep> queryKeepBycdlicense(String cdlicense){
		CarkeepExample ex = new CarkeepExample();
		ex.createCriteria().andCdlicenseEqualTo(cdlicense);
		return ckmapper.selectByExample(ex);
	}
	//添加车辆保养记录
	public int addCarkeep(Carkeep ck) {
		return ckmapper.insert(ck);
	}
	//修改车辆保养记录
	public int upCarkeep(Carkeep ck) {
		return ckmapper.updateByPrimaryKey(ck);
	}
	//删除车辆保养记录
	public int deleCarkeep(Integer ckid) {
		return ckmapper.deleteByPrimaryKey(ckid);
	}
}
