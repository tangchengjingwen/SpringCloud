package com.itmayiedu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@EnableEurekaClient
public class ServiceHelloApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiceHelloApplication.class, args);
	}
	@Value("${server.port}")
	private String port;
	
	/**
	 * 提供服务
	 * @param name
	 * @return
	 */
	@RequestMapping("/hello")
	public String hello(String name) {
		return name + ",hello from " + port;
	}
	
	
	
	
	
	
	
	
}
