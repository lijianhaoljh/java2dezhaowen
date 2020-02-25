package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Maintenance;
import com.accp.service.MaintenanceService;

@RestController
@RequestMapping("/mainenance")
public class MaintenanceController {
	@Autowired
	MaintenanceService maintenanceService;
	
	@GetMapping("/findMaintenances")
	public List<Maintenance> findMaintenances(){
		return maintenanceService.findMaintenances();
	}
}
