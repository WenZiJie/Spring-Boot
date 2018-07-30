package com.wen;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ReApplication {
	public static void main(String[] args) {
		   new SpringApplicationBuilder(ReApplication.class).web(true).run(args);
	}
}