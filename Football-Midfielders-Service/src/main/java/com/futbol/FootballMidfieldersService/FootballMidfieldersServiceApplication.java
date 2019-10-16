package com.futbol.FootballMidfieldersService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FootballMidfieldersServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FootballMidfieldersServiceApplication.class, args);
	}

}
