package com.BrinkerInc.BrinkerIncOrderService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BrinkerIncOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BrinkerIncOrderServiceApplication.class, args);
	}
	
	
	@Bean
	@LoadBalanced
	public RestTemplate getTemplate() {
		
		return new RestTemplate();
	}

}
