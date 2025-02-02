package com.dev.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InitApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(InitApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}
