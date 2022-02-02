package com.example.testProject;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class TestApplication {

	public static void main(String[] args) {
		log.info("Start programs");
		SpringApplication.run(TestApplication.class, args);
	}
}
