package com.accp.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.AccountExample;
import com.accp.domain.BillsExample;
import com.accp.domain.CommodityInfoExample;
import com.accp.mapper.AccountMapper;
import com.accp.mapper.BillsMapper;
import com.accp.mapper.CommodityInfoMapper;

@Service
@Transactional
public class HomeService {

	@Autowired
	BillsMapper bmapper;
	@Autowired
	AccountMapper amapper;
	@Autowired
	CommodityInfoMapper cmapper;
	
	public int querytodayCount() {
		return bmapper.querytodayCount();
	}

	public int querytodayPay() {
		return amapper.querytodayPay();
	}
	
	public int queryworkcar() {
		BillsExample ex = new BillsExample();
		ex.createCriteria().andCompletiontimeIsNull();
		return bmapper.countByExample(ex);
	}

	public int queryagainwork() {
		BillsExample ex = new BillsExample();
		ex.createCriteria().andReworknumNotEqualTo(0).andQualifiedNotEqualTo(0);
		return bmapper.countByExample(ex);
	}

	public int queryincar() {
		return bmapper.queryincar();
	}

	public int queryoutcar() {
		return bmapper.queryoutcar();
	}

	
	
	public int querycashcounttoday() {
		return amapper.querycashcounttoday();
	}

	public String querycashtotaltoday() {
		return amapper.querycashtotaltoday();
	}

	public int querynopaycounttoday() {
		return amapper.querynopaycounttoday();
	}
	
	public String querynopaytotalmoneytoday() {
		return amapper.querynopaytotalmoneytoday();
	}

	public int querysellcount() {
		return bmapper.countByExample(null);
	}

	public int querystockcount() {
		return cmapper.countByExample(null);
	}

	public String querycashtotal() {
		return amapper.querycashtotal();
	}

	public String querywechattotal() {
		return amapper.querywechattotal();
	}
	
	public int querynopaycount() {
		AccountExample ex = new AccountExample();
		ex.createCriteria().andAstateEqualTo(1);
		return amapper.countByExample(ex);
	}
	
}
