package com.itmayiedu.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
//@EnableEurekaClient
//@EnableFeignClients
//@ComponentScan(basePackages= {"com.itmayiedu.controller","com.itmayiedu.service","com.itmayiedu.app"})
//@EnableAutoConfiguration

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Feignapp {
	public static void main(String[] args) {
		SpringApplication.run(Feignapp.class, args);
	}
}
