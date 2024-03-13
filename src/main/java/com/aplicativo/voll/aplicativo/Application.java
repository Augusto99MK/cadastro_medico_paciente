package com.aplicativo.voll.aplicativo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.aplicativo.voll"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}