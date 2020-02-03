package com.accp.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Maintenance;
import com.accp.domain.MaintenanceExample;
import com.accp.domain.MaintenanceExample.Criteria;
import com.accp.mapper.MaintenanceMapper;

@Service
@Transactional
public class ZMaintenanceService {
		@Autowired
		MaintenanceMapper zMaintenance;
		
		public List<Maintenance> query() {
			MaintenanceExample example = new MaintenanceExample();
			example.createCriteria().andParentidEqualTo(2);
			return zMaintenance.selectByExample(example);
		}
		
		
}

