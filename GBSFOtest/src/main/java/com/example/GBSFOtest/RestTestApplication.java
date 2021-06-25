package com.example.GBSFOtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com/example/GBSFOtest")
//@EnableJpaRepositories("com/example/GBSFOtest/dao")
public class RestTestApplication {

	public static void main(String[] args) {

		SpringApplication.run(RestTestApplication.class, args);
	}

}
