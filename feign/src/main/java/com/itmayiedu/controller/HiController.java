package com.itmayiedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.itmayiedu.service.FeignService;

@RestController
public class HiController {
	@Autowired
	private FeignService feighService;
	
	@RequestMapping(value = "/hi",method = RequestMethod.GET)	
	public String hi( String name) {
//		return feighService.hi(name);
		return feighService.sayHiFromClientOne(name);
	}
}
