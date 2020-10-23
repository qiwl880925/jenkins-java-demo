package com.liyang.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestContrller {
	
	@RequestMapping("")
	public String main() {
		return "hello\t"+new Date().getTime();
	}

}
