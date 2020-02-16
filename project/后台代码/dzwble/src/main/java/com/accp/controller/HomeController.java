package com.accp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.service.HomeService;

@RestController
@RequestMapping("/hom")
public class HomeController {

	
	@Autowired
	HomeService ser;
	
	@GetMapping(value="/querytodayCount")
	public String querytodayCount() {
		int a  = ser.querytodayCount();
		return String.valueOf(a);
	}

	@GetMapping(value="/querytodayPay")
	public String querytodayPay() {
		int a  = ser.querytodayPay();
		return String.valueOf(a);
	}

	@GetMapping(value="/queryworkcar")
	public String queryworkcar() {
		int a  = ser.queryworkcar();
		return String.valueOf(a);
	}

	@GetMapping(value="/queryagainwork")
	public String queryagainwork() {
		int a  = ser.queryagainwork();
		return String.valueOf(a);
	}

	@GetMapping(value="/queryinmaintain")
	public String queryincar() {
		int a  = ser.queryincar();
		return String.valueOf(a);
	}

	@GetMapping(value="/queryoutcar")
	public String queryoutcar() {
		int a  = ser.queryoutcar();
		return String.valueOf(a);
	}

	@GetMapping(value="/querycashcounttoday")
	public String querycashcounttoday() {
		int a  = ser.querycashcounttoday();
		return String.valueOf(a);
	}

	@GetMapping(value="/querycashtotaltoday")
	public String querycashtotaltoday() {
		return ser.querycashtotaltoday();
	}

	@GetMapping(value="/querynopaycounttoday")
	public String querynopaycounttoday() {
		int a  = ser.querynopaycounttoday();
		return String.valueOf(a);
	}
	
	@GetMapping(value="/querynopaytotalmoneytoday")
	public String querynopaytotalmoneytoday() {
		return ser.querynopaytotalmoneytoday();
	}

	@GetMapping(value="/querysellcount")
	public String querysellcount() {
		int a  = ser.querysellcount();
		return String.valueOf(a);
	}

	@GetMapping(value="/querystockcount")
	public String querystockcount() {
		int a  = ser.querystockcount();
		return String.valueOf(a);
	}

	@GetMapping(value="/querycashtotal")
	public String querycashtotal() {
		return ser.querycashtotal();
	}

	@GetMapping(value="/querywechattotal")
	public String querywechattotal() {
		return ser.querywechattotal();
	}
	@GetMapping(value="/querynopaycount")
	public String querynopaycount() {
		int a  = ser.querynopaycount();
		return String.valueOf(a);
	}
}
