package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.PaymentMethod;
import com.accp.mapper.PaymentMethodMapper;

@Service
@Transactional
public class PaymentMethodService {
	@Autowired
	PaymentMethodMapper paymentMethodMapper;
	
	public List<PaymentMethod> findPaymentMethod(){
		return paymentMethodMapper.selectByExample(null);
	}
	
}
