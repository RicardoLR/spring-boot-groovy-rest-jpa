package com.example.demogroovyapirest

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
class DemoGroovyApiRestApplication implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(DemoGroovyApiRestApplication.class);
	
	static void main(String[] args) {
		SpringApplication.run DemoGroovyApiRestApplication, args
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Running app DemoGroovyApiRestApplication...");
	}


}
