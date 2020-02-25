package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Account;
import com.accp.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {
	@Autowired
	AccountService accountService;
	
	@GetMapping("/findAccounts")
	public List<Account> findAccounts(String startTime,String endTime,String bid,Integer bstate,String cdlicense,String cno,String pno,Integer btno){
		return accountService.findAccounts(startTime, endTime, bid, bstate, cdlicense, cno, pno, btno);
	}
	
	
}
