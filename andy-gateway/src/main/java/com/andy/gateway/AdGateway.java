package com.andy.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class AdGateway {
	public static void main(String[] args) {
		SpringApplication.run(AdGateway.class);
	}
}
