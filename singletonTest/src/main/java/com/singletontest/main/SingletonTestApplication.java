package com.singletontest.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.singletontest")
public class SingletonTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingletonTestApplication.class, args);
	}

}