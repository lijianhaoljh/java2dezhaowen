package com.accp.service;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Bills;
import com.accp.domain.BillsExample;
import com.accp.mapper.BillsMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class BillsService {

	@Autowired
	BillsMapper billsMapper;
	
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
			bno=Integer.valueOf(b.get(0).getBid().substring(7));
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
}
