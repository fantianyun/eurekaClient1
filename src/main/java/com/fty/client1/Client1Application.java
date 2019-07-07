package com.fty.client1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
public class Client1Application {
	@RequestMapping("/")
	public String home() {
		return "Hello world";
	}

	public static void main(String[] args) {
		 SpringApplication.run(Client1Application.class, args);
	}

}
