package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.PaymentMethod;
import com.accp.service.PaymentMethodService;

@RestController
@RequestMapping("/pm")
public class PaymentMethodController {
	@Autowired
	PaymentMethodService paymentMethodService;
	
	@GetMapping("/findPaymentMethod")
	public List<PaymentMethod> findPaymentMethod(){
		return paymentMethodService.findPaymentMethod();
	}
	
}
