package com.hemaly.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class NumberVerifyApplication {

	public static void main(String[] args) {
		SpringApplication.run(NumberVerifyApplication.class, args);
		System.out.println("Hello");
	}
}
