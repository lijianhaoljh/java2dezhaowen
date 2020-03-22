package com.accp.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import com.accp.domain.Account;
import com.accp.domain.AccountExample;
import com.accp.domain.Addition;
import com.accp.domain.AdditionExample;
import com.accp.domain.Bills;
import com.accp.domain.BillsExample;
import com.accp.domain.BusinessTypes;
import com.accp.domain.CommodityInfo;
import com.accp.domain.CommodityUnit;
import com.accp.domain.Customer;
import com.accp.domain.CustomerExample;
import com.accp.domain.DMaintenance;
import com.accp.domain.DMaintenanceExample;
import com.accp.domain.MaintainBill;
import com.accp.domain.MaintainBillExample;
import com.accp.domain.People;
import com.accp.domain.PeopleExample;
import com.accp.domain.PriceClass;
import com.accp.domain.Requisition;
import com.accp.domain.RequisitionExample;
import com.accp.domain.RescueBill;
import com.accp.domain.RescueBillExample;
import com.accp.domain.ServiceItem;
import com.accp.domain.ServiceItemExample;
import com.accp.domain.Team;
import com.accp.mapper.AccountMapper;
import com.accp.mapper.AdditionMapper;
import com.accp.mapper.BillsMapper;
import com.accp.mapper.BusinessTypesMapper;
import com.accp.mapper.CommodityInfoMapper;
import com.accp.mapper.CommodityUnitMapper;
import com.accp.mapper.CustomerMapper;
import com.accp.mapper.DMaintenanceMapper;
import com.accp.mapper.MaintainBillMapper;
import com.accp.mapper.PeopleMapper;
import com.accp.mapper.PriceClassMapper;
import com.accp.mapper.RequisitionMapper;
import com.accp.mapper.RescueBillMapper;
import com.accp.mapper.ServiceItemMapper;
import com.accp.mapper.TeamMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class BillsService {

	@Autowired
	BillsMapper billsMapper;
	@Autowired
	BusinessTypesMapper businessTypesMapper;
	@Autowired
	PeopleMapper peopleMapper;
	@Autowired
	CustomerMapper customerMapper;
	@Autowired
	MaintainBillMapper maintainBillMapper;
	@Autowired
	RescueBillMapper rescueBillMapper;
	@Autowired
	AccountMapper accountMapper;
	@Autowired
	RequisitionMapper requisitionMapper;
	@Autowired 
	DMaintenanceMapper dMaintenanceMapper;
	@Autowired
	AdditionMapper additionMapper;
	@Autowired
	PriceClassMapper priceClassMapper;
	@Autowired
	TeamMapper teamMapper;
	@Autowired
	ServiceItemMapper serviceItemMapper;
	@Autowired
	CommodityInfoMapper commodityInfoMapper;
	@Autowired
	CommodityUnitMapper commodityUnitMapper;
	public Integer completed(Bills bills){
		bills.setBstate(2);
		return billsMapper.updateByPrimaryKey(bills);
	}
	public Integer verifyBill(String bid) {
		BillsExample example=new BillsExample();
		example.createCriteria().andBidEqualTo(bid);
		return billsMapper.countByExample(example);
	}
	public Integer pickcarOverBill(Bills bills) {
		bills.setBstate(1);
		return billsMapper.updateByPrimaryKey(bills);
	}
	public Bills openBills(String bid) {
		Bills bills=billsMapper.findOpenBills(bid);
		MaintainBillExample ex1=new MaintainBillExample();
		ex1.createCriteria().andBidEqualTo(bid);
		List<MaintainBill> m=maintainBillMapper.selectByExample(ex1);
		if(m!=null&&m.size()>0) {
			bills.setM(m.get(0));
		}else {
			bills.setM(new MaintainBill());
		}
		
		RescueBillExample ex2=new RescueBillExample();
		ex2.createCriteria().andBidEqualTo(bid);
		List<RescueBill> r=rescueBillMapper.selectByExample(ex2);
		if(r!=null&&r.size()>0) {
			bills.setR(r.get(0));
		}else {
			bills.setR(new RescueBill());
		}
		AccountExample ex3=new AccountExample();
		ex3.createCriteria().andBidEqualTo(bid);
		List<Account> a=accountMapper.selectByExample(ex3);
		if(a!=null&&a.size()>0) {
			bills.setAccount(a.get(0));
		}else {
			bills.setAccount(new Account());
		}
		
		bills.setPick(peopleMapper.selectByPrimaryKey(bills.getPickcar()));
		if(bills.getPick()==null) {
			bills.setPick(new People());
		}
		bills.setPeople(peopleMapper.selectByPrimaryKey(bills.getPno()));
		if(bills.getPeople()==null) {
			bills.setPeople(new People());
		}
		AdditionExample ex4=new AdditionExample();
		ex4.createCriteria().andBidEqualTo(bid);
		 List<Addition> additions=additionMapper.selectByExample(ex4);
		 if(additions!=null&&additions.size()>0) {
			 for(Addition ad:additions) {
				 ad.setPc(priceClassMapper.selectByPrimaryKey(ad.getPcid()));
			 }
		 }
		 bills.setAddtions(additions);
		 
		 RequisitionExample ex5=new RequisitionExample();
		 ex5.createCriteria().andBidEqualTo(bid);
		 List<Requisition> requisitions=requisitionMapper.selectByExample(ex5);
		 if(requisitions!=null&&requisitions.size()>0) {
			 for(Requisition re:requisitions) {
				 CommodityInfo c=commodityInfoMapper.selectByPrimaryKey(re.getCno());
				 re.setCname(c.getCname());
				 CommodityUnit cu=commodityUnitMapper.selectByPrimaryKey(c.getCuid());
				 re.setCuname(c.getCuname());
				 re.setPeo(peopleMapper.selectByPrimaryKey(re.getPno()));
				 if(re.getPeo()==null) {
						re.setPeo(new People());
					}
				 re.setPick(peopleMapper.selectByPrimaryKey(re.getServicepeo()));
				 if(re.getPick()==null) {
						re.setPick(new People());
				}
				 re.setPc(priceClassMapper.selectByPrimaryKey(re.getPcid()));
				 if(re.getPc()==null) {
					 re.setPc(new PriceClass());
				 }
			 }
		 }
		 bills.setRequisition(requisitions);
		 
		 DMaintenanceExample ex6=new DMaintenanceExample();
		 ex6.createCriteria().andBidEqualTo(bid);
		 List<DMaintenance> dMaintenances=dMaintenanceMapper.selectByExample(ex6);
		 if(dMaintenances!=null&&dMaintenances.size()>0) {
			 for(DMaintenance dm:dMaintenances) {
				 ServiceItem s=serviceItemMapper.selectByPrimaryKey(dm.getCno());
				 dm.setSidname(s.getSidname());
				 dm.setSidno(s.getSidno());
				 dm.setPeo(peopleMapper.selectByPrimaryKey(dm.getPno()));
				 if(dm.getPeo()==null) {
						dm.setPeo(new People());
					}
				 dm.setPick(peopleMapper.selectByPrimaryKey(dm.getServicepeo()));
				 if(dm.getPick()==null) {
						dm.setPick(new People());
				}
				 dm.setPc(priceClassMapper.selectByPrimaryKey(dm.getPcid()));
				 if(dm.getPc()==null) {
					 dm.setPc(new PriceClass());
				 }
				 dm.setTeam(teamMapper.selectByPrimaryKey(dm.getTid()));
				 if(dm.getTeam()==null) {
					 dm.setTeam(new Team());
				 }
			 }
		 }
		 bills.setMaintenance(dMaintenances);
		return bills;
	}
	
	public Integer saveBills(Bills bills,Integer state) {
		BillsExample example=new BillsExample();
		example.createCriteria().andBidEqualTo(bills.getBid());
		Integer billsCount=billsMapper.countByExample(example);
		int count=0;
		if(billsCount<1) {
			//添加
			addBills(bills,state);
		}else {
			//修改
			count=billsMapper.updateByPrimaryKey(bills);
			MaintainBillExample ex1=new MaintainBillExample();
			ex1.createCriteria().andBidEqualTo(bills.getBid());
			maintainBillMapper.updateByExample(bills.getM(), ex1);
			RescueBillExample ex2=new RescueBillExample();
			ex2.createCriteria().andBidEqualTo(bills.getBid());
			AccountExample ex3=new AccountExample();
			ex3.createCriteria().andBidEqualTo(bills.getBid());
			accountMapper.updateByExample(bills.getAccount(), ex3);
			
			RequisitionExample ex4=new RequisitionExample();
			ex4.createCriteria().andBidEqualTo(bills.getBid());
			requisitionMapper.deleteByExample(ex4);
			for(Requisition r: bills.getRequisition()) {
				r.setBid(bills.getBid());
				requisitionMapper.insert(r);
			}
			DMaintenanceExample ex5=new DMaintenanceExample();
			ex5.createCriteria().andBidEqualTo(bills.getBid());
			dMaintenanceMapper.deleteByExample(ex5);
			for(DMaintenance m:bills.getMaintenance()) {
				m.setBid(bills.getBid());
				dMaintenanceMapper.insert(m);
			}
			AdditionExample ex6=new AdditionExample();
			ex6.createCriteria().andBidEqualTo(bills.getBid());
			additionMapper.deleteByExample(ex6);
			for(Addition a:bills.getAddtions()) {
				a.setBid(bills.getBid());
				additionMapper.insert(a);
			}
		}
		return count;
	}
	
	public Integer addBills(Bills bills,Integer state) {
		Calendar now = Calendar.getInstance();
		Integer year=now.get(Calendar.YEAR);
		Integer month=now.get(Calendar.MONTH) + 1;
		Integer day=now.get(Calendar.DAY_OF_MONTH);
		Integer h=now.get(Calendar.HOUR_OF_DAY);
		Integer m1=now.get(Calendar.MINUTE);
		Integer s=now.get(Calendar.SECOND);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			bills.setExpectedtime(sdf.parse(year+"-"+month+"-"+day+" "+(h+2)+":"+m1+":"+s));
			bills.setOrdertime(sdf.parse(year+"-"+month+"-"+day+" "+h+":"+m1+":"+s));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int count=billsMapper.insert(bills);
		if(state==0) {
			bills.getM().setBid(bills.getBid());
			if(bills.getM()!=null) {
			maintainBillMapper.insert(bills.getM());
			}
		}else {
			bills.getR().setBid(bills.getBid());
			if(bills.getR()!=null) {
				rescueBillMapper.insert(bills.getR());
			}
		}
		bills.getAccount().setBid(bills.getBid());
		accountMapper.insert(bills.getAccount());
		
		for(Requisition r: bills.getRequisition()) {
			r.setBid(bills.getBid());
			requisitionMapper.insert(r);
		}
		for(DMaintenance m:bills.getMaintenance()) {
			m.setBid(bills.getBid());
			dMaintenanceMapper.insert(m);
		}
		for(Addition a:bills.getAddtions()) {
			a.setBid(bills.getBid());
			additionMapper.insert(a);
		}
		
		return count;
	}
	
	public PageInfo<Bills> findBills(Integer pageNum,Integer pageSize){
		Page<Bills> page=PageHelper.startPage(pageNum, pageSize);
		billsMapper.findBills();
		return page.toPageInfo();
	}
	
	//查询维修历史
	public PageInfo<Bills> findByCdlicenseOne(Integer pageNum,Integer pageSize,String cdlicense){
		Page<Bills> page=PageHelper.startPage(pageNum, pageSize);
		billsMapper.findByCdlicenseOne(cdlicense);
		return page.toPageInfo();
	}
	
	//查训维修项目
	public PageInfo<Bills> findByCdlicenseTwo(Integer pageNum,Integer pageSize,String cdlicense){
		Page<Bills> page=PageHelper.startPage(pageNum, pageSize);
		billsMapper.findByCdlicenseTwo(cdlicense);
		return page.toPageInfo();
	}
	
	//查询领料情况
	public PageInfo<Bills> findByCdlicenseThree(Integer pageNum,Integer pageSize,String cdlicense){
		Page<Bills> page=PageHelper.startPage(pageNum, pageSize);
		billsMapper.findByCdlicenseThree(cdlicense);
		return page.toPageInfo();
	}

	//维修救援开单
	public String findNewBid() {
		BillsExample example=new BillsExample();
		example.setOrderByClause("bid desc");
		String bid=null;
		Integer bno=null;
		Calendar cal = Calendar.getInstance();
		Integer year=cal.get(cal.YEAR);
		List<Bills> b=billsMapper.selectByExample(example);
		if(b!=null&&b.size()>0) {
			//表内有单据
			bno=Integer.valueOf(b.get(0).getBid().substring(7))+1;
			if(bno.toString().length()==1) {
				//0~9
				bid="dzw"+year+"00"+bno.toString();
			}else if(bno.toString().length()==2){
				//10~99
				bid="dzw"+year+"0"+bno.toString();
			}else if(bno.toString().length()>2) {
				//大于等于100
				bid="dzw"+year+bno.toString();
			}
		}else {
			//表内无单据
			bid="dzw"+year+"001";
		}
		return bid;
	}
	
	//查询车辆是否还未竣工
	public Integer findCardata(String cdlicense) {
		BillsExample example=new BillsExample();
		example.createCriteria().andCompletiontimeIsNull().andCdlicenseEqualTo(cdlicense);
		return billsMapper.countByExample(example);
	}
	//查询竣工检验单据
	public List<Bills> findCompletions(String startTime,String endTime,String bid,Integer bstate){
		return billsMapper.findCompletions(startTime, endTime, bid, bstate);
	}
	
	//查询全部服务顾问
	public List<People> findPnos(){
		PeopleExample ex = new PeopleExample();
		ex.createCriteria().andDimissionEqualTo(0).andPtidEqualTo(1);
		return peopleMapper.selectByExample(ex);
	}
	//查询客户
	public List<Customer> findCnos(){
		CustomerExample ex = new CustomerExample();
		ex.createCriteria().andRemark3EqualTo("0");
		return customerMapper.selectByExample(ex);
	}
	//查询业务类型
	public List<BusinessTypes> findbts(){
		return businessTypesMapper.selectByExample(null);
	}
}