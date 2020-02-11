package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Maintenance;
import com.accp.service.ZMaintenanceService;

@RestController
@RequestMapping("/MaintenanceRest")
public class ZMaintenanceController {
		@Autowired
		ZMaintenanceService zMaintenanceService;
		
		@GetMapping
		public List<Maintenance> query() {
			return zMaintenanceService.query();
		}
		
		@PostMapping(value = "/add")
		public int addfdjtwo(@RequestBody Maintenance MaintenanceAdd) {
			return zMaintenanceService.addfdjtwo(MaintenanceAdd);
		}
		
		@PutMapping(value = "/upda")
		public int updafdjtwo(@RequestBody Maintenance MaintenanceAdd) {
			return zMaintenanceService.updafdjtwo(MaintenanceAdd);
		}
		
		@PostMapping(value = "/dele")
		public int deletetwo(Integer mids) {
			return zMaintenanceService.deletetwo(mids);
		}
}