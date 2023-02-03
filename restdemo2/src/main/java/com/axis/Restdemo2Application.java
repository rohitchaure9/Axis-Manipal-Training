package com.axis;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Restdemo2Application {
	@GetMapping()
	public static void main(String[] args) {
		//SpringApplication.run(Restdemo2Application.class, args);
		SpringApplication app = new SpringApplication(Restdemo2Application.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8083"));
        app.run(args);
	}

}
