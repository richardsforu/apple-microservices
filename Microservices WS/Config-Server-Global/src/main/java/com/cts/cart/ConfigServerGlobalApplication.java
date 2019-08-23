package com.cts.cart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class ConfigServerGlobalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerGlobalApplication.class, args);
	}

}
