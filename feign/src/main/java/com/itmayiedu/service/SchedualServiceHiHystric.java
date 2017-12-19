package com.itmayiedu.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements FeignService{

//	public String hi(String name) {
//		return "feign...name" + name + " 系统错误，调用接口失败了！";
//	}

	public String sayHiFromClientOne(String name) {
		return "feign...name" + name + " 系统错误，调用接口失败了！";

	}
	
}
