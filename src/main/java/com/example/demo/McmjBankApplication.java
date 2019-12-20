package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"com.mcmj.controller", "com.mcmj.service"})
@EnableJpaRepositories(basePackages = "com.mcmj.repository")
@EntityScan("com.mcmj.model")
@SpringBootApplication
public class McmjBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(McmjBankApplication.class, args);
	}

}
