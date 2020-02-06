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
		
		/**
		 * 查询发动机
		 * @return
		 */
		public List<Maintenance> query() {
			return zMaintenance.selectByExample(null);
		}
		
		/**
		 * 新增发动机
		 */
		public int addfdjtwo(Maintenance MaintenanceAdd) {
			return zMaintenance.insert(MaintenanceAdd);
		}
		
		/**
		 * 修改发动机
		 */
		public int updafdjtwo(Maintenance MaintenanceAdd) {
			return zMaintenance.updateByPrimaryKey(MaintenanceAdd);
		}
		
		/**
		 * 删除发动机
		 */
		public int deletetwo(Integer mids) {
			return zMaintenance.deleteByPrimaryKey(mids);
		}
		
		
		
}

