package com.accp.service;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import com.accp.domain.Account;
import com.accp.domain.AccountExample;
import com.accp.domain.Bills;
import com.accp.domain.BillsExample;
import com.accp.domain.Invoice;
import com.accp.domain.InvoiceExample;
import com.accp.domain.InvoiceType;
import com.accp.mapper.AccountMapper;
import com.accp.mapper.BillsMapper;
import com.accp.mapper.InvoiceMapper;
import com.accp.mapper.InvoiceTypeMapper;

@Service
@Transactional
public class AccountService {

	@Autowired
	AccountMapper accountMapper;
	@Autowired
	InvoiceTypeMapper itmapper;
	@Autowired
	BillsMapper bmapper;
	@Autowired
	InvoiceMapper imapper;
	
	//查询结算单
	public List<Account> findAccounts(String startTime,String endTime,String bid,Integer bstate,String cdlicense,String cno,String pno,Integer btno){
		return accountMapper.findAccounts(startTime, endTime, bid, bstate, cdlicense, cno, pno, btno);
	}
	
	//查询所有发票种类
	public List<InvoiceType> queryAllInvoiceType(){
		return itmapper.selectByExample(null);
	}
	//收银
	public int shouyin(Account addAccount){
		Date time = new Date();
		addAccount.setAtime(time);
		AccountExample ex = new AccountExample();
		ex.createCriteria().andBidEqualTo(addAccount.getBid());
		int a = accountMapper.updateByExample(addAccount, ex);
		
		Bills bill = bmapper.selectByPrimaryKey(addAccount.getBid());
		bill.setBstate(3);
		int b = bmapper.updateByPrimaryKey(bill);
		
		if(addAccount.getInvid()=="") {
			return b;
		}else {
			Invoice invo = new Invoice();
			invo.setInvid(addAccount.getInvid());
			invo.setInvdate(addAccount.getInvdate());
			invo.setInvmoney(Float.valueOf(addAccount.getBillmoney()));
			int c = imapper.insert(invo);
		}
		
		return b;
	}
	
}
