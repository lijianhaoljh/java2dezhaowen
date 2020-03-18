package com.accp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.ReworkReason;
import com.accp.service.ReworkReasonService;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/rework")
public class ReworkReasonController {
	
	@Autowired
	ReworkReasonService reworkReasonService;
	
	/**
	 * 分页查询返工
	 */
	@PostMapping("/findPage")
	public PageInfo<ReworkReason> findReworkReasonPage(@RequestBody ReworkReason r){
		return reworkReasonService.findReworkReasonPage(r.getPageSize(),r.getPageNum(),r.getRname());
	}
	/**
	 * 添加返工
	 */
	@PostMapping("/addRework")
	public String addReworkReason(@RequestBody ReworkReason r) {
		return "result:"+reworkReasonService.addReworkReason(r);
	}
	/**
	 * 删除返工
	 */
	@GetMapping("/delRework")
	public String delReworkReason(Integer id) {
		return "result:"+reworkReasonService.delReworkReason(id);
	}
	/**
	 * 修改返工
	 */
	@PostMapping("/updateRework")
	public String upReworkReason(@RequestBody ReworkReason r) {
		return "result:"+reworkReasonService.upReworkReason(r);
	}
}
