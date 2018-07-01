package com.fare.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;

@SpringBootApplication

@EnableHystrixDashboard
@ComponentScan(basePackages = { "com.fare.business" })
public class Bootstrap {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(Bootstrap.class, args);
	}

}
