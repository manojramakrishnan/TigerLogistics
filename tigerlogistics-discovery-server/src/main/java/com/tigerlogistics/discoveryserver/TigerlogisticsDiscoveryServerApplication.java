package com.tigerlogistics.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class TigerlogisticsDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TigerlogisticsDiscoveryServerApplication.class, args);
		//This is a test
	}

}
