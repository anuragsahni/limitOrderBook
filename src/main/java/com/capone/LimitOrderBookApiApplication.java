package com.capone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.capone" })
public class LimitOrderBookApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimitOrderBookApiApplication.class, args);
	}

}