package com.accp.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Account;
import com.accp.mapper.AccountMapper;

@Service
@Transactional
public class AccountService {

	@Autowired
	AccountMapper accountMapper;
	
	//查询结算单
	public List<Account> findAccounts(String startTime,String endTime,String bid,Integer bstate,String cdlicense,String cno,String pno,Integer btno){
		return accountMapper.findAccounts(startTime, endTime, bid, bstate, cdlicense, cno, pno, btno);
	}
	
}
