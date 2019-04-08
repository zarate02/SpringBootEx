package com.wintech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class OraExApplication {

	public static void main(String[] args) {
		SpringApplication.run(OraExApplication.class, args);
	}

}
