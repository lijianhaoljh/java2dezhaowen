package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.ServiceItem;
import com.accp.service.ServiceItemService;

@RestController
@RequestMapping("/service")
public class ServiceItemController {

	@Autowired
	ServiceItemService serviceItemService;
	
	@GetMapping("/findServiceItem")
	public List<ServiceItem> findServiceItem(Integer mid){
		return serviceItemService.findServiceItem(mid);
	}
	
}
