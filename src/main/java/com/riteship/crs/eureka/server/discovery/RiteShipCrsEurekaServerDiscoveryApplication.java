package com.riteship.crs.eureka.server.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RiteShipCrsEurekaServerDiscoveryApplication {

	static class FucntionalProgrammingExiercise {

	}

	public static void main(String[] args) {
		SpringApplication.run(RiteShipCrsEurekaServerDiscoveryApplication.class, args);
	}

}
