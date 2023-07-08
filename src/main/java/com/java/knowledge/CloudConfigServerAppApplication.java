package com.java.knowledge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudConfigServerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigServerAppApplication.class, args);
	}

}
