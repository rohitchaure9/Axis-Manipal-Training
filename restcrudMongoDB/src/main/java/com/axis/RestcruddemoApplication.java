package com.axis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestcruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestcruddemoApplication.class, args);
//		SpringApplication app = new SpringApplication(RestcruddemoApplication.class);
//        app.setDefaultProperties(Collections
//          .singletonMap("server.port", "8083"));
//        app.run(args);
	}
}
