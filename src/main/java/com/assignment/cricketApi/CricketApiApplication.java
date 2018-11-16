package com.assignment.cricketApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.assignment.cricketApi.request.score")
@SpringBootApplication
@EnableFeignClients
public class CricketApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CricketApiApplication.class, args);
	}
}
