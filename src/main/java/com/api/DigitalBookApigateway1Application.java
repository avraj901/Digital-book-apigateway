package com.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class DigitalBookApigateway1Application {

	public static void main(String[] args) {
		SpringApplication.run(DigitalBookApigateway1Application.class, args);
	}

}
