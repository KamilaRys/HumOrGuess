package com.example.HumOrGuess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class HumOrGuessApplication {

	public static void main(String[] args) {
		SpringApplication.run(HumOrGuessApplication.class, args);
	}

}
