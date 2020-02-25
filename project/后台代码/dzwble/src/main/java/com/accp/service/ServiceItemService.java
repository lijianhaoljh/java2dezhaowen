package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.ServiceItem;
import com.accp.domain.ServiceItemExample;
import com.accp.mapper.ServiceItemMapper;

@Service
@Transactional
public class ServiceItemService {
	
	@Autowired
	ServiceItemMapper serviceItemMapper;
	
	public List<ServiceItem> findServiceItem(Integer mid){
		ServiceItemExample example=new ServiceItemExample();
		example.createCriteria().andMidEqualTo(mid);
		return serviceItemMapper.selectByExample(example);
	}
	
}
