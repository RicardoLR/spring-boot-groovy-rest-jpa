package com.example.demogroovyapirest

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class DemoGroovyApiRestApplication implements CommandLineRunner {

	static void main(String[] args) {
		SpringApplication.run DemoGroovyApiRestApplication, args
	}

	@Override
	public void run(String... args) throws Exception {
		println "DemoGroovyApiRestApplication..."
	}


}
